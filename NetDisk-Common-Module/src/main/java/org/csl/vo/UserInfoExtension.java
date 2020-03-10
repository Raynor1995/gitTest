package org.csl.vo;

import org.csl.pojo.UserInfo;

public class UserInfoExtension extends UserInfo{

	private String sexValue;
	private Integer fileUploadCount;
	private Integer fileDownloadCount;
	private String stateValue;
	
	public UserInfoExtension() {
	}

	public UserInfoExtension(Long userId, String userName, String userNiname, String userPwd, String userCtime,
			Integer userState, String userSex, String userEdu, String userPro, String userEmail, String userTel,
			Long userScore, String sexValue, Integer fileUploadCount, Integer fileDownloadCount, String stateValue) {
		super(userId, userName, userNiname, userPwd, userCtime, userState, userSex, userEdu, userPro, userEmail,
				userTel, userScore);
		this.sexValue = sexValue;
		this.fileUploadCount = fileUploadCount;
		this.fileDownloadCount = fileDownloadCount;
		this.stateValue = stateValue;
	}

	public UserInfoExtension(Long userId, String userName, String userNiname, String userPwd, String userCtime,
			Integer userState, String userSex, String userEdu, String userPro, String userEmail, String userTel,
			Long userScore) {
		super(userId, userName, userNiname, userPwd, userCtime, userState, userSex, userEdu, userPro, userEmail,
				userTel, userScore);
	}

	public String getSexValue() {
		return sexValue;
	}

	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}

	public Integer getFileUploadCount() {
		return fileUploadCount;
	}

	public void setFileUploadCount(Integer fileUploadCount) {
		this.fileUploadCount = fileUploadCount;
	}

	public Integer getFileDownloadCount() {
		return fileDownloadCount;
	}

	public void setFileDownloadCount(Integer fileDownloadCount) {
		this.fileDownloadCount = fileDownloadCount;
	}

	public String getStateValue() {
		return stateValue;
	}

	public void setStateValue(String stateValue) {
		this.stateValue = stateValue;
	}
	
}
