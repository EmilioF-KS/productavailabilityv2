
package com.productcache.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GetAndCacheProductRequest" type="{http://ei/product/get_and_cache_product_request_pdt802x1}GetAndCacheProductRequest"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAndCacheProductRequest"
})
@XmlRootElement(name = "GetAndCacheProduct")
public class GetAndCacheProduct {

    @XmlElement(name = "GetAndCacheProductRequest", required = true, nillable = true)
    protected GetAndCacheProductRequest getAndCacheProductRequest;

    /**
     * Gets the value of the getAndCacheProductRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetAndCacheProductRequest }
     *     
     */
    public GetAndCacheProductRequest getGetAndCacheProductRequest() {
        return getAndCacheProductRequest;
    }

    /**
     * Sets the value of the getAndCacheProductRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAndCacheProductRequest }
     *     
     */
    public void setGetAndCacheProductRequest(GetAndCacheProductRequest value) {
        this.getAndCacheProductRequest = value;
    }

}
