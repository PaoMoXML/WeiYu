package io.renren.modules.WeiYu.model;

import java.util.Date;

public class Training {
    private String trainingid;

    private String trainingclassid;

    private String trainingstatus;

    private Date traniningdate;

    private String coachid;

    private Integer coachleave;

    private String leavereason;

    private String coachleavestatus;

    private String replacecoachid;

    private String trainingstandbyone;

    private Integer trainingstandbytwo;

    public String getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(String trainingid) {
        this.trainingid = trainingid == null ? null : trainingid.trim();
    }

    public String getTrainingclassid() {
        return trainingclassid;
    }

    public void setTrainingclassid(String trainingclassid) {
        this.trainingclassid = trainingclassid == null ? null : trainingclassid.trim();
    }

    public String getTrainingstatus() {
        return trainingstatus;
    }

    public void setTrainingstatus(String trainingstatus) {
        this.trainingstatus = trainingstatus == null ? null : trainingstatus.trim();
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

    public String getTrainingstandbyone() {
        return trainingstandbyone;
    }

    public void setTrainingstandbyone(String trainingstandbyone) {
        this.trainingstandbyone = trainingstandbyone == null ? null : trainingstandbyone.trim();
    }

    public Integer getTrainingstandbytwo() {
        return trainingstandbytwo;
    }

    public void setTrainingstandbytwo(Integer trainingstandbytwo) {
        this.trainingstandbytwo = trainingstandbytwo;
    }
}