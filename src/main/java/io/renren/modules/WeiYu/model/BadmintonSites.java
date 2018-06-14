package io.renren.modules.WeiYu.model;

public class BadmintonSites extends BadmintonSitesKey {
    private String badmintonsitesdescribe;

    private String badmintonsitesstandbyone;

    private Integer badmintonsitesstandbytwo;

    public String getBadmintonsitesdescribe() {
        return badmintonsitesdescribe;
    }

    public void setBadmintonsitesdescribe(String badmintonsitesdescribe) {
        this.badmintonsitesdescribe = badmintonsitesdescribe == null ? null : badmintonsitesdescribe.trim();
    }

    public String getBadmintonsitesstandbyone() {
        return badmintonsitesstandbyone;
    }

    public void setBadmintonsitesstandbyone(String badmintonsitesstandbyone) {
        this.badmintonsitesstandbyone = badmintonsitesstandbyone == null ? null : badmintonsitesstandbyone.trim();
    }

    public Integer getBadmintonsitesstandbytwo() {
        return badmintonsitesstandbytwo;
    }

    public void setBadmintonsitesstandbytwo(Integer badmintonsitesstandbytwo) {
        this.badmintonsitesstandbytwo = badmintonsitesstandbytwo;
    }
}