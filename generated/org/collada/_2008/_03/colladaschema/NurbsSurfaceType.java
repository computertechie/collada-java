//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.14 at 01:09:26 AM MST 
//


package org.collada._2008._03.colladaschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nurbs_surface_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nurbs_surface_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.collada.org/2008/03/COLLADASchema}source_type" maxOccurs="unbounded"/>
 *         &lt;element name="control_vertices">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_type" maxOccurs="unbounded"/>
 *                   &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="degree_u" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}uint_type" />
 *       &lt;attribute name="closed_u" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="degree_v" use="required" type="{http://www.collada.org/2008/03/COLLADASchema}uint_type" />
 *       &lt;attribute name="closed_v" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nurbs_surface_type", propOrder = {
    "source",
    "controlVertices",
    "extra"
})
public class NurbsSurfaceType {

    @XmlElement(required = true)
    protected List<SourceType> source;
    @XmlElement(name = "control_vertices", required = true)
    protected NurbsSurfaceType.ControlVertices controlVertices;
    protected List<ExtraType> extra;
    @XmlAttribute(name = "degree_u", required = true)
    protected BigInteger degreeU;
    @XmlAttribute(name = "closed_u")
    protected Boolean closedU;
    @XmlAttribute(name = "degree_v", required = true)
    protected BigInteger degreeV;
    @XmlAttribute(name = "closed_v")
    protected Boolean closedV;

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceType }
     * 
     * 
     */
    public List<SourceType> getSource() {
        if (source == null) {
            source = new ArrayList<SourceType>();
        }
        return this.source;
    }

    /**
     * Gets the value of the controlVertices property.
     * 
     * @return
     *     possible object is
     *     {@link NurbsSurfaceType.ControlVertices }
     *     
     */
    public NurbsSurfaceType.ControlVertices getControlVertices() {
        return controlVertices;
    }

    /**
     * Sets the value of the controlVertices property.
     * 
     * @param value
     *     allowed object is
     *     {@link NurbsSurfaceType.ControlVertices }
     *     
     */
    public void setControlVertices(NurbsSurfaceType.ControlVertices value) {
        this.controlVertices = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraType }
     * 
     * 
     */
    public List<ExtraType> getExtra() {
        if (extra == null) {
            extra = new ArrayList<ExtraType>();
        }
        return this.extra;
    }

    /**
     * Gets the value of the degreeU property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegreeU() {
        return degreeU;
    }

    /**
     * Sets the value of the degreeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegreeU(BigInteger value) {
        this.degreeU = value;
    }

    /**
     * Gets the value of the closedU property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedU() {
        if (closedU == null) {
            return false;
        } else {
            return closedU;
        }
    }

    /**
     * Sets the value of the closedU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedU(Boolean value) {
        this.closedU = value;
    }

    /**
     * Gets the value of the degreeV property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDegreeV() {
        return degreeV;
    }

    /**
     * Sets the value of the degreeV property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDegreeV(BigInteger value) {
        this.degreeV = value;
    }

    /**
     * Gets the value of the closedV property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClosedV() {
        if (closedV == null) {
            return false;
        } else {
            return closedV;
        }
    }

    /**
     * Sets the value of the closedV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosedV(Boolean value) {
        this.closedV = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="input" type="{http://www.collada.org/2008/03/COLLADASchema}input_local_type" maxOccurs="unbounded"/>
     *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
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
        "input",
        "extra"
    })
    public static class ControlVertices {

        @XmlElement(required = true)
        protected List<InputLocalType> input;
        protected List<ExtraType> extra;

        /**
         * Gets the value of the input property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the input property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInput().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InputLocalType }
         * 
         * 
         */
        public List<InputLocalType> getInput() {
            if (input == null) {
                input = new ArrayList<InputLocalType>();
            }
            return this.input;
        }

        /**
         * Gets the value of the extra property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extra property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtra().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExtraType }
         * 
         * 
         */
        public List<ExtraType> getExtra() {
            if (extra == null) {
                extra = new ArrayList<ExtraType>();
            }
            return this.extra;
        }

    }

}
