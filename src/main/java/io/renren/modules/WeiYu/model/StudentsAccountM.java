package io.renren.modules.WeiYu.model;

import java.util.Date;

public class StudentsAccountM {

    private String studentaccountid;

    private Integer studentaccountclassnumbers;

    private Integer studentaccountclassunitprice;

    public String getStudentaccountid() {
        return studentaccountid;
    }

    public void setStudentaccountid(String studentaccountid) {
        this.studentaccountid = studentaccountid;
    }

    public Integer getStudentaccountclassnumbers() {
        return studentaccountclassnumbers;
    }

    public void setStudentaccountclassnumbers(Integer studentaccountclassnumbers) {
        this.studentaccountclassnumbers = studentaccountclassnumbers;
    }

    public Integer getStudentaccountclassunitprice() {
        return studentaccountclassunitprice;
    }

    public void setStudentaccountclassunitprice(Integer studentaccountclassunitprice) {
        this.studentaccountclassunitprice = studentaccountclassunitprice;
    }

    public Date getStudentaccountoccurrencedate() {
        return studentaccountoccurrencedate;
    }

    public void setStudentaccountoccurrencedate(Date studentaccountoccurrencedate) {
        this.studentaccountoccurrencedate = studentaccountoccurrencedate;
    }

    private Date studentaccountoccurrencedate;
}