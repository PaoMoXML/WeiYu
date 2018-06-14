package io.renren.modules.WeiYu.model;

public class Company {
    private String companyid;

    private String companyname;

    private String companyunifiedsocialcreditcode;

    private String companybankofdeposit;

    private String companybankaccount;

    private String companyaddress;

    private String companytelephone;

    private String companylegalperson;

    private String companystandbyone;

    private Integer companystandbytwo;

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyunifiedsocialcreditcode() {
        return companyunifiedsocialcreditcode;
    }

    public void setCompanyunifiedsocialcreditcode(String companyunifiedsocialcreditcode) {
        this.companyunifiedsocialcreditcode = companyunifiedsocialcreditcode == null ? null : companyunifiedsocialcreditcode.trim();
    }

    public String getCompanybankofdeposit() {
        return companybankofdeposit;
    }

    public void setCompanybankofdeposit(String companybankofdeposit) {
        this.companybankofdeposit = companybankofdeposit == null ? null : companybankofdeposit.trim();
    }

    public String getCompanybankaccount() {
        return companybankaccount;
    }

    public void setCompanybankaccount(String companybankaccount) {
        this.companybankaccount = companybankaccount == null ? null : companybankaccount.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanytelephone() {
        return companytelephone;
    }

    public void setCompanytelephone(String companytelephone) {
        this.companytelephone = companytelephone == null ? null : companytelephone.trim();
    }

    public String getCompanylegalperson() {
        return companylegalperson;
    }

    public void setCompanylegalperson(String companylegalperson) {
        this.companylegalperson = companylegalperson == null ? null : companylegalperson.trim();
    }

    public String getCompanystandbyone() {
        return companystandbyone;
    }

    public void setCompanystandbyone(String companystandbyone) {
        this.companystandbyone = companystandbyone == null ? null : companystandbyone.trim();
    }

    public Integer getCompanystandbytwo() {
        return companystandbytwo;
    }

    public void setCompanystandbytwo(Integer companystandbytwo) {
        this.companystandbytwo = companystandbytwo;
    }
}