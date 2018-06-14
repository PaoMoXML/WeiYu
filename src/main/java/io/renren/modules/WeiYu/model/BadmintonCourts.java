package io.renren.modules.WeiYu.model;

public class BadmintonCourts {
    private String badmintoncourtid;

    private String badmintoncourttitle;

    private String badmintoncourtaddress;

    private Integer badmintonsitesnumber;

    private String badmintoncourtlinkman;

    private String badmintoncourtcontactphone;

    private String badmintoncourtphotopath;

    private String badmintoncourtstandbyone;

    private Integer badmintoncourtstandbytwo;

    public String getBadmintoncourtid() {
        return badmintoncourtid;
    }

    public void setBadmintoncourtid(String badmintoncourtid) {
        this.badmintoncourtid = badmintoncourtid == null ? null : badmintoncourtid.trim();
    }

    public String getBadmintoncourttitle() {
        return badmintoncourttitle;
    }

    public void setBadmintoncourttitle(String badmintoncourttitle) {
        this.badmintoncourttitle = badmintoncourttitle == null ? null : badmintoncourttitle.trim();
    }

    public String getBadmintoncourtaddress() {
        return badmintoncourtaddress;
    }

    public void setBadmintoncourtaddress(String badmintoncourtaddress) {
        this.badmintoncourtaddress = badmintoncourtaddress == null ? null : badmintoncourtaddress.trim();
    }

    public Integer getBadmintonsitesnumber() {
        return badmintonsitesnumber;
    }

    public void setBadmintonsitesnumber(Integer badmintonsitesnumber) {
        this.badmintonsitesnumber = badmintonsitesnumber;
    }

    public String getBadmintoncourtlinkman() {
        return badmintoncourtlinkman;
    }

    public void setBadmintoncourtlinkman(String badmintoncourtlinkman) {
        this.badmintoncourtlinkman = badmintoncourtlinkman == null ? null : badmintoncourtlinkman.trim();
    }

    public String getBadmintoncourtcontactphone() {
        return badmintoncourtcontactphone;
    }

    public void setBadmintoncourtcontactphone(String badmintoncourtcontactphone) {
        this.badmintoncourtcontactphone = badmintoncourtcontactphone == null ? null : badmintoncourtcontactphone.trim();
    }

    public String getBadmintoncourtphotopath() {
        return badmintoncourtphotopath;
    }

    public void setBadmintoncourtphotopath(String badmintoncourtphotopath) {
        this.badmintoncourtphotopath = badmintoncourtphotopath == null ? null : badmintoncourtphotopath.trim();
    }

    public String getBadmintoncourtstandbyone() {
        return badmintoncourtstandbyone;
    }

    public void setBadmintoncourtstandbyone(String badmintoncourtstandbyone) {
        this.badmintoncourtstandbyone = badmintoncourtstandbyone == null ? null : badmintoncourtstandbyone.trim();
    }

    public Integer getBadmintoncourtstandbytwo() {
        return badmintoncourtstandbytwo;
    }

    public void setBadmintoncourtstandbytwo(Integer badmintoncourtstandbytwo) {
        this.badmintoncourtstandbytwo = badmintoncourtstandbytwo;
    }
}