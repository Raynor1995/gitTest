package org.csl.pojo;

public class AdminLog {
	private Long alogId;
	private Long adminId;
	private String doName;
	private String doCtime;
	public AdminLog() {
		super();
	}
	public AdminLog(Long alogId, Long adminId, String doName, String doCtime) {
		super();
		this.alogId = alogId;
		this.adminId = adminId;
		this.doName = doName;
		this.doCtime = doCtime;
	}
	public Long getAlogId() {
		return alogId;
	}
	public void setAlogId(Long alogId) {
		this.alogId = alogId;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getDoName() {
		return doName;
	}
	public void setDoName(String doName) {
		this.doName = doName;
	}
	public String getDoCtime() {
		return doCtime;
	}
	public void setDoCtime(String doCtime) {
		this.doCtime = doCtime;
	}
}
