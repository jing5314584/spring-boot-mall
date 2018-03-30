package boot.mall.mybatis.model;

import java.util.Date;

public class UserToken {
    private Integer userIdx;

    private String token;

    private Date endTime;

    private String ipAddress;

    private String deviceid;

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userIdx=").append(userIdx);
        sb.append(", token=").append(token);
        sb.append(", endTime=").append(endTime);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", deviceid=").append(deviceid);
        sb.append("]");
        return sb.toString();
    }
}