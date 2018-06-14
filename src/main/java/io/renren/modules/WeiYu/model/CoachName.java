package io.renren.modules.WeiYu.model;

public class CoachName {
    private String coachid;

    private String coachname;

    private String coachstatus;

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

    public String getCoachstatus() {
        return coachstatus;
    }

    public void setCoachstatus(String coachstatus) {
        this.coachstatus = coachstatus == null ? null : coachstatus.trim();
    }
}