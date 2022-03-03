package com.abc.match.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.match.entity.MatchEntity;

public interface MatchRepository extends JpaRepository<MatchEntity,Integer> {

}
