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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for instance_kinematics_scene_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance_kinematics_scene_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{http://www.collada.org/2008/03/COLLADASchema}asset_type" minOccurs="0"/>
 *         &lt;element name="newparam" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_newparam_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="setparam" type="{http://www.collada.org/2008/03/COLLADASchema}kinematics_setparam_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bind_kinematics_model" type="{http://www.collada.org/2008/03/COLLADASchema}bind_kinematics_model_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bind_joint_axis" type="{http://www.collada.org/2008/03/COLLADASchema}bind_joint_axis_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extra" type="{http://www.collada.org/2008/03/COLLADASchema}extra_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="url" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="sid" type="{http://www.collada.org/2008/03/COLLADASchema}sid_type" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance_kinematics_scene_type", propOrder = {
    "asset",
    "newparam",
    "setparam",
    "bindKinematicsModel",
    "bindJointAxis",
    "extra"
})
public class InstanceKinematicsSceneType {

    protected AssetType asset;
    protected List<KinematicsNewparamType> newparam;
    protected List<KinematicsSetparamType> setparam;
    @XmlElement(name = "bind_kinematics_model")
    protected List<BindKinematicsModelType> bindKinematicsModel;
    @XmlElement(name = "bind_joint_axis")
    protected List<BindJointAxisType> bindJointAxis;
    protected List<ExtraType> extra;
    @XmlAttribute(name = "url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sid;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link AssetType }
     *     
     */
    public AssetType getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetType }
     *     
     */
    public void setAsset(AssetType value) {
        this.asset = value;
    }

    /**
     * Gets the value of the newparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewparam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KinematicsNewparamType }
     * 
     * 
     */
    public List<KinematicsNewparamType> getNewparam() {
        if (newparam == null) {
            newparam = new ArrayList<KinematicsNewparamType>();
        }
        return this.newparam;
    }

    /**
     * Gets the value of the setparam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setparam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetparam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KinematicsSetparamType }
     * 
     * 
     */
    public List<KinematicsSetparamType> getSetparam() {
        if (setparam == null) {
            setparam = new ArrayList<KinematicsSetparamType>();
        }
        return this.setparam;
    }

    /**
     * Gets the value of the bindKinematicsModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindKinematicsModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindKinematicsModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindKinematicsModelType }
     * 
     * 
     */
    public List<BindKinematicsModelType> getBindKinematicsModel() {
        if (bindKinematicsModel == null) {
            bindKinematicsModel = new ArrayList<BindKinematicsModelType>();
        }
        return this.bindKinematicsModel;
    }

    /**
     * Gets the value of the bindJointAxis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindJointAxis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindJointAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindJointAxisType }
     * 
     * 
     */
    public List<BindJointAxisType> getBindJointAxis() {
        if (bindJointAxis == null) {
            bindJointAxis = new ArrayList<BindJointAxisType>();
        }
        return this.bindJointAxis;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
