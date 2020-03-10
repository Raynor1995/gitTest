package org.csl.vo;

import org.csl.pojo.FileInfo;

public class FileInfoExtension extends FileInfo{

	private String typeName;
	private String stateValue;
	private String userName;
	private String adminName;
	public FileInfoExtension(Long fileId, String fileName, String upCtime, Integer fileState, Long typeId, Long userId,
			Long adminId, Long downLoadTimes, String md5Code, Long fileSize, String savePath, Long fileScore,
			String fileStatement, String typeName, String stateValue, String userName, String adminName) {
		super(fileId, fileName, upCtime, fileState, typeId, userId, adminId, downLoadTimes, md5Code, fileSize, savePath,
				fileScore, fileStatement);
		this.typeName = typeName;
		this.stateValue = stateValue;
		this.userName = userName;
		this.adminName = adminName;
	}
	public FileInfoExtension(Long fileId, String fileName, String upCtime, Integer fileState, Long typeId, Long userId,
			Long adminId, Long downLoadTimes, String md5Code, Long fileSize, String savePath, Long fileScore,
			String fileStatement) {
		super(fileId, fileName, upCtime, fileState, typeId, userId, adminId, downLoadTimes, md5Code, fileSize, savePath,
				fileScore, fileStatement);
	}
	public FileInfoExtension() {
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getStateValue() {
		return stateValue;
	}
	public void setStateValue(String stateValue) {
		this.stateValue = stateValue;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
}
