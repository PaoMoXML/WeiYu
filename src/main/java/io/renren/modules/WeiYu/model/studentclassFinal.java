package io.renren.modules.WeiYu.model;

import java.util.Date;

public class studentclassFinal {
    private String classid;

    private String badmintoncourttitle;

    private String classtype;

    private String classname;

    private Date classstartdate;

    private Date classenddate;

    private String classweek;

    private String coachid;

    private String coachname;

    private String badmintoncourtid;

    private String teachingtimeid;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String selectclassstudentid;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getBadmintoncourttitle() {
        return badmintoncourttitle;
    }

    public void setBadmintoncourttitle(String badmintoncourttitle) {
        this.badmintoncourttitle = badmintoncourttitle == null ? null : badmintoncourttitle.trim();
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype == null ? null : classtype.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
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

    public String getCoachid() {
        return coachid;
    }

    public void setCoachid(String coachid) {
        this.coachid = coachid == null ? null : coachid.trim();
    }

    public String getCoachname() {
        return coachname;
    }

    public void setCoachname(String coachname) {
        this.coachname = coachname == null ? null : coachname.trim();
    }

    public String getBadmintoncourtid() {
        return badmintoncourtid;
    }

    public void setBadmintoncourtid(String badmintoncourtid) {
        this.badmintoncourtid = badmintoncourtid == null ? null : badmintoncourtid.trim();
    }

    public String getTeachingtimeid() {
        return teachingtimeid;
    }

    public void setTeachingtimeid(String teachingtimeid) {
        this.teachingtimeid = teachingtimeid == null ? null : teachingtimeid.trim();
    }

    public Date getTeachingtimebegintime() {
        return teachingtimebegintime;
    }

    public void setTeachingtimebegintime(Date teachingtimebegintime) {
        this.teachingtimebegintime = teachingtimebegintime;
    }

    public Date getTeachingtimeendtime() {
        return teachingtimeendtime;
    }

    public void setTeachingtimeendtime(Date teachingtimeendtime) {
        this.teachingtimeendtime = teachingtimeendtime;
    }

    public String getSelectclassstudentid() {
        return selectclassstudentid;
    }

    public void setSelectclassstudentid(String selectclassstudentid) {
        this.selectclassstudentid = selectclassstudentid == null ? null : selectclassstudentid.trim();
    }
}