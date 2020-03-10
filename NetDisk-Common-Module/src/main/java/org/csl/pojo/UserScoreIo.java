package org.csl.pojo;

public class UserScoreIo {

	private Long usId;
	private Long userId;
	private Integer scoreState;
	private Long score;
	private String usCtime;
	public UserScoreIo(Long usId, Long userId, Integer scoreState, Long score, String usCtime) {
		super();
		this.usId = usId;
		this.userId = userId;
		this.scoreState = scoreState;
		this.score = score;
		this.usCtime = usCtime;
	}
	public UserScoreIo() {
		super();
	}
	public Long getUsId() {
		return usId;
	}
	public void setUsId(Long usId) {
		this.usId = usId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getScoreState() {
		return scoreState;
	}
	public void setScoreState(Integer scoreState) {
		this.scoreState = scoreState;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	public String getUsCtime() {
		return usCtime;
	}
	public void setUsCtime(String usCtime) {
		this.usCtime = usCtime;
	}
	
}
