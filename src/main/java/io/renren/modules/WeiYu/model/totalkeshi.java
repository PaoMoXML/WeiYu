package io.renren.modules.WeiYu.model;

import java.math.BigDecimal;

public class totalkeshi {
    private String studentaccountid;

    private BigDecimal totalkeshi;

    public String getStudentaccountid() {
        return studentaccountid;
    }

    public void setStudentaccountid(String studentaccountid) {
        this.studentaccountid = studentaccountid == null ? null : studentaccountid.trim();
    }

    public BigDecimal getTotalkeshi() {
        return totalkeshi;
    }

    public void setTotalkeshi(BigDecimal totalkeshi) {
        this.totalkeshi = totalkeshi;
    }
}