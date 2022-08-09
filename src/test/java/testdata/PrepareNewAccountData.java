package testdata;

import models.NewAccountModel;
import utils.FakeMessageGenerator;


public class PrepareNewAccountData {
    public static NewAccountModel getValidDate() {
        return NewAccountModel
                .builder()
                .accountName(FakeMessageGenerator.generateAccountName())
                .phone(FakeMessageGenerator.generatePhone())
                .fax(FakeMessageGenerator.generateFax())
                .website(FakeMessageGenerator.generateWebsite())
                .type("Analyst")
                .employees(FakeMessageGenerator.generateEmployees())
                .industry("Finance")
                .annualRevenue(FakeMessageGenerator.generateAnnualRevenue())
                .description(FakeMessageGenerator.generateDiscription())
                .billingStreet(FakeMessageGenerator.generateBillingStreet())
                .billingCity(FakeMessageGenerator.generateBillingCity())
                .billingState(FakeMessageGenerator.generateBillingState())
                .billingZipCode(FakeMessageGenerator.generateBillingZipCode())
                .billingCountry(FakeMessageGenerator.generateBillingCountry())
                .shippingStreet(FakeMessageGenerator.generateShippingStreet())
                .shippingCity(FakeMessageGenerator.generateShippingCity())
                .shippingState(FakeMessageGenerator.generateShippingState())
                .shippingZipCode(FakeMessageGenerator.generateShippingZipCode())
                .shippingCountry(FakeMessageGenerator.generateShippingCountry())

                .build();
    }
}
