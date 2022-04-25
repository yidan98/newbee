package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

public class TbNewbeeMallOrder {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.543499+09:00", comments="Source field: tb_newbee_mall_order.order_id")
    private Long orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.order_no")
    private String orderNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.total_price")
    private Integer totalPrice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.pay_status")
    private Byte payStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5474864+09:00", comments="Source field: tb_newbee_mall_order.pay_type")
    private Byte payType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5474864+09:00", comments="Source field: tb_newbee_mall_order.pay_time")
    private Date payTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.order_status")
    private Byte orderStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.extra_info")
    private String extraInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_phone")
    private String userPhone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_address")
    private String userAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.is_deleted")
    private Byte isDeleted;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.order_id")
    public Long getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.order_id")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.order_no")
    public String getOrderNo() {
        return orderNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.order_no")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.total_price")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.total_price")
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.pay_status")
    public Byte getPayStatus() {
        return payStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5464905+09:00", comments="Source field: tb_newbee_mall_order.pay_status")
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5474864+09:00", comments="Source field: tb_newbee_mall_order.pay_type")
    public Byte getPayType() {
        return payType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5474864+09:00", comments="Source field: tb_newbee_mall_order.pay_type")
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5483829+09:00", comments="Source field: tb_newbee_mall_order.pay_time")
    public Date getPayTime() {
        return payTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.pay_time")
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.order_status")
    public Byte getOrderStatus() {
        return orderStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.order_status")
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.extra_info")
    public String getExtraInfo() {
        return extraInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.extra_info")
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo == null ? null : extraInfo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_name")
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_phone")
    public String getUserPhone() {
        return userPhone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_phone")
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_address")
    public String getUserAddress() {
        return userAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.user_address")
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.is_deleted")
    public Byte getIsDeleted() {
        return isDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.is_deleted")
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-04-25T19:52:48.5484836+09:00", comments="Source field: tb_newbee_mall_order.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}