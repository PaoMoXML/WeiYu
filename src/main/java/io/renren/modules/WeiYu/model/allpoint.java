package io.renren.modules.WeiYu.model;

import java.math.BigDecimal;

public class allpoint {
    private String studentintegralaccountid;

    private BigDecimal allpoint;

    public String getStudentintegralaccountid() {
        return studentintegralaccountid;
    }

    public void setStudentintegralaccountid(String studentintegralaccountid) {
        this.studentintegralaccountid = studentintegralaccountid == null ? null : studentintegralaccountid.trim();
    }

    public BigDecimal getAllpoint() {
        return allpoint;
    }

    public void setAllpoint(BigDecimal allpoint) {
        this.allpoint = allpoint;
    }
}