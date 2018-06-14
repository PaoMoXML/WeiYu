package io.renren.modules.WeiYu.model;

import java.util.Date;

public class coachLeave {
    private String classname;

    private String trainingid;

    private Date traniningdate;

    private String coachid;

    private Integer coachleave;

    private String leavereason;

    private String coachleavestatus;

    private String replacecoachid;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(String trainingid) {
        this.trainingid = trainingid == null ? null : trainingid.trim();
    }

    public Date getTraniningdate() {
        return traniningdate;
    }

    public void setTraniningdate(Date traniningdate) {
        this.traniningdate = traniningdate;
    }

    public String getCoachid() {
        return coachid;
    }

    public void setCoachid(String coachid) {
        this.coachid = coachid == null ? null : coachid.trim();
    }

    public Integer getCoachleave() {
        return coachleave;
    }

    public void setCoachleave(Integer coachleave) {
        this.coachleave = coachleave;
    }

    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason == null ? null : leavereason.trim();
    }

    public String getCoachleavestatus() {
        return coachleavestatus;
    }

    public void setCoachleavestatus(String coachleavestatus) {
        this.coachleavestatus = coachleavestatus == null ? null : coachleavestatus.trim();
    }

    public String getReplacecoachid() {
        return replacecoachid;
    }

    public void setReplacecoachid(String replacecoachid) {
        this.replacecoachid = replacecoachid == null ? null : replacecoachid.trim();
    }
}