//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.04 at 10:53:39 PM CST 
//


package org.collada._2005._11.colladaschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}asset" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}lookat"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}matrix"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}rotate"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}scale"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}skew"/>
 *           &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}translate"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_camera" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_controller" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_geometry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_light" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}instance_node" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}node" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.collada.org/2005/11/COLLADASchema}extra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="type" type="{http://www.collada.org/2005/11/COLLADASchema}NodeType" default="NODE" />
 *       &lt;attribute name="layer" type="{http://www.collada.org/2005/11/COLLADASchema}ListOfNames" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset",
    "lookatsAndMatrixesAndRotates",
    "instanceCameras",
    "instanceControllers",
    "instanceGeometries",
    "instanceLights",
    "instanceNodes",
    "nodes",
    "extras"
})
@XmlRootElement(name = "node")
public class Node {

    protected Asset asset;
    @XmlElementRefs({
        @XmlElementRef(name = "rotate", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = Rotate.class),
        @XmlElementRef(name = "matrix", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = Matrix.class),
        @XmlElementRef(name = "translate", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "skew", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = Skew.class),
        @XmlElementRef(name = "scale", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = JAXBElement.class),
        @XmlElementRef(name = "lookat", namespace = "http://www.collada.org/2005/11/COLLADASchema", type = Lookat.class)
    })
    protected List<Object> lookatsAndMatrixesAndRotates;
    @XmlElement(name = "instance_camera")
    protected List<InstanceWithExtra> instanceCameras;
    @XmlElement(name = "instance_controller")
    protected List<InstanceController> instanceControllers;
    @XmlElement(name = "instance_geometry")
    protected List<InstanceGeometry> instanceGeometries;
    @XmlElement(name = "instance_light")
    protected List<InstanceWithExtra> instanceLights;
    @XmlElement(name = "instance_node")
    protected List<InstanceWithExtra> instanceNodes;
    @XmlElement(name = "node")
    protected List<Node> nodes;
    @XmlElement(name = "extra")
    protected List<Extra> extras;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "sid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String sid;
    @XmlAttribute(name = "type")
    protected NodeType type;
    @XmlAttribute(name = "layer")
    protected List<String> layers;

    /**
     * 
     * 						The node element may contain an asset element.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setAsset(Asset value) {
        this.asset = value;
    }

    /**
     * 
     * 							The node element may contain any number of lookat elements.
     * 							Gets the value of the lookatsAndMatrixesAndRotates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookatsAndMatrixesAndRotates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookatsAndMatrixesAndRotates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rotate }
     * {@link Skew }
     * {@link JAXBElement }{@code <}{@link TargetableFloat3 }{@code >}
     * {@link Lookat }
     * {@link JAXBElement }{@code <}{@link TargetableFloat3 }{@code >}
     * {@link Matrix }
     * 
     * 
     */
    public List<Object> getLookatsAndMatrixesAndRotates() {
        if (lookatsAndMatrixesAndRotates == null) {
            lookatsAndMatrixesAndRotates = new ArrayList<Object>();
        }
        return this.lookatsAndMatrixesAndRotates;
    }

    /**
     * 
     * 						The node element may instance any number of camera objects.
     * 						Gets the value of the instanceCameras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceCameras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceCameras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceWithExtra }
     * 
     * 
     */
    public List<InstanceWithExtra> getInstanceCameras() {
        if (instanceCameras == null) {
            instanceCameras = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceCameras;
    }

    /**
     * 
     * 						The node element may instance any number of controller objects.
     * 						Gets the value of the instanceControllers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceControllers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceControllers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceController }
     * 
     * 
     */
    public List<InstanceController> getInstanceControllers() {
        if (instanceControllers == null) {
            instanceControllers = new ArrayList<InstanceController>();
        }
        return this.instanceControllers;
    }

    /**
     * 
     * 						The node element may instance any number of geometry objects.
     * 						Gets the value of the instanceGeometries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceGeometries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceGeometries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceGeometry }
     * 
     * 
     */
    public List<InstanceGeometry> getInstanceGeometries() {
        if (instanceGeometries == null) {
            instanceGeometries = new ArrayList<InstanceGeometry>();
        }
        return this.instanceGeometries;
    }

    /**
     * 
     * 						The node element may instance any number of light objects.
     * 						Gets the value of the instanceLights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceLights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceLights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceWithExtra }
     * 
     * 
     */
    public List<InstanceWithExtra> getInstanceLights() {
        if (instanceLights == null) {
            instanceLights = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceLights;
    }

    /**
     * 
     * 						The node element may instance any number of node elements or hierarchies objects.
     * 						Gets the value of the instanceNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instanceNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstanceNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstanceWithExtra }
     * 
     * 
     */
    public List<InstanceWithExtra> getInstanceNodes() {
        if (instanceNodes == null) {
            instanceNodes = new ArrayList<InstanceWithExtra>();
        }
        return this.instanceNodes;
    }

    /**
     * 
     * 						The node element may be hierarchical and be the parent of any number of other node elements.
     * 						Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Node }
     * 
     * 
     */
    public List<Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    /**
     * 
     * 						The extra element may appear any number of times.
     * 						Gets the value of the extras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extra }
     * 
     * 
     */
    public List<Extra> getExtras() {
        if (extras == null) {
            extras = new ArrayList<Extra>();
        }
        return this.extras;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link NodeType }
     *     
     */
    public NodeType getType() {
        if (type == null) {
            return NodeType.NODE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeType }
     *     
     */
    public void setType(NodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the layers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLayers() {
        if (layers == null) {
            layers = new ArrayList<String>();
        }
        return this.layers;
    }

}
