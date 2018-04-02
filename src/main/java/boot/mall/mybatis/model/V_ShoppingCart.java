package boot.mall.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class V_ShoppingCart {
    private Integer idx;

    private Integer userIdx;

    private Date addTime;

    private Integer productIdx;

    private String productName;

    private BigDecimal productPrice;

    private Integer productNum;

    private Integer productType;

    private Integer parentIdx;

    private String icon;

    private Integer shopIdx;

    private BigDecimal marketPrice;

    private BigDecimal discountPrice;

    private BigDecimal price;

    private Integer inventory;

    private Date createDate;

    private Date lastUpdateDate;

    private Integer isShow;

    private String showIcon;

    private Integer viewOrder;

    private Integer stock;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getShopIdx() {
        return shopIdx;
    }

    public void setShopIdx(Integer shopIdx) {
        this.shopIdx = shopIdx;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getShowIcon() {
        return showIcon;
    }

    public void setShowIcon(String showIcon) {
        this.showIcon = showIcon == null ? null : showIcon.trim();
    }

    public Integer getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Integer viewOrder) {
        this.viewOrder = viewOrder;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
        sb.append(", icon=").append(icon);
        sb.append(", shopIdx=").append(shopIdx);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", price=").append(price);
        sb.append(", inventory=").append(inventory);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", isShow=").append(isShow);
        sb.append(", showIcon=").append(showIcon);
        sb.append(", viewOrder=").append(viewOrder);
        sb.append(", stock=").append(stock);
        sb.append("]");
        return sb.toString();
    }
}