package org.csl.pojo;

public class AdminInfo {
	private Long adminId;
	private String adminName;
	private String adminPwd;
	private Integer adminState;
	private String adminCtime;
	private Long roleId;
	public AdminInfo(Long adminId, String adminName, String adminPwd, Integer adminState, String adminCtime,
			Long roleId) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminState = adminState;
		this.adminCtime = adminCtime;
		this.roleId = roleId;
	}
	public AdminInfo() {
		super();
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public Integer getAdminState() {
		return adminState;
	}
	public void setAdminState(Integer adminState) {
		this.adminState = adminState;
	}
	public String getAdminCtime() {
		return adminCtime;
	}
	public void setAdminCtime(String adminCtime) {
		this.adminCtime = adminCtime;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
