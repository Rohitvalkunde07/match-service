package com.abc.match.util;

import java.util.ArrayList;
import java.util.List;

import com.abc.match.entity.MatchEntity;
import com.abc.match.model.Match;

public class EntityModelUtil {
	public static MatchEntity matchModelToEntity(Match match) {
		MatchEntity matchEntity = new MatchEntity();

		matchEntity.setMatchId(match.getMatchId());
		matchEntity.setScheduleId(match.getScheduleId());
		matchEntity.setStartedAt(match.getStartedAt());
		matchEntity.setMatchStatus(match.getMatchStatus());
		matchEntity.setMatchResult(match.getMatchResult());

		return matchEntity;
	}

	public static Match matchEntityToModel(MatchEntity matchEntity) {
		Match match = new Match();

		match.setMatchId(matchEntity.getMatchId());
		match.setScheduleId(matchEntity.getScheduleId());
		match.setStartedAt(matchEntity.getStartedAt());
		match.setMatchStatus(matchEntity.getMatchStatus());
		match.setMatchResult(matchEntity.getMatchResult());

		return match;
	}

	public static List<Match> matchEntityToModelList(List<MatchEntity> entityList) {
		List<Match> matchList = new ArrayList<>();

		entityList.forEach(entity -> {

			Match match = new Match();
			match.setMatchId(entity.getMatchId());
			match.setScheduleId(entity.getScheduleId());
			match.setStartedAt(entity.getStartedAt());
			match.setMatchStatus(entity.getMatchStatus());
			match.setMatchResult(entity.getMatchResult());

			matchList.add(match);
		});
		return matchList;
	}

}