package io.renren.modules.WeiYu.model;

public class Accountcr {
    private String studentintegralaccountid;

    private Integer studentaccountclassnumbers;

    private Integer studentintegralaccountremainderpaymentaccount;

    public String getStudentintegralaccountid() {
        return studentintegralaccountid;
    }

    public void setStudentintegralaccountid(String studentintegralaccountid) {
        this.studentintegralaccountid = studentintegralaccountid == null ? null : studentintegralaccountid.trim();
    }

    public Integer getStudentaccountclassnumbers() {
        return studentaccountclassnumbers;
    }

    public void setStudentaccountclassnumbers(Integer studentaccountclassnumbers) {
        this.studentaccountclassnumbers = studentaccountclassnumbers;
    }

    public Integer getStudentintegralaccountremainderpaymentaccount() {
        return studentintegralaccountremainderpaymentaccount;
    }

    public void setStudentintegralaccountremainderpaymentaccount(Integer studentintegralaccountremainderpaymentaccount) {
        this.studentintegralaccountremainderpaymentaccount = studentintegralaccountremainderpaymentaccount;
    }
}