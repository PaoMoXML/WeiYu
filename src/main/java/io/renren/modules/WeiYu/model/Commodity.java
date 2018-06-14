package io.renren.modules.WeiYu.model;

public class Commodity {
    private String commodityid;

    private String commodityname;

    private Integer commodityintegralprice;

    private String commoditystandbyone;

    private Integer commoditystandbytwo;

    public String getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(String commodityid) {
        this.commodityid = commodityid == null ? null : commodityid.trim();
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getCommodityintegralprice() {
        return commodityintegralprice;
    }

    public void setCommodityintegralprice(Integer commodityintegralprice) {
        this.commodityintegralprice = commodityintegralprice;
    }

    public String getCommoditystandbyone() {
        return commoditystandbyone;
    }

    public void setCommoditystandbyone(String commoditystandbyone) {
        this.commoditystandbyone = commoditystandbyone == null ? null : commoditystandbyone.trim();
    }

    public Integer getCommoditystandbytwo() {
        return commoditystandbytwo;
    }

    public void setCommoditystandbytwo(Integer commoditystandbytwo) {
        this.commoditystandbytwo = commoditystandbytwo;
    }
}