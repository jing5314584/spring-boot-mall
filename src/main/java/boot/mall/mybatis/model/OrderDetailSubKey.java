package boot.mall.mybatis.model;

public class OrderDetailSubKey {
    protected Integer orderIdx;

    protected Integer productIdx;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderIdx=").append(orderIdx);
        sb.append(", productIdx=").append(productIdx);
        sb.append("]");
        return sb.toString();
    }
}