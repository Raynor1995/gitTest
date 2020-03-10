package org.csl.vo;

import org.csl.pojo.RoleInfo;

public class RoleExtension extends RoleInfo{

	private String stateValue;

	public RoleExtension(Long roleId, String roleName, String roleCtime, Integer roleState, String stateValue) {
		super(roleId, roleName, roleCtime, roleState);
		this.stateValue = stateValue;
	}

	public RoleExtension(Long roleId, String roleName, String roleCtime, Integer roleState) {
		super(roleId, roleName, roleCtime, roleState);
	}

	public RoleExtension() {
	}

	public String getStateValue() {
		return stateValue;
	}

	public void setStateValue(String stateValue) {
		this.stateValue = stateValue;
	}

	@Override
	public String toString() {
		return "RoleExtension [getRoleId()=" + getRoleId() + ", getRoleName()=" + getRoleName() + ", getRoleCtime()="
				+ getRoleCtime() + ", getRoleState()=" + getRoleState() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
