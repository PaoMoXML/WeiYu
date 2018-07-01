package io.renren.modules.WeiYu.model;

import java.util.Date;

public class trainingToDetail {
    private String classname;

    private Date traniningdate;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String badmintoncourttitle;

    private String badmintoncourtaddress;

    private String trainingid;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Date getTraniningdate() {
        return traniningdate;
    }

    public void setTraniningdate(Date traniningdate) {
        this.traniningdate = traniningdate;
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

    public String getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(String trainingid) {
        this.trainingid = trainingid == null ? null : trainingid.trim();
    }
}