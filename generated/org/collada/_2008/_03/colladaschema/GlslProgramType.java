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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * a program is one or more shaders linked together
 * 
 * <p>Java class for glsl_program_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="glsl_program_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shader" type="{http://www.collada.org/2008/03/COLLADASchema}glsl_shader_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bind_attribute" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="semantic" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bind_uniform" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="param">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;group ref="{http://www.collada.org/2008/03/COLLADASchema}glsl_value_group"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "glsl_program_type", propOrder = {
    "shader",
    "bindAttribute",
    "bindUniform"
})
public class GlslProgramType {

    protected List<GlslShaderType> shader;
    @XmlElement(name = "bind_attribute")
    protected List<GlslProgramType.BindAttribute> bindAttribute;
    @XmlElement(name = "bind_uniform")
    protected List<GlslProgramType.BindUniform> bindUniform;

    /**
     * Gets the value of the shader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlslShaderType }
     * 
     * 
     */
    public List<GlslShaderType> getShader() {
        if (shader == null) {
            shader = new ArrayList<GlslShaderType>();
        }
        return this.shader;
    }

    /**
     * Gets the value of the bindAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlslProgramType.BindAttribute }
     * 
     * 
     */
    public List<GlslProgramType.BindAttribute> getBindAttribute() {
        if (bindAttribute == null) {
            bindAttribute = new ArrayList<GlslProgramType.BindAttribute>();
        }
        return this.bindAttribute;
    }

