package boot.mall.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class V_IndexProduct {
    private Integer type;

    private Integer isShow;

    private Integer viewOrder;

    private String showImage;

    private Integer idx;

    private String productName;

    private String icon;

    private Integer shopIdx;

    private BigDecimal marketPrice;

    private BigDecimal discountPrice;

    private BigDecimal price;

    private Integer inventory;

    private Date createDate;

    private Date lastUpdateDate;

    private Integer productType;

    private String showIcon;

    private Integer stock;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Integer viewOrder) {
        this.viewOrder = viewOrder;
    }

    public String getShowImage() {
        return showImage;
    }

    public void setShowImage(String showImage) {
        this.showImage = showImage == null ? null : showImage.trim();
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
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

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getShowIcon() {
        return showIcon;
    }

    public void setShowIcon(String showIcon) {
        this.showIcon = showIcon == null ? null : showIcon.trim();
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
        sb.append(", type=").append(type);
        sb.append(", isShow=").append(isShow);
        sb.append(", viewOrder=").append(viewOrder);
        sb.append(", showImage=").append(showImage);
        sb.append(", idx=").append(idx);
        sb.append(", productName=").append(productName);
        sb.append(", icon=").append(icon);
        sb.append(", shopIdx=").append(shopIdx);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", price=").append(price);
        sb.append(", inventory=").append(inventory);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", productType=").append(productType);
        sb.append(", showIcon=").append(showIcon);
        sb.append(", stock=").append(stock);
        sb.append("]");
        return sb.toString();
    }
}