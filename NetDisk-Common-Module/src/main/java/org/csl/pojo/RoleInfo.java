package org.csl.pojo;

public class RoleInfo {

	private Long roleId;
	private String roleName;
	private String roleCtime;
	private Integer roleState;
	public RoleInfo(Long roleId, String roleName, String roleCtime, Integer roleState) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleCtime = roleCtime;
		this.roleState = roleState;
	}
	public RoleInfo() {
		super();
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleCtime() {
		return roleCtime;
	}
	public void setRoleCtime(String roleCtime) {
		this.roleCtime = roleCtime;
	}
	public Integer getRoleState() {
		return roleState;
	}
	public void setRoleState(Integer roleState) {
		this.roleState = roleState;
	}
	
}
