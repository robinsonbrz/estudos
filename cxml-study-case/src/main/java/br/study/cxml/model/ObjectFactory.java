//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.25 at 10:24:27 AM BRT 
//


package br.study.cxml.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.study.cxml.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TaskRegisterRequest_QNAME = new QName("http://study.com/TaskRegister", "taskRegisterRequest");
    private final static QName _TaskRegisterResponse_QNAME = new QName("http://study.com/TaskRegister", "taskRegisterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.study.cxml.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link ResponseMessage }
     * 
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link TaskEntity }
     * 
     */
    public TaskEntity createTaskEntity() {
        return new TaskEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Task }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://study.com/TaskRegister", name = "taskRegisterRequest")
    public JAXBElement<Task> createTaskRegisterRequest(Task value) {
        return new JAXBElement<Task>(_TaskRegisterRequest_QNAME, Task.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://study.com/TaskRegister", name = "taskRegisterResponse")
    public JAXBElement<ResponseMessage> createTaskRegisterResponse(ResponseMessage value) {
        return new JAXBElement<ResponseMessage>(_TaskRegisterResponse_QNAME, ResponseMessage.class, null, value);
    }

}
