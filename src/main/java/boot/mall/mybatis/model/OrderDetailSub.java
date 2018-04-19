package boot.mall.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDetailSub extends OrderDetailSubKey {
public OrderDetailSub(){
		
	}

	public OrderDetailSub(Integer orderIdx, Integer userIdx,
			Integer productIdx, Integer productNum, BigDecimal productPrice,
			Integer productType, Integer parentIdx, String consignee,
			String address, String phone, Integer invoiceType,
			String invoiceName, Integer shippingState, Date shippingTime,
			String expressNo, String expressName, BigDecimal shippingFee) {
		super.orderIdx = orderIdx;
		this.userIdx = userIdx;
		super.productIdx = productIdx;
		this.productNum = productNum;
		this.productPrice = productPrice;
		this.productType = productType;
		this.parentIdx = parentIdx;
		this.consignee = consignee;
		this.address = address;
		this.phone = phone;
		this.invoiceType = invoiceType;
		this.invoiceName = invoiceName;
		this.shippingState = shippingState;
		this.shippingTime = shippingTime;
		this.expressNo = expressNo;
		this.expressName = expressName;
		this.shippingFee = shippingFee;
	}
    private Integer userIdx;

    private Integer productNum;

    private BigDecimal productPrice;

    private Integer productType;

    private Integer parentIdx;

    private String consignee;

    private String address;

    private String phone;

    private Integer invoiceType;

    private String invoiceName;

    private Integer shippingState;

    private Date shippingTime;

    private String expressNo;

    private String expressName;

    private BigDecimal shippingFee;

    public Integer getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Integer userIdx) {
        this.userIdx = userIdx;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getParentIdx() {
        return parentIdx;
    }

    public void setParentIdx(Integer parentIdx) {
        this.parentIdx = parentIdx;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName == null ? null : invoiceName.trim();
    }

    public Integer getShippingState() {
        return shippingState;
    }

    public void setShippingState(Integer shippingState) {
        this.shippingState = shippingState;
    }

    public Date getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName == null ? null : expressName.trim();
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userIdx=").append(userIdx);
        sb.append(", productNum=").append(productNum);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productType=").append(productType);
        sb.append(", parentIdx=").append(parentIdx);
        sb.append(", consignee=").append(consignee);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", invoiceName=").append(invoiceName);
        sb.append(", shippingState=").append(shippingState);
        sb.append(", shippingTime=").append(shippingTime);
        sb.append(", expressNo=").append(expressNo);
        sb.append(", expressName=").append(expressName);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append("]");
        return sb.toString();
    }
}