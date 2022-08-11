package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewAccountModel {
    private String accountName;
    private String phone;
    private String fax;
    private String website;
    private String type;
    private String employees;
    private String industry;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingZipCode;
    private String billingCountry;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingZipCode;
    private String shippingCountry;


}
