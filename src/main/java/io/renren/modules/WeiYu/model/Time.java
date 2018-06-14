package io.renren.modules.WeiYu.model;

import java.util.Date;

public class Time {
    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String teachingtimeid;

    public String getTeachingtimeid() {
        return teachingtimeid;
    }

    public void setTeachingtimeid(String teachingtimeid) {
        this.teachingtimeid = teachingtimeid;
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
