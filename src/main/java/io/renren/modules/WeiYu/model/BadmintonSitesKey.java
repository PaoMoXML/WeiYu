package io.renren.modules.WeiYu.model;

public class BadmintonSitesKey {
    private String badmintoncourtid;

    private String badmintonsitesid;

    public String getBadmintoncourtid() {
        return badmintoncourtid;
    }

    public void setBadmintoncourtid(String badmintoncourtid) {
        this.badmintoncourtid = badmintoncourtid == null ? null : badmintoncourtid.trim();
    }

    public String getBadmintonsitesid() {
        return badmintonsitesid;
    }

    public void setBadmintonsitesid(String badmintonsitesid) {
        this.badmintonsitesid = badmintonsitesid == null ? null : badmintonsitesid.trim();
    }
}