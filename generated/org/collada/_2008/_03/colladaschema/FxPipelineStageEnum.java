//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.14 at 01:09:26 AM MST 
//


package org.collada._2008._03.colladaschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fx_pipeline_stage_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fx_pipeline_stage_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TESSELLATION"/>
 *     &lt;enumeration value="VERTEX"/>
 *     &lt;enumeration value="GEOMETRY"/>
 *     &lt;enumeration value="FRAGMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fx_pipeline_stage_enum")
@XmlEnum
public enum FxPipelineStageEnum {

    TESSELLATION,
    VERTEX,
    GEOMETRY,
    FRAGMENT;

    public String value() {
        return name();
    }

    public static FxPipelineStageEnum fromValue(String v) {
        return valueOf(v);
    }

}
