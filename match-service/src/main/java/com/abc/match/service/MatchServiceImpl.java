package com.abc.match.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.match.entity.MatchEntity;
import com.abc.match.exception.MatchNotFoundException;
import com.abc.match.model.Match;
import com.abc.match.repository.MatchRepository;
import com.abc.match.util.EntityModelUtil;

@Service
public class MatchServiceImpl implements MatchService {
	
	@Autowired
	private MatchRepository  matchRepository;
	@Override
	public Match saveMatch(Match match) {

		MatchEntity matchEntity = matchRepository.save(EntityModelUtil.matchModelToEntity(match));
		return EntityModelUtil.matchEntityToModel(matchEntity);
		
	}

	@Override
	public List<Match> getAllMatch() {

		List<MatchEntity> matchEntityList = matchRepository.findAll();
		return EntityModelUtil.matchEntityToModelList(matchEntityList);
	}

	@Override
	public Match getMatchById(int matchId) {
		Optional<MatchEntity> optionalmatch = matchRepository.findById(matchId);
		if(optionalmatch.isEmpty())
		{
			throw new MatchNotFoundException("Sorry! match is not existing with id :"+matchId);
		}
		return EntityModelUtil.matchEntityToModel(optionalmatch.get());
	}

	@Override
	public void deleteMatch(int matchId) {
		Optional<MatchEntity> optional = matchRepository.findById(matchId);
		if(optional.isEmpty())
		{
			throw new MatchNotFoundException("Sorry! match is not existing with id :"+matchId);
		}
		matchRepository.deleteById(matchId);
	}

	@Override
	public Match updateMatch(Match match) {
		Optional<MatchEntity> optional = matchRepository.findById(match.getMatchId());
		if(optional.isEmpty())
		{
			throw new MatchNotFoundException("Sorry! match is not existing with id :"+match.getMatchId());
		}
		MatchEntity matchEntity = matchRepository.save(EntityModelUtil.matchModelToEntity(match));
		return EntityModelUtil.matchEntityToModel(matchEntity);	}

}
