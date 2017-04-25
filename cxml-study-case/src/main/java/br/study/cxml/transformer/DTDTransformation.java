package br.study.cxml.transformer;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;

import br.study.cxml.model.Task;

public class DTDTransformation extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		StringWriter writer = new StringWriter();

		Task task = (Task) src;

		try {

			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.newDocument();
			DOMImplementation domImpl = doc.getImplementation();
			DocumentType doctype = domImpl.createDocumentType("Task", "SYSTEM", "tasks.dtd");

			// Define Elements
			Element rootElement = doc.createElement("Task");
			Element name = doc.createElement("Name");
			Element description = doc.createElement("Description");
			Element target = doc.createElement("Target");

			// Define Structure
			doc.appendChild(doctype);
			doc.appendChild(rootElement);
			rootElement.appendChild(name);
			rootElement.appendChild(description);
			rootElement.appendChild(target);

			// Define field contents
			name.setTextContent(task.getTask().getTaskName());
			description.setTextContent(task.getTask().getTaskDescription());
			target.setTextContent(task.getTask().getTargetDate());

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doctype.getSystemId());

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(writer);

			transformer.transform(source, result);

			System.out.println(writer.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return writer.toString();
	}

}
