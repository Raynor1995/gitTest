package org.csl.pojo;

import java.util.List;

public class RoleMenuRel extends RoleInfo{

	private List<MenuInfo> menuList;
	private String stateValue;
	public RoleMenuRel(Long roleId, String roleName, String roleCtime, Integer roleState, List<MenuInfo> menuList,
			String stateValue) {
		super(roleId, roleName, roleCtime, roleState);
		this.menuList = menuList;
		this.stateValue = stateValue;
	}
	public RoleMenuRel(Long roleId, String roleName, String roleCtime, Integer roleState) {
		super(roleId, roleName, roleCtime, roleState);
	}
	public RoleMenuRel() {
	}
	public List<MenuInfo> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<MenuInfo> menuList) {
		this.menuList = menuList;
	}
	public String getStateValue() {
		return stateValue;
	}
	public void setStateValue(String stateValue) {
		this.stateValue = stateValue;
	}
	
	
}
