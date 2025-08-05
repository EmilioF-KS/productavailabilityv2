
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
 *         <element name="GetAndCacheProductReply" type="{http://ei/product/get_and_cache_product_reply_pdt802x1}GetAndCacheProductReply"/>
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
    "getAndCacheProductReply"
})
@XmlRootElement(name = "GetAndCacheProductResponse")
public class GetAndCacheProductResponse {

    @XmlElement(name = "GetAndCacheProductReply", required = true, nillable = true)
    protected GetAndCacheProductReply getAndCacheProductReply;

    /**
     * Gets the value of the getAndCacheProductReply property.
     * 
     * @return
     *     possible object is
     *     {@link GetAndCacheProductReply }
     *     
     */
    public GetAndCacheProductReply getGetAndCacheProductReply() {
        return getAndCacheProductReply;
    }

    /**
     * Sets the value of the getAndCacheProductReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAndCacheProductReply }
     *     
     */
    public void setGetAndCacheProductReply(GetAndCacheProductReply value) {
        this.getAndCacheProductReply = value;
    }

}