    /**
     * Gets the value of the bindUniform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindUniform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindUniform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlslProgramType.BindUniform }
     * 
     * 
     */
    public List<GlslProgramType.BindUniform> getBindUniform() {
        if (bindUniform == null) {
            bindUniform = new ArrayList<GlslProgramType.BindUniform>();
        }
        return this.bindUniform;
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
     *       &lt;choice>
     *         &lt;element name="semantic" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *       &lt;/choice>
     *       &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "semantic"
    })
    public static class BindAttribute {

        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String semantic;
        @XmlAttribute(name = "symbol", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String symbol;

        /**
         * Gets the value of the semantic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSemantic() {
            return semantic;
        }

        /**
         * Sets the value of the semantic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSemantic(String value) {
            this.semantic = value;
        }

        /**
         * Gets the value of the symbol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSymbol() {
            return symbol;
        }

        /**
         * Sets the value of the symbol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSymbol(String value) {
            this.symbol = value;
        }

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
     *       &lt;choice>
     *         &lt;element name="param">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;group ref="{http://www.collada.org/2008/03/COLLADASchema}glsl_value_group"/>
     *       &lt;/choice>
     *       &lt;attribute name="symbol" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "param",
        "bool",
        "bool2",
        "bool3",
        "bool4",
        "_float",
        "float2",
        "float3",
        "float4",
        "float2X2",
        "float3X3",
        "float4X4",
        "_int",
        "int2",
        "int3",
        "int4",
        "sampler1D",
        "sampler2D",
        "sampler3D",
        "samplerCUBE",
        "samplerRECT",
        "samplerDEPTH",
        "_enum",
        "array"
    })
    public static class BindUniform {

        protected GlslProgramType.BindUniform.Param param;
        protected Boolean bool;
        @XmlList
        @XmlElement(type = Boolean.class)
        protected List<Boolean> bool2;
        @XmlList
        @XmlElement(type = Boolean.class)
        protected List<Boolean> bool3;
        @XmlList
        @XmlElement(type = Boolean.class)
        protected List<Boolean> bool4;
        @XmlElement(name = "float")
        protected Double _float;
        @XmlList
        @XmlElement(type = Double.class)
        protected List<Double> float2;
        @XmlList
        @XmlElement(type = Double.class)
        protected List<Double> float3;
        @XmlList
        @XmlElement(type = Double.class)
        protected List<Double> float4;
        @XmlList
        @XmlElement(name = "float2x2", type = Double.class)
        protected List<Double> float2X2;
        @XmlList
        @XmlElement(name = "float3x3", type = Double.class)
        protected List<Double> float3X3;
        @XmlList
        @XmlElement(name = "float4x4", type = Double.class)
        protected List<Double> float4X4;
        @XmlElement(name = "int")
        protected Long _int;
        @XmlList
        @XmlElement(type = Long.class)
        protected List<Long> int2;
        @XmlList
        @XmlElement(type = Long.class)
        protected List<Long> int3;
        @XmlList
        @XmlElement(type = Long.class)
        protected List<Long> int4;
        protected FxSampler1DType sampler1D;
        protected FxSampler2DType sampler2D;
        protected FxSampler3DType sampler3D;
        protected FxSamplerCUBEType samplerCUBE;
        protected FxSamplerRECTType samplerRECT;
        protected FxSamplerDEPTHType samplerDEPTH;
        @XmlElement(name = "enum")
        protected String _enum;
        protected GlslArrayType array;
        @XmlAttribute(name = "symbol", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String symbol;

        /**
         * Gets the value of the param property.
         * 
         * @return
         *     possible object is
         *     {@link GlslProgramType.BindUniform.Param }
         *     
         */
        public GlslProgramType.BindUniform.Param getParam() {
            return param;
        }

        /**
         * Sets the value of the param property.
         * 
         * @param value
         *     allowed object is
         *     {@link GlslProgramType.BindUniform.Param }
         *     
         */
        public void setParam(GlslProgramType.BindUniform.Param value) {
            this.param = value;
        }

        /**
         * Gets the value of the bool property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBool() {
            return bool;
        }

        /**
         * Sets the value of the bool property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBool(Boolean value) {
            this.bool = value;
        }

        /**
         * Gets the value of the bool2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bool2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBool2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Boolean }
         * 
         * 
         */
        public List<Boolean> getBool2() {
            if (bool2 == null) {
                bool2 = new ArrayList<Boolean>();
            }
            return this.bool2;
        }

        /**
         * Gets the value of the bool3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bool3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBool3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Boolean }
         * 
         * 
         */
        public List<Boolean> getBool3() {
            if (bool3 == null) {
                bool3 = new ArrayList<Boolean>();
            }
            return this.bool3;
        }

        /**
         * Gets the value of the bool4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bool4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBool4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Boolean }
         * 
         * 
         */
        public List<Boolean> getBool4() {
            if (bool4 == null) {
                bool4 = new ArrayList<Boolean>();
            }
            return this.bool4;
        }

        /**
         * Gets the value of the float property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getFloat() {
            return _float;
        }

        /**
         * Sets the value of the float property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFloat(Double value) {
            this._float = value;
        }

        /**
         * Gets the value of the float2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the float2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFloat2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getFloat2() {
            if (float2 == null) {
                float2 = new ArrayList<Double>();
            }
            return this.float2;
        }

        /**
         * Gets the value of the float3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the float3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFloat3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getFloat3() {
            if (float3 == null) {
                float3 = new ArrayList<Double>();
            }
            return this.float3;
        }

        /**
         * Gets the value of the float4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the float4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFloat4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getFloat4() {
            if (float4 == null) {
                float4 = new ArrayList<Double>();
            }
            return this.float4;
        }

        /**
         * Gets the value of the float2X2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the float2X2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFloat2X2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getFloat2X2() {
            if (float2X2 == null) {
                float2X2 = new ArrayList<Double>();
            }
            return this.float2X2;
        }

        /**
         * Gets the value of the float3X3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the float3X3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFloat3X3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getFloat3X3() {
            if (float3X3 == null) {
                float3X3 = new ArrayList<Double>();
            }
            return this.float3X3;
        }

        /**
         * Gets the value of the float4X4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the float4X4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFloat4X4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Double }
         * 
         * 
         */
        public List<Double> getFloat4X4() {
            if (float4X4 == null) {
                float4X4 = new ArrayList<Double>();
            }
            return this.float4X4;
        }

        /**
         * Gets the value of the int property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getInt() {
            return _int;
        }

        /**
         * Sets the value of the int property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setInt(Long value) {
            this._int = value;
        }

        /**
         * Gets the value of the int2 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int2 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInt2().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getInt2() {
            if (int2 == null) {
                int2 = new ArrayList<Long>();
            }
            return this.int2;
        }

        /**
         * Gets the value of the int3 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int3 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInt3().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getInt3() {
            if (int3 == null) {
                int3 = new ArrayList<Long>();
            }
            return this.int3;
        }

        /**
         * Gets the value of the int4 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the int4 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInt4().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getInt4() {
            if (int4 == null) {
                int4 = new ArrayList<Long>();
            }
            return this.int4;
        }

        /**
         * Gets the value of the sampler1D property.
         * 
         * @return
         *     possible object is
         *     {@link FxSampler1DType }
         *     
         */
        public FxSampler1DType getSampler1D() {
            return sampler1D;
        }

        /**
         * Sets the value of the sampler1D property.
         * 
         * @param value
         *     allowed object is
         *     {@link FxSampler1DType }
         *     
         */
        public void setSampler1D(FxSampler1DType value) {
            this.sampler1D = value;
        }

        /**
         * Gets the value of the sampler2D property.
         * 
         * @return
         *     possible object is
         *     {@link FxSampler2DType }
         *     
         */
        public FxSampler2DType getSampler2D() {
            return sampler2D;
        }

        /**
         * Sets the value of the sampler2D property.
         * 
         * @param value
         *     allowed object is
         *     {@link FxSampler2DType }
         *     
         */
        public void setSampler2D(FxSampler2DType value) {
            this.sampler2D = value;
        }

        /**
         * Gets the value of the sampler3D property.
         * 
         * @return
         *     possible object is
         *     {@link FxSampler3DType }
         *     
         */
        public FxSampler3DType getSampler3D() {
            return sampler3D;
        }

        /**
         * Sets the value of the sampler3D property.
         * 
         * @param value
         *     allowed object is
         *     {@link FxSampler3DType }
         *     
         */
        public void setSampler3D(FxSampler3DType value) {
            this.sampler3D = value;
        }

        /**
         * Gets the value of the samplerCUBE property.
         * 
         * @return
         *     possible object is
         *     {@link FxSamplerCUBEType }
         *     
         */
        public FxSamplerCUBEType getSamplerCUBE() {
            return samplerCUBE;
        }

        /**
         * Sets the value of the samplerCUBE property.
         * 
         * @param value
         *     allowed object is
         *     {@link FxSamplerCUBEType }
         *     
         */
        public void setSamplerCUBE(FxSamplerCUBEType value) {
            this.samplerCUBE = value;
        }

        /**
         * Gets the value of the samplerRECT property.
         * 
         * @return
         *     possible object is
         *     {@link FxSamplerRECTType }
         *     
         */
        public FxSamplerRECTType getSamplerRECT() {
            return samplerRECT;
        }

        /**
         * Sets the value of the samplerRECT property.
         * 
         * @param value
         *     allowed object is
         *     {@link FxSamplerRECTType }
         *     
         */
        public void setSamplerRECT(FxSamplerRECTType value) {
            this.samplerRECT = value;
        }

        /**
         * Gets the value of the samplerDEPTH property.
         * 
         * @return
         *     possible object is
         *     {@link FxSamplerDEPTHType }
         *     
         */
        public FxSamplerDEPTHType getSamplerDEPTH() {
            return samplerDEPTH;
        }

        /**
         * Sets the value of the samplerDEPTH property.
         * 
         * @param value
         *     allowed object is
         *     {@link FxSamplerDEPTHType }
         *     
         */
        public void setSamplerDEPTH(FxSamplerDEPTHType value) {
            this.samplerDEPTH = value;
        }

        /**
         * Gets the value of the enum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnum() {
            return _enum;
        }

        /**
         * Sets the value of the enum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnum(String value) {
            this._enum = value;
        }

        /**
         * Gets the value of the array property.
         * 
         * @return
         *     possible object is
         *     {@link GlslArrayType }
         *     
         */
        public GlslArrayType getArray() {
            return array;
        }

        /**
         * Sets the value of the array property.
         * 
         * @param value
         *     allowed object is
         *     {@link GlslArrayType }
         *     
         */
        public void setArray(GlslArrayType value) {
            this.array = value;
        }

        /**
         * Gets the value of the symbol property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSymbol() {
            return symbol;
        }

        /**
         * Sets the value of the symbol property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSymbol(String value) {
            this.symbol = value;
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
         *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Param {

            @XmlAttribute(name = "ref", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "NCName")
            protected String ref;

            /**
             * Gets the value of the ref property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRef() {
                return ref;
            }

            /**
             * Sets the value of the ref property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRef(String value) {
                this.ref = value;
            }

        }

    }

}
