package boot.mall.mybatis.model;

public class ProductDetailWithBLOBs extends ProductDetail {
    private String baseInfo;

    private String processInfo;

    private String productParameter;

    private String matters;

    public String getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(String baseInfo) {
        this.baseInfo = baseInfo == null ? null : baseInfo.trim();
    }

    public String getProcessInfo() {
        return processInfo;
    }

    public void setProcessInfo(String processInfo) {
        this.processInfo = processInfo == null ? null : processInfo.trim();
    }

    public String getProductParameter() {
        return productParameter;
    }

    public void setProductParameter(String productParameter) {
        this.productParameter = productParameter == null ? null : productParameter.trim();
    }

    public String getMatters() {
        return matters;
    }

    public void setMatters(String matters) {
        this.matters = matters == null ? null : matters.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", baseInfo=").append(baseInfo);
        sb.append(", processInfo=").append(processInfo);
        sb.append(", productParameter=").append(productParameter);
        sb.append(", matters=").append(matters);
        sb.append("]");
        return sb.toString();
    }
}