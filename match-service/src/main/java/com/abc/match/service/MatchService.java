package com.abc.match.service;

import java.util.List;
import com.abc.match.model.Match;


public interface MatchService {
	
    public Match saveMatch(Match match);
	
	public List<Match> getAllMatch();
	
	public Match getMatchById(int matchId);
	
	public void deleteMatch(int matchId);
	
	public Match updateMatch(Match match);

}
