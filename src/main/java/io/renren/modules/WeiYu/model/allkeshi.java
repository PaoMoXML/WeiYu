package io.renren.modules.WeiYu.model;

import java.math.BigDecimal;

public class allkeshi {
    private String studentaccountid;

    private BigDecimal allkeshi;

    public String getStudentaccountid() {
        return studentaccountid;
    }

    public void setStudentaccountid(String studentaccountid) {
        this.studentaccountid = studentaccountid == null ? null : studentaccountid.trim();
    }

    public BigDecimal getAllkeshi() {
        return allkeshi;
    }

    public void setAllkeshi(BigDecimal allkeshi) {
        this.allkeshi = allkeshi;
    }
}