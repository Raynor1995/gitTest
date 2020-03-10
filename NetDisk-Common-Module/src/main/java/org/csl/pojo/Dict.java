package org.csl.pojo;

public class Dict {

	private Long dId;
	private Long dCode;
	private String dValue;
	private String dType;
	public Dict(Long dId, Long dCode, String dValue, String dType) {
		super();
		this.dId = dId;
		this.dCode = dCode;
		this.dValue = dValue;
		this.dType = dType;
	}
	public Dict() {
		super();
	}
	public Long getdId() {
		return dId;
	}
	public void setdId(Long dId) {
		this.dId = dId;
	}
	public Long getdCode() {
		return dCode;
	}
	public void setdCode(Long dCode) {
		this.dCode = dCode;
	}
	public String getdValue() {
		return dValue;
	}
	public void setdValue(String dValue) {
		this.dValue = dValue;
	}
	public String getdType() {
		return dType;
	}
	public void setdType(String dType) {
		this.dType = dType;
	}
	
}
