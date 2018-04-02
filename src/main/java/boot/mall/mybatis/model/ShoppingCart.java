package boot.mall.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShoppingCart {
    private Integer idx;

    private Integer userIdx;

    private Date addTime;

    private Integer productIdx;

    private String productName;

    private BigDecimal productPrice;

    private Integer productNum;

    private Integer productType;

    private Integer parentIdx;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getProductIdx() {
        return productIdx;
    }

    public void setProductIdx(Integer productIdx) {
        this.productIdx = productIdx;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getParentIdx() {
        return parentIdx;
    }

    public void setParentIdx(Integer parentIdx) {
        this.parentIdx = parentIdx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", userIdx=").append(userIdx);
        sb.append(", addTime=").append(addTime);
        sb.append(", productIdx=").append(productIdx);
        sb.append(", productName=").append(productName);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productNum=").append(productNum);
        sb.append(", productType=").append(productType);
        sb.append(", parentIdx=").append(parentIdx);
        sb.append("]");
        return sb.toString();
    }
}