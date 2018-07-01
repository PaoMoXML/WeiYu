package io.renren.modules.WeiYu.model;

import java.util.Date;

public class MyClassDetail {
    private String signinforclasscoachid;

    private String signinforclassstudentstatetwo;

    private Integer signinforclassstate;

    private String classname;

    private Date traniningdate;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    public String getSigninforclasscoachid() {
        return signinforclasscoachid;
    }

    public void setSigninforclasscoachid(String signinforclasscoachid) {
        this.signinforclasscoachid = signinforclasscoachid == null ? null : signinforclasscoachid.trim();
    }

    public String getSigninforclassstudentstatetwo() {
        return signinforclassstudentstatetwo;
    }

    public void setSigninforclassstudentstatetwo(String signinforclassstudentstatetwo) {
        this.signinforclassstudentstatetwo = signinforclassstudentstatetwo == null ? null : signinforclassstudentstatetwo.trim();
    }

    public Integer getSigninforclassstate() {
        return signinforclassstate;
    }

    public void setSigninforclassstate(Integer signinforclassstate) {
        this.signinforclassstate = signinforclassstate;
    }

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
}