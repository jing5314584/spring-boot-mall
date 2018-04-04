package boot.mall.mybatis.model;

import java.util.Date;

public class SmsValidate {
    private String phoneNum;

    private String sendCode;

    private Date sendDate;

    private Integer sendCount;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getSendCode() {
        return sendCode;
    }

    public void setSendCode(String sendCode) {
        this.sendCode = sendCode == null ? null : sendCode.trim();
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", sendCode=").append(sendCode);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", sendCount=").append(sendCount);
        sb.append("]");
        return sb.toString();
    }
}