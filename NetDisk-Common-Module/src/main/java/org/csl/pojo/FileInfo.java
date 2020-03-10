package org.csl.pojo;

public class FileInfo {

	private Long fileId;
	private String fileName;
	private String upCtime;
	private Integer fileState;
	private Long typeId;
	private Long userId;
	private Long adminId;
	private Long downLoadTimes;
	private String md5Code;
	private Long fileSize;
	private String savePath;
	private Long fileScore;
	private String fileStatement;
	
	public FileInfo(Long fileId, String fileName, String upCtime, Integer fileState, Long typeId, Long userId,
			Long adminId, Long downLoadTimes, String md5Code, Long fileSize, String savePath, Long fileScore,
			String fileStatement) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.upCtime = upCtime;
		this.fileState = fileState;
		this.typeId = typeId;
		this.userId = userId;
		this.adminId = adminId;
		this.downLoadTimes = downLoadTimes;
		this.md5Code = md5Code;
		this.fileSize = fileSize;
		this.savePath = savePath;
		this.fileScore = fileScore;
		this.fileStatement = fileStatement;
	}
	public FileInfo() {
		super();
	}
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUpCtime() {
		return upCtime;
	}
	public void setUpCtime(String upCtime) {
		this.upCtime = upCtime;
	}
	public Integer getFileState() {
		return fileState;
	}
	public void setFileState(Integer fileState) {
		this.fileState = fileState;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getMd5Code() {
		return md5Code;
	}
	public void setMd5Code(String md5Code) {
		this.md5Code = md5Code;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public Long getFileScore() {
		return fileScore;
	}
	public void setFileScore(Long fileScore) {
		this.fileScore = fileScore;
	}
	public Long getDownLoadTimes() {
		return downLoadTimes;
	}
	public void setDownLoadTimes(Long downLoadTimes) {
		this.downLoadTimes = downLoadTimes;
	}
	public String getFileStatement() {
		return fileStatement;
	}
	public void setFileStatement(String fileStatement) {
		this.fileStatement = fileStatement;
	}
	
}
