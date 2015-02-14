//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.14 at 01:09:26 AM MST 
//


package org.collada._2008._03.colladaschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 			Defines a set of texturing commands that will be converted into multitexturing operations using glTexEnv in regular and combiner mode.
 * 			
 * 
 * <p>Java class for gles_texture_pipeline_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gles_texture_pipeline_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="texcombiner" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texcombiner_command_type"/>
 *         &lt;element name="texenv" type="{http://www.collada.org/2008/03/COLLADASchema}gles_texenv_command_type"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type"/>
 *       &lt;/choice>
 *       &lt;attribute name="sid" type="{http://www.collada.org/2008/03/COLLADASchema}sid_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gles_texture_pipeline_type", propOrder = {
    "texcombinerOrTexenvOrExtra"
})
public class GlesTexturePipelineType {

    @XmlElements({
        @XmlElement(name = "texcombiner", type = GlesTexcombinerCommandType.class),
        @XmlElement(name = "texenv", type = GlesTexenvCommandType.class),
        @XmlElement(name = "extra", type = ExtraType.class)
    })
    protected List<Object> texcombinerOrTexenvOrExtra;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sid;

    /**
     * Gets the value of the texcombinerOrTexenvOrExtra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texcombinerOrTexenvOrExtra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexcombinerOrTexenvOrExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlesTexcombinerCommandType }
     * {@link GlesTexenvCommandType }
     * {@link ExtraType }
     * 
     * 
     */
    public List<Object> getTexcombinerOrTexenvOrExtra() {
        if (texcombinerOrTexenvOrExtra == null) {
            texcombinerOrTexenvOrExtra = new ArrayList<Object>();
        }
        return this.texcombinerOrTexenvOrExtra;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

}
