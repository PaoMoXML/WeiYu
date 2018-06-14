package io.renren.modules.WeiYu.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TeachingTime {
    private String teachingtimeid;

    private String teachingtimedescribe;

    private String teachingtimeweek;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String teachingtimestandbyone;

    private Integer teachingtimestandbytwo;

    public String getTeachingtimeid() {
        return teachingtimeid;
    }

    public void setTeachingtimeid(String teachingtimeid) {
        this.teachingtimeid = teachingtimeid == null ? null : teachingtimeid.trim();
    }

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

    public String getTeachingtimestandbyone() {
        return teachingtimestandbyone;
    }

    public void setTeachingtimestandbyone(String teachingtimestandbyone) {
        this.teachingtimestandbyone = teachingtimestandbyone == null ? null : teachingtimestandbyone.trim();
    }

    public Integer getTeachingtimestandbytwo() {
        return teachingtimestandbytwo;
    }

    public void setTeachingtimestandbytwo(Integer teachingtimestandbytwo) {
        this.teachingtimestandbytwo = teachingtimestandbytwo;
    }


}