
package com.productcache.webservice;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.productcache.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _SimpleFaultReply_QNAME = new QName("http://ei/product/product_cache_builder_pdt802x1", "SimpleFaultReply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.productcache.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAndCacheProduct }
     * 
     * @return
     *     the new instance of {@link GetAndCacheProduct }
     */
    public GetAndCacheProduct createGetAndCacheProduct() {
        return new GetAndCacheProduct();
    }

    /**
     * Create an instance of {@link GetAndCacheProductRequest }
     * 
     * @return
     *     the new instance of {@link GetAndCacheProductRequest }
     */
    public GetAndCacheProductRequest createGetAndCacheProductRequest() {
        return new GetAndCacheProductRequest();
    }

    /**
     * Create an instance of {@link GetAndCacheProductResponse }
     * 
     * @return
     *     the new instance of {@link GetAndCacheProductResponse }
     */
    public GetAndCacheProductResponse createGetAndCacheProductResponse() {
        return new GetAndCacheProductResponse();
    }

    /**
     * Create an instance of {@link GetAndCacheProductReply }
     * 
     * @return
     *     the new instance of {@link GetAndCacheProductReply }
     */
    public GetAndCacheProductReply createGetAndCacheProductReply() {
        return new GetAndCacheProductReply();
    }

    /**
     * Create an instance of {@link SimpleFault }
     * 
     * @return
     *     the new instance of {@link SimpleFault }
     */
    public SimpleFault createSimpleFault() {
        return new SimpleFault();
    }

    /**
     * Create an instance of {@link StatusInformation }
     * 
     * @return
     *     the new instance of {@link StatusInformation }
     */
    public StatusInformation createStatusInformation() {
        return new StatusInformation();
    }

    /**
     * Create an instance of {@link ErrorInformation }
     * 
     * @return
     *     the new instance of {@link ErrorInformation }
     */
    public ErrorInformation createErrorInformation() {
        return new ErrorInformation();
    }

    /**
     * Create an instance of {@link ProductAvailabilityInputs }
     * 
     * @return
     *     the new instance of {@link ProductAvailabilityInputs }
     */
    public ProductAvailabilityInputs createProductAvailabilityInputs() {
        return new ProductAvailabilityInputs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimpleFault }{@code >}
     */
    @XmlElementDecl(namespace = "http://ei/product/product_cache_builder_pdt802x1", name = "SimpleFaultReply")
    public JAXBElement<SimpleFault> createSimpleFaultReply(SimpleFault value) {
        return new JAXBElement<>(_SimpleFaultReply_QNAME, SimpleFault.class, null, value);
    }

}
