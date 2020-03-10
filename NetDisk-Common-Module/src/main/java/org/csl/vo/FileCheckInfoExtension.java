package org.csl.vo;

import org.csl.pojo.FileCheckInfo;

public class FileCheckInfoExtension extends FileCheckInfo{

	private String fileName;
	private String userNiname;
	private String upCtime;
	private Long fileScore;
	private String typeName;
	private Long downLoadTimes;
	
	public FileCheckInfoExtension(Long fcId, Long fileId, Integer checkState, String checkCtime, Long adminId) {
		super(fcId, fileId, checkState, checkCtime, adminId);
	}

	public FileCheckInfoExtension(Long fcId, Long fileId, Integer checkState, String checkCtime, Long adminId,
			String fileName, String userNiname, String upCtime, Long fileScore, String typeName, Long downLoadTimes) {
		super(fcId, fileId, checkState, checkCtime, adminId);
		this.fileName = fileName;
		this.userNiname = userNiname;
		this.upCtime = upCtime;
		this.fileScore = fileScore;
		this.typeName = typeName;
		this.downLoadTimes = downLoadTimes;
	}

	public FileCheckInfoExtension() {
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUserNiname() {
		return userNiname;
	}

	public void setUserNiname(String userNiname) {
		this.userNiname = userNiname;
	}

	public String getUpCtime() {
		return upCtime;
	}

	public void setUpCtime(String upCtime) {
		this.upCtime = upCtime;
	}

	public Long getFileScore() {
		return fileScore;
	}

	public void setFileScore(Long fileScore) {
		this.fileScore = fileScore;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Long getDownLoadTimes() {
		return downLoadTimes;
	}

	public void setDownLoadTimes(Long downLoadTimes) {
		this.downLoadTimes = downLoadTimes;
	}

	
}
