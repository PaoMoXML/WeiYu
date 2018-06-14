package io.renren.modules.WeiYu.model;

public class Week {
    private String weekid;

    private String weekarabicnumerals;

    private String weekchinesenumerals;

    private String weekenglishnumerals;

    private String weekstandbyone;

    private Integer weekstandbytwo;

    public String getWeekid() {
        return weekid;
    }

    public void setWeekid(String weekid) {
        this.weekid = weekid == null ? null : weekid.trim();
    }

    public String getWeekarabicnumerals() {
        return weekarabicnumerals;
    }

    public void setWeekarabicnumerals(String weekarabicnumerals) {
        this.weekarabicnumerals = weekarabicnumerals == null ? null : weekarabicnumerals.trim();
    }

    public String getWeekchinesenumerals() {
        return weekchinesenumerals;
    }

    public void setWeekchinesenumerals(String weekchinesenumerals) {
        this.weekchinesenumerals = weekchinesenumerals == null ? null : weekchinesenumerals.trim();
    }

    public String getWeekenglishnumerals() {
        return weekenglishnumerals;
    }

    public void setWeekenglishnumerals(String weekenglishnumerals) {
        this.weekenglishnumerals = weekenglishnumerals == null ? null : weekenglishnumerals.trim();
    }

    public String getWeekstandbyone() {
        return weekstandbyone;
    }

    public void setWeekstandbyone(String weekstandbyone) {
        this.weekstandbyone = weekstandbyone == null ? null : weekstandbyone.trim();
    }

    public Integer getWeekstandbytwo() {
        return weekstandbytwo;
    }

    public void setWeekstandbytwo(Integer weekstandbytwo) {
        this.weekstandbytwo = weekstandbytwo;
    }
}