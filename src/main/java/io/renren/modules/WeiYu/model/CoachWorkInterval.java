package io.renren.modules.WeiYu.model;

public class CoachWorkInterval {
    private String coachid;

    private String coachworkintervaltype;

    private String coachworkintervalid;

    private String coachworkintervalstandbyone;

    private Integer coachworkintervalstandbytwo;

    public String getCoachid() {
        return coachid;
    }

    public void setCoachid(String coachid) {
        this.coachid = coachid == null ? null : coachid.trim();
    }

    public String getCoachworkintervaltype() {
        return coachworkintervaltype;
    }

    public void setCoachworkintervaltype(String coachworkintervaltype) {
        this.coachworkintervaltype = coachworkintervaltype == null ? null : coachworkintervaltype.trim();
    }

    public String getCoachworkintervalid() {
        return coachworkintervalid;
    }

    public void setCoachworkintervalid(String coachworkintervalid) {
        this.coachworkintervalid = coachworkintervalid == null ? null : coachworkintervalid.trim();
    }

    public String getCoachworkintervalstandbyone() {
        return coachworkintervalstandbyone;
    }

    public void setCoachworkintervalstandbyone(String coachworkintervalstandbyone) {
        this.coachworkintervalstandbyone = coachworkintervalstandbyone == null ? null : coachworkintervalstandbyone.trim();
    }

    public Integer getCoachworkintervalstandbytwo() {
        return coachworkintervalstandbytwo;
    }

    public void setCoachworkintervalstandbytwo(Integer coachworkintervalstandbytwo) {
        this.coachworkintervalstandbytwo = coachworkintervalstandbytwo;
    }
}