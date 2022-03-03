package com.abc.match.model;

import java.time.LocalTime;

public class Match {
	private int matchId;
	private String team1;
	private String team2;
	private LocalTime startedAt;
	private String matchStatus;
	private String matchResult;
	
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
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
