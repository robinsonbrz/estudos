//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.10.08 às 06:23:10 PM BRT 
//


package com.terry.study.types.employeebonus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeBonus" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeBonus"
})
@XmlRootElement(name = "employeeBonusResponse")
public class EmployeeBonusResponse {

    protected Double employeeBonus;

    /**
     * Obtém o valor da propriedade employeeBonus.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEmployeeBonus() {
        return employeeBonus;
    }

    /**
     * Define o valor da propriedade employeeBonus.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEmployeeBonus(Double value) {
        this.employeeBonus = value;
    }

}
