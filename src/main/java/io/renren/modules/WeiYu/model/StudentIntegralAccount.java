package io.renren.modules.WeiYu.model;

import java.util.Date;

public class StudentIntegralAccount {
    private String studentintegralaccountmainid;

    private String studentintegralaccountid;

    private Integer studentintegralaccounttype;

    private Date studentintegralaccountoccurrencedate;

    private String studentintegralaccountobtainway;

    private String studentintegralaccountgoodstype;

    private Integer studentintegralaccountgoodsquantity;

    private Integer studentintegralaccountpaymentaccount;

    private Integer studentintegralaccountremainderpaymentaccount;

    private String studentintegralsitesstandbyone;

    private Integer studentintegralsitesstandbytwo;

    public String getStudentintegralaccountmainid() {
        return studentintegralaccountmainid;
    }

    public void setStudentintegralaccountmainid(String studentintegralaccountmainid) {
        this.studentintegralaccountmainid = studentintegralaccountmainid == null ? null : studentintegralaccountmainid.trim();
    }

    public String getStudentintegralaccountid() {
        return studentintegralaccountid;
    }

    public void setStudentintegralaccountid(String studentintegralaccountid) {
        this.studentintegralaccountid = studentintegralaccountid == null ? null : studentintegralaccountid.trim();
    }

    public Integer getStudentintegralaccounttype() {
        return studentintegralaccounttype;
    }

    public void setStudentintegralaccounttype(Integer studentintegralaccounttype) {
        this.studentintegralaccounttype = studentintegralaccounttype;
    }

    public Date getStudentintegralaccountoccurrencedate() {
        return studentintegralaccountoccurrencedate;
    }

    public void setStudentintegralaccountoccurrencedate(Date studentintegralaccountoccurrencedate) {
        this.studentintegralaccountoccurrencedate = studentintegralaccountoccurrencedate;
    }

    public String getStudentintegralaccountobtainway() {
        return studentintegralaccountobtainway;
    }

    public void setStudentintegralaccountobtainway(String studentintegralaccountobtainway) {
        this.studentintegralaccountobtainway = studentintegralaccountobtainway == null ? null : studentintegralaccountobtainway.trim();
    }

    public String getStudentintegralaccountgoodstype() {
        return studentintegralaccountgoodstype;
    }

    public void setStudentintegralaccountgoodstype(String studentintegralaccountgoodstype) {
        this.studentintegralaccountgoodstype = studentintegralaccountgoodstype == null ? null : studentintegralaccountgoodstype.trim();
    }

    public Integer getStudentintegralaccountgoodsquantity() {
        return studentintegralaccountgoodsquantity;
    }

    public void setStudentintegralaccountgoodsquantity(Integer studentintegralaccountgoodsquantity) {
        this.studentintegralaccountgoodsquantity = studentintegralaccountgoodsquantity;
    }

    public Integer getStudentintegralaccountpaymentaccount() {
        return studentintegralaccountpaymentaccount;
    }

    public void setStudentintegralaccountpaymentaccount(Integer studentintegralaccountpaymentaccount) {
        this.studentintegralaccountpaymentaccount = studentintegralaccountpaymentaccount;
    }

    public Integer getStudentintegralaccountremainderpaymentaccount() {
        return studentintegralaccountremainderpaymentaccount;
    }

    public void setStudentintegralaccountremainderpaymentaccount(Integer studentintegralaccountremainderpaymentaccount) {
        this.studentintegralaccountremainderpaymentaccount = studentintegralaccountremainderpaymentaccount;
    }

    public String getStudentintegralsitesstandbyone() {
        return studentintegralsitesstandbyone;
    }

    public void setStudentintegralsitesstandbyone(String studentintegralsitesstandbyone) {
        this.studentintegralsitesstandbyone = studentintegralsitesstandbyone == null ? null : studentintegralsitesstandbyone.trim();
    }

    public Integer getStudentintegralsitesstandbytwo() {
        return studentintegralsitesstandbytwo;
    }

    public void setStudentintegralsitesstandbytwo(Integer studentintegralsitesstandbytwo) {
        this.studentintegralsitesstandbytwo = studentintegralsitesstandbytwo;
    }
}