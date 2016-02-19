package com.hdfcergo.cattletagging.LeadDetails;

/**
 * Created by davesuda on 2/11/2016.
 */
public class LeadDataDummy {


    public String getBeneficieryName() {
        return beneficieryName;
    }

    public void setBeneficieryName(String beneficieryName) {
        this.beneficieryName = beneficieryName;
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo;
    }

    public String getLeadNo() {
        return leadNo;
    }

    public void setLeadNo(String leadNo) {
        this.leadNo = leadNo;
    }

    public String getLeadGeneratedDate() {
        return leadGeneratedDate;
    }

    public void setLeadGeneratedDate(String leadGeneratedDate) {
        this.leadGeneratedDate = leadGeneratedDate;
    }

    public String getNoOfCattles() {
        return noOfCattles;
    }

    public void setNoOfCattles(String noOfCattles) {
        this.noOfCattles = noOfCattles;
    }

    String beneficieryName,loanNo,leadNo,leadGeneratedDate,noOfCattles;

    LeadDataDummy(String benName,String loanNo,String leadNo,String leadDate,String cattleNo)
    {
        this.beneficieryName = benName;
        this.loanNo = loanNo;
        this.leadNo = leadNo;
        this.leadGeneratedDate = leadDate;
        this.noOfCattles = cattleNo;

    }
}
