package com.slickteam.bowling.repository;

import com.slickteam.bowling.entity.BowlingGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BowlingRepository extends JpaRepository<BowlingGame, Long> {}
