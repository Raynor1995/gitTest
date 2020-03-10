package org.csl.pojo;

public class UserInfo {
	private Long userId;
	private String userName;
	private String userNiname;
	private String userPwd;
	private String userCtime;
	private Integer userState;
	private String userSex;
	private String userEdu;
	private String userPro;
	private String userEmail;
	private String userTel;
	private Long userScore;
	public UserInfo(Long userId, String userName, String userNiname, String userPwd, String userCtime,
			Integer userState, String userSex, String userEdu, String userPro, String userEmail, String userTel,
			Long userScore) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userNiname = userNiname;
		this.userPwd = userPwd;
		this.userCtime = userCtime;
		this.userState = userState;
		this.userSex = userSex;
		this.userEdu = userEdu;
		this.userPro = userPro;
		this.userEmail = userEmail;
		this.userTel = userTel;
		this.userScore = userScore;
	}
	public UserInfo() {
		super();
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNiname() {
		return userNiname;
	}
	public void setUserNiname(String userNiname) {
		this.userNiname = userNiname;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserCtime() {
		return userCtime;
	}
	public void setUserCtime(String userCtime) {
		this.userCtime = userCtime;
	}
	public Integer getUserState() {
		return userState;
	}
	public void setUserState(Integer userState) {
		this.userState = userState;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserEdu() {
		return userEdu;
	}
	public void setUserEdu(String userEdu) {
		this.userEdu = userEdu;
	}
	public String getUserPro() {
		return userPro;
	}
	public void setUserPro(String userPro) {
		this.userPro = userPro;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public Long getUserScore() {
		return userScore;
	}
	public void setUserScore(Long userScore) {
		this.userScore = userScore;
	}
	
}
