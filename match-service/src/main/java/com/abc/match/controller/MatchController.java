package com.abc.match.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.match.model.Match;
import com.abc.match.service.MatchService;


@RestController
@RequestMapping("/match")
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	
	@PostMapping("/save")
	public ResponseEntity<Match> addMatch(@RequestBody Match match)
	{
		Match newMatch = matchService.saveMatch(match);
		return new ResponseEntity<Match>(newMatch, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/all")
	public List<Match> getAllMatchDetails()
	{
		return matchService.getAllMatch();
	}
	
	@GetMapping("/get/{match_id}")
	public ResponseEntity<?> getMatchDetailsById(@PathVariable("match_id") int matchId)
	{
		Match matchDetails = matchService.getMatchById(matchId);
		return new ResponseEntity<>(matchDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{match_id}")
	public void deleteMatch(@PathVariable("match_id") int matchId)
	{
		matchService.deleteMatch(matchId);
	}
	
	@PutMapping("/update}")
	public Match updateMatch(@RequestBody Match match)
	{
		return matchService.updateMatch(match);
	}

}
