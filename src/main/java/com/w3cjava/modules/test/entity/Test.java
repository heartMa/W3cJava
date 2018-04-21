/**
 * Copyright &copy; 2018-2030 <a href="http://www.w3cjava.com/">W3cjava</a> All rights reserved.
 */
package com.w3cjava.modules.test.entity;

import java.util.Date;

import com.w3cjava.common.config.Global;
import com.w3cjava.common.persistence.DataEntity;


/**
 * 
 * @version v1.0.0
 * @author heartma
 * @date 2017年12月27日
 * @File User.java
 * @URL www.w3cjava.com
 * @Desc 用户Entity
 */
public class Test extends DataEntity<Test> {

	private static final long serialVersionUID = 1L;
	private String loginName;// 登录名
	private String password;// 密码
	private String no; // 工号
	private String name; // 姓名
	private String email; // 邮箱
	private String phone; // 电话
	private String mobile; // 手机
	private String userType;// 用户类型
	private String loginIp; // 最后登陆IP
	private Date loginDate; // 最后登陆日期
	private String loginFlag; // 是否允许登陆
	private String photo; // 头像
	private String qrCode; // 二维码
	private String oldLoginName;// 原登录名
	private String newPassword; // 新密码
	private String sign;// 签名
	private String areaName;// 区域名称
	private String oldLoginIp; // 上次登陆IP
	private Date oldLoginDate; // 上次登陆日期

	public Test() {
		super();
		this.loginFlag = Global.YES;
	}

	public Test(String id) {
		super(id);
	}

	public Test(String id, String loginName) {
		super(id);
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getOldLoginName() {
		return oldLoginName;
	}

	public void setOldLoginName(String oldLoginName) {
		this.oldLoginName = oldLoginName;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getOldLoginIp() {
		return oldLoginIp;
	}

	public void setOldLoginIp(String oldLoginIp) {
		this.oldLoginIp = oldLoginIp;
	}

	public Date getOldLoginDate() {
		return oldLoginDate;
	}

	public void setOldLoginDate(Date oldLoginDate) {
		this.oldLoginDate = oldLoginDate;
	}

	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", password=" + password
				+ ", no=" + no + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", mobile=" + mobile + ", userType="
				+ userType + ", loginIp=" + loginIp + ", loginDate="
				+ loginDate + ", loginFlag=" + loginFlag + ", photo=" + photo
				+ ", qrCode=" + qrCode + ", oldLoginName=" + oldLoginName
				+ ", newPassword=" + newPassword + ", sign=" + sign
				+ ", areaName=" + areaName + ", oldLoginIp=" + oldLoginIp
				+ ", oldLoginDate=" + oldLoginDate + "]";
	}
}