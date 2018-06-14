package io.renren.modules.WeiYu.model;

public class Administrator {
    private String administratorid;

    private String administratorname;

    private String administratorwechatnumber;

    private String administratorheadportrait;

    private String administratorphone;

    private String administratorsex;

    private String administratorstandbyone;

    private Integer administratorstandbytwo;

    public String getAdministratorid() {
        return administratorid;
    }

    public void setAdministratorid(String administratorid) {
        this.administratorid = administratorid == null ? null : administratorid.trim();
    }

    public String getAdministratorname() {
        return administratorname;
    }

    public void setAdministratorname(String administratorname) {
        this.administratorname = administratorname == null ? null : administratorname.trim();
    }

    public String getAdministratorwechatnumber() {
        return administratorwechatnumber;
    }

    public void setAdministratorwechatnumber(String administratorwechatnumber) {
        this.administratorwechatnumber = administratorwechatnumber == null ? null : administratorwechatnumber.trim();
    }

    public String getAdministratorheadportrait() {
        return administratorheadportrait;
    }

    public void setAdministratorheadportrait(String administratorheadportrait) {
        this.administratorheadportrait = administratorheadportrait == null ? null : administratorheadportrait.trim();
    }

    public String getAdministratorphone() {
        return administratorphone;
    }

    public void setAdministratorphone(String administratorphone) {
        this.administratorphone = administratorphone == null ? null : administratorphone.trim();
    }

    public String getAdministratorsex() {
        return administratorsex;
    }

    public void setAdministratorsex(String administratorsex) {
        this.administratorsex = administratorsex == null ? null : administratorsex.trim();
    }

    public String getAdministratorstandbyone() {
        return administratorstandbyone;
    }

    public void setAdministratorstandbyone(String administratorstandbyone) {
        this.administratorstandbyone = administratorstandbyone == null ? null : administratorstandbyone.trim();
    }

    public Integer getAdministratorstandbytwo() {
        return administratorstandbytwo;
    }

    public void setAdministratorstandbytwo(Integer administratorstandbytwo) {
        this.administratorstandbytwo = administratorstandbytwo;
    }
}