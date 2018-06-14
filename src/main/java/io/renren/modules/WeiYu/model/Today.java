package io.renren.modules.WeiYu.model;

import java.util.Date;

public class Today {
    private String teachingtimedescribe;

    private String teachingtimeweek;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String teachingtimestandbyone;

    private Integer teachingtimestandbytwo;

    private String classname;

    private String classbadmintonsitesid;

    private String classteachingtime;

    private Date traniningdate;

    private String classbadmintoncourtid;

    private String coachid;

    private String badmintoncourttitle;

    private String trainingid;

    private String teachingtimeid;

    public String getTeachingtimedescribe() {
        return teachingtimedescribe;
    }

    public void setTeachingtimedescribe(String teachingtimedescribe) {
        this.teachingtimedescribe = teachingtimedescribe == null ? null : teachingtimedescribe.trim();
    }

    public String getTeachingtimeweek() {
        return teachingtimeweek;
    }

    public void setTeachingtimeweek(String teachingtimeweek) {
        this.teachingtimeweek = teachingtimeweek == null ? null : teachingtimeweek.trim();
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

    public String getTeachingtimestandbyone() {
        return teachingtimestandbyone;
    }

    public void setTeachingtimestandbyone(String teachingtimestandbyone) {
        this.teachingtimestandbyone = teachingtimestandbyone == null ? null : teachingtimestandbyone.trim();
    }

    public Integer getTeachingtimestandbytwo() {
        return teachingtimestandbytwo;
    }

    public void setTeachingtimestandbytwo(Integer teachingtimestandbytwo) {
        this.teachingtimestandbytwo = teachingtimestandbytwo;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getClassbadmintonsitesid() {
        return classbadmintonsitesid;
    }

    public void setClassbadmintonsitesid(String classbadmintonsitesid) {
        this.classbadmintonsitesid = classbadmintonsitesid == null ? null : classbadmintonsitesid.trim();
    }

    public String getClassteachingtime() {
        return classteachingtime;
    }

    public void setClassteachingtime(String classteachingtime) {
        this.classteachingtime = classteachingtime == null ? null : classteachingtime.trim();
    }

    public Date getTraniningdate() {
        return traniningdate;
    }

    public void setTraniningdate(Date traniningdate) {
        this.traniningdate = traniningdate;
    }

    public String getClassbadmintoncourtid() {
        return classbadmintoncourtid;
    }

    public void setClassbadmintoncourtid(String classbadmintoncourtid) {
        this.classbadmintoncourtid = classbadmintoncourtid == null ? null : classbadmintoncourtid.trim();
    }

    public String getCoachid() {
        return coachid;
    }

    public void setCoachid(String coachid) {
        this.coachid = coachid == null ? null : coachid.trim();
    }

    public String getBadmintoncourttitle() {
        return badmintoncourttitle;
    }

    public void setBadmintoncourttitle(String badmintoncourttitle) {
        this.badmintoncourttitle = badmintoncourttitle == null ? null : badmintoncourttitle.trim();
    }

    public String getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(String trainingid) {
        this.trainingid = trainingid == null ? null : trainingid.trim();
    }

    public String getTeachingtimeid() {
        return teachingtimeid;
    }

    public void setTeachingtimeid(String teachingtimeid) {
        this.teachingtimeid = teachingtimeid == null ? null : teachingtimeid.trim();
    }
}