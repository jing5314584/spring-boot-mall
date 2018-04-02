package boot.mall.mybatis.model;

public class ProductDetail {
    private Integer productIdx;

    private Integer isShowMatters;

    public Integer getProductIdx() {
        return productIdx;
    }

    public void setProductIdx(Integer productIdx) {
        this.productIdx = productIdx;
    }

    public Integer getIsShowMatters() {
        return isShowMatters;
    }

    public void setIsShowMatters(Integer isShowMatters) {
        this.isShowMatters = isShowMatters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productIdx=").append(productIdx);
        sb.append(", isShowMatters=").append(isShowMatters);
        sb.append("]");
        return sb.toString();
    }
}