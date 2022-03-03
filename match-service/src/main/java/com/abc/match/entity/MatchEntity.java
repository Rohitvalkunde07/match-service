package com.abc.match.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="match_tbl")
public class MatchEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="match_id")
	private int matchId;
	
	@Column(name="team1")
	private String team1;
	
	@Column(name="team2")
	private String team2;
	
	@JsonFormat(pattern="HH:mm:ss")
	@Column(name="started_at")
	private LocalTime startedAt;
	
	@Column(name="match_status")
	private String matchStatus;
	
	@Column(name="match_result")
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

	public void setTeam1(String string) {
		this.team1 = string;
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

	public void setStartedAt(LocalTime localTime) {
		this.startedAt = localTime;
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
