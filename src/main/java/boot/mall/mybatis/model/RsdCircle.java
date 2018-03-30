package boot.mall.mybatis.model;

import java.util.Date;

public class RsdCircle {
    private Integer idx;

    private String circleName;

    private String circleIcon;

    private Byte viewOrder;

    private Boolean isNew;

    private Integer attentionCount;

    private Integer todayTalkCount;

    private Date talkCountUpdateDate;

    private Boolean isDelete;

    private Byte isAttention;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName == null ? null : circleName.trim();
    }

    public String getCircleIcon() {
        return circleIcon;
    }

    public void setCircleIcon(String circleIcon) {
        this.circleIcon = circleIcon == null ? null : circleIcon.trim();
    }

    public Byte getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Byte viewOrder) {
        this.viewOrder = viewOrder;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Integer getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Integer getTodayTalkCount() {
        return todayTalkCount;
    }

    public void setTodayTalkCount(Integer todayTalkCount) {
        this.todayTalkCount = todayTalkCount;
    }

    public Date getTalkCountUpdateDate() {
        return talkCountUpdateDate;
    }

    public void setTalkCountUpdateDate(Date talkCountUpdateDate) {
        this.talkCountUpdateDate = talkCountUpdateDate;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Byte getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(Byte isAttention) {
        this.isAttention = isAttention;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idx=").append(idx);
        sb.append(", circleName=").append(circleName);
        sb.append(", circleIcon=").append(circleIcon);
        sb.append(", viewOrder=").append(viewOrder);
        sb.append(", isNew=").append(isNew);
        sb.append(", attentionCount=").append(attentionCount);
        sb.append(", todayTalkCount=").append(todayTalkCount);
        sb.append(", talkCountUpdateDate=").append(talkCountUpdateDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isAttention=").append(isAttention);
        sb.append("]");
        return sb.toString();
    }
}