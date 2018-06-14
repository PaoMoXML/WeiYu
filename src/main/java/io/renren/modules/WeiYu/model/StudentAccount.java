package io.renren.modules.WeiYu.model;

import java.util.Date;

public class StudentAccount {
    private String studentaccountmainid;

    private String studentaccountid;

    private Integer studentaccounttype;

    private Date studentaccountoccurrencedate;

    private String studentaccounttrainingclassid;

    private String studentaccountpaymentmethod;

    private String studentaccountpaymentaccount;

    private Integer studentaccountclassunitprice;

    private Integer studentaccountclassnumbers;

    private Integer studentaccountremainderclassnumbers;

    private String studentsitesstandbyone;

    private Integer studentsitesstandbytwo;

    public String getStudentaccountmainid() {
        return studentaccountmainid;
    }

    public void setStudentaccountmainid(String studentaccountmainid) {
        this.studentaccountmainid = studentaccountmainid == null ? null : studentaccountmainid.trim();
    }

    public String getStudentaccountid() {
        return studentaccountid;
    }

    public void setStudentaccountid(String studentaccountid) {
        this.studentaccountid = studentaccountid == null ? null : studentaccountid.trim();
    }

    public Integer getStudentaccounttype() {
        return studentaccounttype;
    }

    public void setStudentaccounttype(Integer studentaccounttype) {
        this.studentaccounttype = studentaccounttype;
    }

    public Date getStudentaccountoccurrencedate() {
        return studentaccountoccurrencedate;
    }

    public void setStudentaccountoccurrencedate(Date studentaccountoccurrencedate) {
        this.studentaccountoccurrencedate = studentaccountoccurrencedate;
    }

    public String getStudentaccounttrainingclassid() {
        return studentaccounttrainingclassid;
    }

    public void setStudentaccounttrainingclassid(String studentaccounttrainingclassid) {
        this.studentaccounttrainingclassid = studentaccounttrainingclassid == null ? null : studentaccounttrainingclassid.trim();
    }

    public String getStudentaccountpaymentmethod() {
        return studentaccountpaymentmethod;
    }

    public void setStudentaccountpaymentmethod(String studentaccountpaymentmethod) {
        this.studentaccountpaymentmethod = studentaccountpaymentmethod == null ? null : studentaccountpaymentmethod.trim();
    }

    public String getStudentaccountpaymentaccount() {
        return studentaccountpaymentaccount;
    }

    public void setStudentaccountpaymentaccount(String studentaccountpaymentaccount) {
        this.studentaccountpaymentaccount = studentaccountpaymentaccount == null ? null : studentaccountpaymentaccount.trim();
    }

    public Integer getStudentaccountclassunitprice() {
        return studentaccountclassunitprice;
    }

    public void setStudentaccountclassunitprice(Integer studentaccountclassunitprice) {
        this.studentaccountclassunitprice = studentaccountclassunitprice;
    }

    public Integer getStudentaccountclassnumbers() {
        return studentaccountclassnumbers;
    }

    public void setStudentaccountclassnumbers(Integer studentaccountclassnumbers) {
        this.studentaccountclassnumbers = studentaccountclassnumbers;
    }

    public Integer getStudentaccountremainderclassnumbers() {
        return studentaccountremainderclassnumbers;
    }

    public void setStudentaccountremainderclassnumbers(Integer studentaccountremainderclassnumbers) {
        this.studentaccountremainderclassnumbers = studentaccountremainderclassnumbers;
    }

    public String getStudentsitesstandbyone() {
        return studentsitesstandbyone;
    }

    public void setStudentsitesstandbyone(String studentsitesstandbyone) {
        this.studentsitesstandbyone = studentsitesstandbyone == null ? null : studentsitesstandbyone.trim();
    }

    public Integer getStudentsitesstandbytwo() {
        return studentsitesstandbytwo;
    }

    public void setStudentsitesstandbytwo(Integer studentsitesstandbytwo) {
        this.studentsitesstandbytwo = studentsitesstandbytwo;
    }
}