package org.csl.pojo;

public class UserLog {

	private Long ulId;
	private Long userId;
	private String doName;
	private String doCtime;
	public UserLog(Long ulId, Long userId, String doName, String doCtime) {
		super();
		this.ulId = ulId;
		this.userId = userId;
		this.doName = doName;
		this.doCtime = doCtime;
	}
	public UserLog() {
		super();
	}
	public Long getUlId() {
		return ulId;
	}
	public void setUlId(Long ulId) {
		this.ulId = ulId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
