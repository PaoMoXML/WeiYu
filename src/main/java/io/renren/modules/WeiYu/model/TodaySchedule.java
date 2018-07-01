package io.renren.modules.WeiYu.model;

import java.util.Date;

public class TodaySchedule {
    private String badmintoncourttitle;

    private String classid;

    private String classbadmintoncourtid;

    private String classbadmintonsitesid;

    private String classname;

    private String classtype;

    private String classstatus;

    private String classsemester;

    private Date classstartdate;

    private Date classenddate;

    private String classweek;

    private String classteachingtime;

    private String classcoachid;

    private Integer classspecifiednumber;

    private Integer classmaxnumber;

    private String classstandbyone;

    private Integer classstandbytwo;

    public String getBadmintoncourttitle() {
        return badmintoncourttitle;
    }

    public void setBadmintoncourttitle(String badmintoncourttitle) {
        this.badmintoncourttitle = badmintoncourttitle == null ? null : badmintoncourttitle.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getClassbadmintoncourtid() {
        return classbadmintoncourtid;
    }

    public void setClassbadmintoncourtid(String classbadmintoncourtid) {
        this.classbadmintoncourtid = classbadmintoncourtid == null ? null : classbadmintoncourtid.trim();
    }

    public String getClassbadmintonsitesid() {
        return classbadmintonsitesid;
    }

    public void setClassbadmintonsitesid(String classbadmintonsitesid) {
        this.classbadmintonsitesid = classbadmintonsitesid == null ? null : classbadmintonsitesid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype == null ? null : classtype.trim();
    }

    public String getClassstatus() {
        return classstatus;
    }

    public void setClassstatus(String classstatus) {
        this.classstatus = classstatus == null ? null : classstatus.trim();
    }

    public String getClasssemester() {
        return classsemester;
    }

    public void setClasssemester(String classsemester) {
        this.classsemester = classsemester == null ? null : classsemester.trim();
    }

    public Date getClassstartdate() {
        return classstartdate;
    }

    public void setClassstartdate(Date classstartdate) {
        this.classstartdate = classstartdate;
    }

    public Date getClassenddate() {
        return classenddate;
    }

    public void setClassenddate(Date classenddate) {
        this.classenddate = classenddate;
    }

    public String getClassweek() {
        return classweek;
    }

    public void setClassweek(String classweek) {
        this.classweek = classweek == null ? null : classweek.trim();
    }

    public String getClassteachingtime() {
        return classteachingtime;
    }

    public void setClassteachingtime(String classteachingtime) {
        this.classteachingtime = classteachingtime == null ? null : classteachingtime.trim();
    }

    public String getClasscoachid() {
        return classcoachid;
    }

    public void setClasscoachid(String classcoachid) {
        this.classcoachid = classcoachid == null ? null : classcoachid.trim();
    }

    public Integer getClassspecifiednumber() {
        return classspecifiednumber;
    }

    public void setClassspecifiednumber(Integer classspecifiednumber) {
        this.classspecifiednumber = classspecifiednumber;
    }

    public Integer getClassmaxnumber() {
        return classmaxnumber;
    }

    public void setClassmaxnumber(Integer classmaxnumber) {
        this.classmaxnumber = classmaxnumber;
    }

    public String getClassstandbyone() {
        return classstandbyone;
    }

    public void setClassstandbyone(String classstandbyone) {
        this.classstandbyone = classstandbyone == null ? null : classstandbyone.trim();
    }

    public Integer getClassstandbytwo() {
        return classstandbytwo;
    }

    public void setClassstandbytwo(Integer classstandbytwo) {
        this.classstandbytwo = classstandbytwo;
    }
}