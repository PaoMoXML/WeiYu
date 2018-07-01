package io.renren.modules.WeiYu.model;

import java.math.BigDecimal;
import java.util.Date;

public class coachDayNumber {
    private Date traniningdate;

    private String signinforclasscoachid;

    private BigDecimal zan;

    private BigDecimal flowernumber;

    private BigDecimal applausenumber;

    public Date getTraniningdate() {
        return traniningdate;
    }

    public void setTraniningdate(Date traniningdate) {
        this.traniningdate = traniningdate;
    }

    public String getSigninforclasscoachid() {
        return signinforclasscoachid;
    }

    public void setSigninforclasscoachid(String signinforclasscoachid) {
        this.signinforclasscoachid = signinforclasscoachid == null ? null : signinforclasscoachid.trim();
    }

    public BigDecimal getZan() {
        return zan;
    }

    public void setZan(BigDecimal zan) {
        this.zan = zan;
    }

    public BigDecimal getFlowernumber() {
        return flowernumber;
    }

    public void setFlowernumber(BigDecimal flowernumber) {
        this.flowernumber = flowernumber;
    }

    public BigDecimal getApplausenumber() {
        return applausenumber;
    }

    public void setApplausenumber(BigDecimal applausenumber) {
        this.applausenumber = applausenumber;
    }
}