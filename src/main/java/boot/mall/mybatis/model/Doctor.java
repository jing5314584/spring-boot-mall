package boot.mall.mybatis.model;

import boot.mall.constants.Common;


public class Doctor {
    private Integer userIdx;

    private String realName;

    private String portraitPath;

    private Integer areaIdx;

    private String areaDistinct;

    private String hospital;

    private Integer departmentIdx;

    private String goodAt;

    private Boolean isDelete;

    private String keyword;

    private Byte onlineStatus;

    private String doctorTitle;

    private Boolean isAssistant;

    private Integer viewOrder;

    private Boolean isShow;

    private Integer hospitalIdx;

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getPortraitPath() {
        return portraitPath;
    }

    public void setPortraitPath(String portraitPath) {
        this.portraitPath = portraitPath == null ? null : portraitPath.trim();
    }

    public Integer getAreaIdx() {
        return areaIdx;
    }

    public void setAreaIdx(Integer areaIdx) {
        this.areaIdx = areaIdx;
    }

    public String getAreaDistinct() {
        return areaDistinct;
    }

    public void setAreaDistinct(String areaDistinct) {
        this.areaDistinct = areaDistinct == null ? null : areaDistinct.trim();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital == null ? null : hospital.trim();
    }

    public Integer getDepartmentIdx() {
        return departmentIdx;
    }

    public void setDepartmentIdx(Integer departmentIdx) {
        this.departmentIdx = departmentIdx;
    }

    public String getGoodAt() {
        return goodAt;
    }

    public void setGoodAt(String goodAt) {
        this.goodAt = goodAt == null ? null : goodAt.trim();
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Byte getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Byte onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getDoctorTitle() {
        return doctorTitle;
    }

    public void setDoctorTitle(String doctorTitle) {
        this.doctorTitle = doctorTitle == null ? null : doctorTitle.trim();
    }

    public Boolean getIsAssistant() {
        return isAssistant;
    }

    public void setIsAssistant(Boolean isAssistant) {
        this.isAssistant = isAssistant;
    }

    public Integer getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Integer viewOrder) {
        this.viewOrder = viewOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Integer getHospitalIdx() {
        return hospitalIdx;
    }

    public void setHospitalIdx(Integer hospitalIdx) {
        this.hospitalIdx = hospitalIdx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userIdx=").append(userIdx);
        sb.append(", realName=").append(realName);
        sb.append(", portraitPath=").append(portraitPath);
        sb.append(", areaIdx=").append(areaIdx);
        sb.append(", areaDistinct=").append(areaDistinct);
        sb.append(", hospital=").append(hospital);
        sb.append(", departmentIdx=").append(departmentIdx);
        sb.append(", goodAt=").append(goodAt);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", keyword=").append(keyword);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", doctorTitle=").append(doctorTitle);
        sb.append(", isAssistant=").append(isAssistant);
        sb.append(", viewOrder=").append(viewOrder);
        sb.append(", isShow=").append(isShow);
        sb.append(", hospitalIdx=").append(hospitalIdx);
        sb.append("]");
        return sb.toString();
    }
    public String getAreaName() {
    	if(this.areaIdx == 1){
    		return "上海";
    	}else{
    		return "北京";
    	}
	}
    public String getDepartmentName() {
		 
			 return Common.getDepartmentByKey(this.departmentIdx);
		
	}
}