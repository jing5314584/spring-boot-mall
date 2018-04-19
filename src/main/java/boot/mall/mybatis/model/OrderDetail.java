package boot.mall.mybatis.model;

public class OrderDetail {
    private Integer idx;

    private Integer orderIdx;

    private Integer productIdx;

    private Integer priceIdx;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getOrderIdx() {
        return orderIdx;
    }

    public void setOrderIdx(Integer orderIdx) {
        this.orderIdx = orderIdx;
    }

    public Integer getProductIdx() {
        return productIdx;
    }

    public void setProductIdx(Integer productIdx) {
        this.productIdx = productIdx;
    }

    public Integer getPriceIdx() {
        return priceIdx;
    }

    public void setPriceIdx(Integer priceIdx) {
        this.priceIdx = priceIdx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", orderIdx=").append(orderIdx);
        sb.append(", productIdx=").append(productIdx);
        sb.append(", priceIdx=").append(priceIdx);
        sb.append("]");
        return sb.toString();
    }
}