package com.abc.match.model;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Match {
	private int matchId;
	private int scheduleId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss") 
	private LocalTime startedAt;
	private String matchStatus;
	private String matchResult;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public LocalTime getStartedAt() {
		return startedAt;
	}
	public void setStartedAt(LocalTime startedAt) {
		this.startedAt = startedAt;
	}
	public String getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}
	public String getMatchResult() {
		return matchResult;
	}
	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}
	
	

}
