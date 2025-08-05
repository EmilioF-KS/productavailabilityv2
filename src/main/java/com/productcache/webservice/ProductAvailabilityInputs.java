
package com.productcache.webservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAvailabilityInputs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductAvailabilityInputs">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductAvailabilityCheckIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="StateOrProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MarketSegmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EnterpriseMarketSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="WritingCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProductContractTypeGIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAvailabilityInputs", namespace = "http://ei/product/product_availability_inputs_pdt802x1", propOrder = {
    "productAvailabilityCheckIndicator",
    "stateOrProvinceCode",
    "countryCode",
    "marketSegmentTypeCode",
    "enterpriseMarketSegmentCode",
    "writingCompanyCode",
    "productContractTypeGIN"
})
public class ProductAvailabilityInputs {

    @XmlElement(name = "ProductAvailabilityCheckIndicator")
    protected Boolean productAvailabilityCheckIndicator;
    @XmlElement(name = "StateOrProvinceCode")
    protected String stateOrProvinceCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "MarketSegmentTypeCode")
    protected String marketSegmentTypeCode;
    @XmlElement(name = "EnterpriseMarketSegmentCode")
    protected String enterpriseMarketSegmentCode;
    @XmlElement(name = "WritingCompanyCode")
    protected String writingCompanyCode;
    @XmlElement(name = "ProductContractTypeGIN")
    protected String productContractTypeGIN;

    /**
     * Gets the value of the productAvailabilityCheckIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductAvailabilityCheckIndicator() {
        return productAvailabilityCheckIndicator;
    }

    /**
     * Sets the value of the productAvailabilityCheckIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductAvailabilityCheckIndicator(Boolean value) {
        this.productAvailabilityCheckIndicator = value;
    }

    /**
     * Gets the value of the stateOrProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    /**
     * Sets the value of the stateOrProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvinceCode(String value) {
        this.stateOrProvinceCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the marketSegmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSegmentTypeCode() {
        return marketSegmentTypeCode;
    }

    /**
     * Sets the value of the marketSegmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSegmentTypeCode(String value) {
        this.marketSegmentTypeCode = value;
    }

    /**
     * Gets the value of the enterpriseMarketSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseMarketSegmentCode() {
        return enterpriseMarketSegmentCode;
    }

    /**
     * Sets the value of the enterpriseMarketSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseMarketSegmentCode(String value) {
        this.enterpriseMarketSegmentCode = value;
    }

    /**
     * Gets the value of the writingCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWritingCompanyCode() {
        return writingCompanyCode;
    }

    /**
     * Sets the value of the writingCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWritingCompanyCode(String value) {
        this.writingCompanyCode = value;
    }

    /**
     * Gets the value of the productContractTypeGIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductContractTypeGIN() {
        return productContractTypeGIN;
    }

    /**
     * Sets the value of the productContractTypeGIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductContractTypeGIN(String value) {
        this.productContractTypeGIN = value;
    }

}
