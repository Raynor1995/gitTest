package org.csl.pojo;

public class FileCheckInfo {

	private Long fcId;
	private Long fileId;
	private Integer checkState;
	private String checkCtime;
	private Long adminId;
	public FileCheckInfo(Long fcId, Long fileId, Integer checkState, String checkCtime, Long adminId) {
		super();
		this.fcId = fcId;
		this.fileId = fileId;
		this.checkState = checkState;
		this.checkCtime = checkCtime;
		this.adminId = adminId;
	}
	public FileCheckInfo() {
		super();
	}
	public Long getFcId() {
		return fcId;
	}
	public void setFcId(Long fcId) {
		this.fcId = fcId;
	}
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public Integer getCheckState() {
		return checkState;
	}
	public void setCheckState(Integer checkState) {
		this.checkState = checkState;
	}
	public String getCheckCtime() {
		return checkCtime;
	}
	public void setCheckCtime(String checkCtime) {
		this.checkCtime = checkCtime;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	
}
