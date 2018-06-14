package io.renren.modules.WeiYu.model;

import java.util.Date;

public class StudentIntegralAccount {
    private String studentintegralaccountid;

    private String studentintegralaccounttype;

    private Date studentintegralaccountoccurrencedate;

    private String studentintegralaccountobtainway;

    private String studentintegralaccountgoodstype;

    private Integer studentintegralaccountgoodsquantity;

    private Integer studentintegralaccountpaymentaccount;

    private Integer studentintegralaccountremainderpaymentaccount;

    private String studentintegralsitesstandbyone;

    private Integer studentintegralsitesstandbytwo;

    public String getStudentintegralaccountid() {
        return studentintegralaccountid;
    }

    public void setStudentintegralaccountid(String studentintegralaccountid) {
        this.studentintegralaccountid = studentintegralaccountid == null ? null : studentintegralaccountid.trim();
    }

    public String getStudentintegralaccounttype() {
        return studentintegralaccounttype;
    }

    public void setStudentintegralaccounttype(String studentintegralaccounttype) {
        this.studentintegralaccounttype = studentintegralaccounttype == null ? null : studentintegralaccounttype.trim();
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