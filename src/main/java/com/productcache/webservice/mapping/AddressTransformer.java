/*
 * Decompiled with CFR 0.152.
 */
package com.productcache.webservice.mapping;

import com.productcache.webservice.mapping.CRM_ADDRESS;

public class AddressTransformer {
    String StateOrProvinceAbbreviation;
    String CountryName;
    String PostalCode;
    String CityName;
    String CountyName;
    String AddressLine3;
    String CountryAbbreviation;
    String AddressLine2;
    String AddressLine1;
    String ISOCountryCode;
    String StateOrProvinceName;
    String PostalStateAbbreviation;
    String CountryCode;
    String StateOrProvinceCode;
    String LocationPlaceCode;

    public void setStateOrProvinceAbbreviation() {
        this.StateOrProvinceAbbreviation = new CRM_ADDRESS().getCRM_ST_PROV_ABBR();
    }

    public void setCountryName() {
        this.CountryName = new CRM_ADDRESS().getCRM_CNTRY_NAME();
    }

    public void setPostalCode() {
        this.PostalCode = new CRM_ADDRESS().getCRM_ADDR_LOC_PSTL_C();
    }

    public void setCityName() {
        this.CityName = new CRM_ADDRESS().getCRM_CITY_NAME();
    }

    public void setCountyName() {
        this.CountyName = new CRM_ADDRESS().getCRM_CNTY_NAME();
    }

    public void setAddressLine3() {
        this.AddressLine3 = new CRM_ADDRESS().getCRM_ADDR_LINE3();
    }

    public void setCountryAbbreviation() {
        this.CountryAbbreviation = new CRM_ADDRESS().getCRM_CNTRY_ABBR();
    }

    public void setAddressLine2() {
        this.AddressLine2 = new CRM_ADDRESS().getCRM_ADDR_LINE2();
    }

    public void setAddressLine1() {
        this.AddressLine1 = new CRM_ADDRESS().getCRM_ADDR_LINE1();
    }

    public void setISOCountryCode() {
        this.ISOCountryCode = new CRM_ADDRESS().getCRM_ISO_CNTRY_C();
    }

    public void setStateOrProvinceName() {
        this.StateOrProvinceName = new CRM_ADDRESS().getCRM_ST_PROV_NAME();
    }

    public void setPostalStateAbbreviation() {
        this.PostalStateAbbreviation = new CRM_ADDRESS().getCRM_PSTL_ST_C();
    }

    public void setCountryCode() {
        this.CountryCode = new CRM_ADDRESS().getCRM_CNTRY_C();
    }

    public void setStateOrProvinceCode() {
        this.StateOrProvinceCode = new CRM_ADDRESS().getCRM_ST_PROV_C();
    }

    public void setLocationPlaceCode() {
        this.LocationPlaceCode = new CRM_ADDRESS().getCRM_MCNALLY_PLACE_C();
    }
}
