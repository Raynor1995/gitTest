package org.csl.vo;

import org.csl.pojo.UserScoreIo;

public class UserScoreExtension extends UserScoreIo {

	private String scoreStateValue;
	private String userNiName;


	public UserScoreExtension(Long usId, Long userId, Integer scoreState, Long score, String usCtime) {
		super(usId, userId, scoreState, score, usCtime);
	}


	public UserScoreExtension(Long usId, Long userId, Integer scoreState, Long score, String usCtime,
			String scoreStateValue, String userNiName) {
		super(usId, userId, scoreState, score, usCtime);
		this.scoreStateValue = scoreStateValue;
		this.userNiName = userNiName;
	}


	public UserScoreExtension() {
	}


	public String getScoreStateValue() {
		return scoreStateValue;
	}


	public void setScoreStateValue(String scoreStateValue) {
		this.scoreStateValue = scoreStateValue;
	}


	public String getUserNiName() {
		return userNiName;
	}


	public void setUserNiName(String userNiName) {
		this.userNiName = userNiName;
	}

	
}
