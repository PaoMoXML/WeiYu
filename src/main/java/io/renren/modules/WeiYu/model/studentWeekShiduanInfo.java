package io.renren.modules.WeiYu.model;

import java.util.Date;

public class studentWeekShiduanInfo {
    private String selectclassstudentid;

    private Date teachingtimebegintime;

    private Date teachingtimeendtime;

    private String teachingtimeweek;

    public String getSelectclassstudentid() {
        return selectclassstudentid;
    }

    public void setSelectclassstudentid(String selectclassstudentid) {
        this.selectclassstudentid = selectclassstudentid == null ? null : selectclassstudentid.trim();
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

    public String getTeachingtimeweek() {
        return teachingtimeweek;
    }

    public void setTeachingtimeweek(String teachingtimeweek) {
        this.teachingtimeweek = teachingtimeweek == null ? null : teachingtimeweek.trim();
    }
}