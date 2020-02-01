package com.xwx.entity;

public class Score {
	private Integer aid;//面试者ID
	private Integer jid;//职位ID
	private Integer score;//面试职位成绩
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Score [aid=" + aid + ", jid=" + jid + ", score=" + score + "]";
	}
	
	
}	
