package io.renren.modules.WeiYu.model;

import java.util.Date;

public class JTClass {
    private String classweek;

    private String badmintoncourttitle;

    private String classstatus;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private Date classstartdate;

    private Date classenddate;

    private String classteachingtime;

    public String getClassweek() {
        return classweek;
    }

    public void setClassweek(String classweek) {
        this.classweek = classweek == null ? null : classweek.trim();
    }

    public String getBadmintoncourttitle() {
        return badmintoncourttitle;
    }

    public void setBadmintoncourttitle(String badmintoncourttitle) {
        this.badmintoncourttitle = badmintoncourttitle == null ? null : badmintoncourttitle.trim();
    }

    public String getClassstatus() {
        return classstatus;
    }

    public void setClassstatus(String classstatus) {
        this.classstatus = classstatus == null ? null : classstatus.trim();
    }

    public Date getTeachingtimebegintime() {
        return teachingtimebegintime;
    }

    public void setTeachingtimebegintime(Date teachingtimebegintime) {
        this.teachingtimebegintime = teachingtimebegintime;
    }

    public Date getTeachingtimeendtime() {
        return teachingtimeendtime;
    }

    public void setTeachingtimeendtime(Date teachingtimeendtime) {
        this.teachingtimeendtime = teachingtimeendtime;
    }

    public Date getClassstartdate() {
        return classstartdate;
    }

    public void setClassstartdate(Date classstartdate) {
        this.classstartdate = classstartdate;
    }

    public Date getClassenddate() {
        return classenddate;
    }

    public void setClassenddate(Date classenddate) {
        this.classenddate = classenddate;
    }

    public String getClassteachingtime() {
        return classteachingtime;
    }

    public void setClassteachingtime(String classteachingtime) {
        this.classteachingtime = classteachingtime == null ? null : classteachingtime.trim();
    }
}