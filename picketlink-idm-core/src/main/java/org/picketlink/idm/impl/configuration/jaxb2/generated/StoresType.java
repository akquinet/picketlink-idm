//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.18 at 03:00:04 PM CET 
//


package org.picketlink.idm.impl.configuration.jaxb2.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute-stores" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="identity-stores" type="{urn:picketlink:idm:config:v1_0_0_ga}identity-storesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storesType", propOrder = {
    "attributeStores",
    "identityStores"
})
public class StoresType {

    @XmlElement(name = "attribute-stores", required = true)
    protected String attributeStores;
    @XmlElement(name = "identity-stores", required = true)
    protected IdentityStoresType identityStores;

    /**
     * Gets the value of the attributeStores property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeStores() {
        return attributeStores;
    }

    /**
     * Sets the value of the attributeStores property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeStores(String value) {
        this.attributeStores = value;
    }

    /**
     * Gets the value of the identityStores property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityStoresType }
     *     
     */
    public IdentityStoresType getIdentityStores() {
        return identityStores;
    }

    /**
     * Sets the value of the identityStores property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityStoresType }
     *     
     */
    public void setIdentityStores(IdentityStoresType value) {
        this.identityStores = value;
    }

}
