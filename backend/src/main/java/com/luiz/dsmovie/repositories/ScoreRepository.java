package com.luiz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.dsmovie.entities.Score;
import com.luiz.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
