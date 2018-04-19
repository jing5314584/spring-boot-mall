package boot.mall.mybatis.model;

import java.util.Date;

public class ReceiveAddress {
    private Integer idx;

    private Date createTime;

    private Integer userIdx;

    private Integer orderIdx;

    private String phone;

    private String receiveAddressProvince;

    private String receiveAddressCity;

    private String receiveAddressArea;

    private String receiveAddressDetail;

    private String receive;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getReceiveAddressProvince() {
        return receiveAddressProvince;
    }

    public void setReceiveAddressProvince(String receiveAddressProvince) {
        this.receiveAddressProvince = receiveAddressProvince == null ? null : receiveAddressProvince.trim();
    }

    public String getReceiveAddressCity() {
        return receiveAddressCity;
    }

    public void setReceiveAddressCity(String receiveAddressCity) {
        this.receiveAddressCity = receiveAddressCity == null ? null : receiveAddressCity.trim();
    }

    public String getReceiveAddressArea() {
        return receiveAddressArea;
    }

    public void setReceiveAddressArea(String receiveAddressArea) {
        this.receiveAddressArea = receiveAddressArea == null ? null : receiveAddressArea.trim();
    }

    public String getReceiveAddressDetail() {
        return receiveAddressDetail;
    }

    public void setReceiveAddressDetail(String receiveAddressDetail) {
        this.receiveAddressDetail = receiveAddressDetail == null ? null : receiveAddressDetail.trim();
    }

    public String getReceive() {
        return receive;
    }

    public void setReceive(String receive) {
        this.receive = receive == null ? null : receive.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", createTime=").append(createTime);
        sb.append(", userIdx=").append(userIdx);
        sb.append(", orderIdx=").append(orderIdx);
        sb.append(", phone=").append(phone);
        sb.append(", receiveAddressProvince=").append(receiveAddressProvince);
        sb.append(", receiveAddressCity=").append(receiveAddressCity);
        sb.append(", receiveAddressArea=").append(receiveAddressArea);
        sb.append(", receiveAddressDetail=").append(receiveAddressDetail);
        sb.append(", receive=").append(receive);
        sb.append("]");
        return sb.toString();
    }
}