package io.renren.modules.WeiYu.model;

import java.util.Date;

public class choiceClassStatus {
    private String teachingtimedescribe;

    private String teachingtimeweek;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String selectclassstudentid;

    private String badmintoncourttitle;

    private Date selectclassfilingdate;

    private String selectclassstate;

    public String getTeachingtimedescribe() {
        return teachingtimedescribe;
    }

    public void setTeachingtimedescribe(String teachingtimedescribe) {
        this.teachingtimedescribe = teachingtimedescribe == null ? null : teachingtimedescribe.trim();
    }

    public String getTeachingtimeweek() {
        return teachingtimeweek;
    }

    public void setTeachingtimeweek(String teachingtimeweek) {
        this.teachingtimeweek = teachingtimeweek == null ? null : teachingtimeweek.trim();
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

    public String getSelectclassstudentid() {
        return selectclassstudentid;
    }

    public void setSelectclassstudentid(String selectclassstudentid) {
        this.selectclassstudentid = selectclassstudentid == null ? null : selectclassstudentid.trim();
    }

    public String getBadmintoncourttitle() {
        return badmintoncourttitle;
    }

    public void setBadmintoncourttitle(String badmintoncourttitle) {
        this.badmintoncourttitle = badmintoncourttitle == null ? null : badmintoncourttitle.trim();
    }

    public Date getSelectclassfilingdate() {
        return selectclassfilingdate;
    }

    public void setSelectclassfilingdate(Date selectclassfilingdate) {
        this.selectclassfilingdate = selectclassfilingdate;
    }

    public String getSelectclassstate() {
        return selectclassstate;
    }

    public void setSelectclassstate(String selectclassstate) {
        this.selectclassstate = selectclassstate == null ? null : selectclassstate.trim();
    }
}