package io.renren.modules.WeiYu.model;

public class ClassType {
    private String classtypeid;

    private String classtypename;

    private String classtypestandbyone;

    private Integer classtypestandbytwo;

    public String getClasstypeid() {
        return classtypeid;
    }

    public void setClasstypeid(String classtypeid) {
        this.classtypeid = classtypeid == null ? null : classtypeid.trim();
    }

    public String getClasstypename() {
        return classtypename;
    }

    public void setClasstypename(String classtypename) {
        this.classtypename = classtypename == null ? null : classtypename.trim();
    }

    public String getClasstypestandbyone() {
        return classtypestandbyone;
    }

    public void setClasstypestandbyone(String classtypestandbyone) {
        this.classtypestandbyone = classtypestandbyone == null ? null : classtypestandbyone.trim();
    }

    public Integer getClasstypestandbytwo() {
        return classtypestandbytwo;
    }

    public void setClasstypestandbytwo(Integer classtypestandbytwo) {
        this.classtypestandbytwo = classtypestandbytwo;
    }
}