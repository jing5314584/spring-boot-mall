package boot.mall.mybatis.model;

import java.util.Date;

public class Order {
    private Integer idx;

    private Integer levelIdx;

    private Integer orderType;

    private Integer userIdx;

    private Integer billIdx;

    private Integer state;

    private Date createTime;

    private Date payTime;

    private Date refundTime;

    private Integer totalPrice;

    private String orderName;

    private String orderContent;

    private String memo;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getLevelIdx() {
        return levelIdx;
    }

    public void setLevelIdx(Integer levelIdx) {
        this.levelIdx = levelIdx;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public Integer getBillIdx() {
        return billIdx;
    }

    public void setBillIdx(Integer billIdx) {
        this.billIdx = billIdx;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", levelIdx=").append(levelIdx);
        sb.append(", orderType=").append(orderType);
        sb.append(", userIdx=").append(userIdx);
        sb.append(", billIdx=").append(billIdx);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", refundTime=").append(refundTime);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderContent=").append(orderContent);
        sb.append(", memo=").append(memo);
        sb.append("]");
        return sb.toString();
    }
}