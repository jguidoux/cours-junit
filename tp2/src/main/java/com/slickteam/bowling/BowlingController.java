package com.slickteam.bowling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BowlingController {

    private final BowlingService bowlingService;

    @Autowired
    public BowlingController(BowlingService bowlingService) {
        this.bowlingService = bowlingService;
    }

    @GetMapping("/scores")
    public ResponseEntity<List<Integer>> getScores() {
        List<Integer> scores = bowlingService.getScores();

        return (CollectionUtils.isEmpty(scores))
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(scores);
    }
}