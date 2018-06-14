package io.renren.modules.WeiYu.model;

import java.util.Date;

public class commentFinal {
    private String classname;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String coachname;

    private String replacecoachname;

    private String signinforclasscoachstate;

    private Date traniningdate;

    private String selectclassstudentid;

    private String trainingid;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
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

    public String getCoachname() {
        return coachname;
    }

    public void setCoachname(String coachname) {
        this.coachname = coachname == null ? null : coachname.trim();
    }

    public String getReplacecoachname() {
        return replacecoachname;
    }

    public void setReplacecoachname(String replacecoachname) {
        this.replacecoachname = replacecoachname == null ? null : replacecoachname.trim();
    }

    public String getSigninforclasscoachstate() {
        return signinforclasscoachstate;
    }

    public void setSigninforclasscoachstate(String signinforclasscoachstate) {
        this.signinforclasscoachstate = signinforclasscoachstate == null ? null : signinforclasscoachstate.trim();
    }

    public Date getTraniningdate() {
        return traniningdate;
    }

    public void setTraniningdate(Date traniningdate) {
        this.traniningdate = traniningdate;
    }

    public String getSelectclassstudentid() {
        return selectclassstudentid;
    }

    public void setSelectclassstudentid(String selectclassstudentid) {
        this.selectclassstudentid = selectclassstudentid == null ? null : selectclassstudentid.trim();
    }

    public String getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(String trainingid) {
        this.trainingid = trainingid == null ? null : trainingid.trim();
    }
}