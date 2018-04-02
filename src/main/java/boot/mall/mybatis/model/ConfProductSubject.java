package boot.mall.mybatis.model;

public class ConfProductSubject {
    private Integer idx;

    private String productSubjectName;

    private String productSubjectIcon;

    private Integer parentSubjectIdx;

    private Integer viewOrder;

    private Integer extendType;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

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

    public Integer getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Integer viewOrder) {
        this.viewOrder = viewOrder;
    }

    public Integer getExtendType() {
        return extendType;
    }

    public void setExtendType(Integer extendType) {
        this.extendType = extendType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", productSubjectName=").append(productSubjectName);
        sb.append(", productSubjectIcon=").append(productSubjectIcon);
        sb.append(", parentSubjectIdx=").append(parentSubjectIdx);
        sb.append(", viewOrder=").append(viewOrder);
        sb.append(", extendType=").append(extendType);
        sb.append("]");
        return sb.toString();
    }
}