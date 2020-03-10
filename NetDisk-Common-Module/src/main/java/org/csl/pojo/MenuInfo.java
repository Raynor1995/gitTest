package org.csl.pojo;

public class MenuInfo {

	private Long menuId;
	private String menuName;
	private String menuUrl;
	private Long pmenuId;
	private String menuIcon;
	private String menuCtime;
	private Integer menuState;
	public MenuInfo(Long menuId, String menuName, String menuUrl, Long pmenuId, String menuIcon, String menuCtime,
			Integer menuState) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.pmenuId = pmenuId;
		this.menuIcon = menuIcon;
		this.menuCtime = menuCtime;
		this.menuState = menuState;
	}
	public MenuInfo() {
		super();
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public Long getPmenuId() {
		return pmenuId;
	}
	public void setPmenuId(Long pmenuId) {
		this.pmenuId = pmenuId;
	}
	public String getMenuIcon() {
		return menuIcon;
	}
	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}
	public String getMenuCtime() {
		return menuCtime;
	}
	public void setMenuCtime(String menuCtime) {
		this.menuCtime = menuCtime;
	}
	public Integer getMenuState() {
		return menuState;
	}
	public void setMenuState(Integer menuState) {
		this.menuState = menuState;
	}
	
}
