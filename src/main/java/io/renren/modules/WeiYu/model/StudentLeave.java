package io.renren.modules.WeiYu.model;

import java.util.Date;

public class StudentLeave {
    private String studentleaveid;

    private String studentleavestudentid;

    private String studentleaveclassid;

    private String studentleavetrainingid;

    private Integer studentleavetype;

    private Integer studentleavestatus;

    private String studentleavereason;

    private String studentleavereplyreason;

    private Date studentleavedate;

    private Date studentleavereplydate;

    private String studentleavenewtrainingid;

    public String getStudentleaveid() {
        return studentleaveid;
    }

    public void setStudentleaveid(String studentleaveid) {
        this.studentleaveid = studentleaveid == null ? null : studentleaveid.trim();
    }

    public String getStudentleavestudentid() {
        return studentleavestudentid;
    }

    public void setStudentleavestudentid(String studentleavestudentid) {
        this.studentleavestudentid = studentleavestudentid == null ? null : studentleavestudentid.trim();
    }

    public String getStudentleaveclassid() {
        return studentleaveclassid;
    }

    public void setStudentleaveclassid(String studentleaveclassid) {
        this.studentleaveclassid = studentleaveclassid == null ? null : studentleaveclassid.trim();
    }

    public String getStudentleavetrainingid() {
        return studentleavetrainingid;
    }

    public void setStudentleavetrainingid(String studentleavetrainingid) {
        this.studentleavetrainingid = studentleavetrainingid == null ? null : studentleavetrainingid.trim();
    }

    public Integer getStudentleavetype() {
        return studentleavetype;
    }

    public void setStudentleavetype(Integer studentleavetype) {
        this.studentleavetype = studentleavetype;
    }

    public Integer getStudentleavestatus() {
        return studentleavestatus;
    }

    public void setStudentleavestatus(Integer studentleavestatus) {
        this.studentleavestatus = studentleavestatus;
    }

    public String getStudentleavereason() {
        return studentleavereason;
    }

    public void setStudentleavereason(String studentleavereason) {
        this.studentleavereason = studentleavereason == null ? null : studentleavereason.trim();
    }

    public String getStudentleavereplyreason() {
        return studentleavereplyreason;
    }

    public void setStudentleavereplyreason(String studentleavereplyreason) {
        this.studentleavereplyreason = studentleavereplyreason == null ? null : studentleavereplyreason.trim();
    }

    public Date getStudentleavedate() {
        return studentleavedate;
    }

    public void setStudentleavedate(Date studentleavedate) {
        this.studentleavedate = studentleavedate;
    }

    public Date getStudentleavereplydate() {
        return studentleavereplydate;
    }

    public void setStudentleavereplydate(Date studentleavereplydate) {
        this.studentleavereplydate = studentleavereplydate;
    }

    public String getStudentleavenewtrainingid() {
        return studentleavenewtrainingid;
    }

    public void setStudentleavenewtrainingid(String studentleavenewtrainingid) {
        this.studentleavenewtrainingid = studentleavenewtrainingid == null ? null : studentleavenewtrainingid.trim();
    }
}