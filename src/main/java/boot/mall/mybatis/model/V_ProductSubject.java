package boot.mall.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class V_ProductSubject {
    private String productSubjectName;

    private String productSubjectIcon;

    private Integer parentSubjectIdx;

    private Integer extendType;

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

    private Integer isShow;

    private Integer productType;

    private String showIcon;

    private Integer stock;

    private Integer viewOrder;

    public String getProductSubjectName() {
        return productSubjectName;
    }

    public void setProductSubjectName(String productSubjectName) {
        this.productSubjectName = productSubjectName == null ? null : productSubjectName.trim();
    }

    public String getProductSubjectIcon() {
        return productSubjectIcon;
    }

    public void setProductSubjectIcon(String productSubjectIcon) {
        this.productSubjectIcon = productSubjectIcon == null ? null : productSubjectIcon.trim();
    }

    public Integer getParentSubjectIdx() {
        return parentSubjectIdx;
    }

    public void setParentSubjectIdx(Integer parentSubjectIdx) {
        this.parentSubjectIdx = parentSubjectIdx;
    }

    public Integer getExtendType() {
        return extendType;
    }

    public void setExtendType(Integer extendType) {
        this.extendType = extendType;
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

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
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

    public Integer getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Integer viewOrder) {
        this.viewOrder = viewOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productSubjectName=").append(productSubjectName);
        sb.append(", productSubjectIcon=").append(productSubjectIcon);
        sb.append(", parentSubjectIdx=").append(parentSubjectIdx);
        sb.append(", extendType=").append(extendType);
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
        sb.append(", isShow=").append(isShow);
        sb.append(", productType=").append(productType);
        sb.append(", showIcon=").append(showIcon);
        sb.append(", stock=").append(stock);
        sb.append(", viewOrder=").append(viewOrder);
        sb.append("]");
        return sb.toString();
    }
}