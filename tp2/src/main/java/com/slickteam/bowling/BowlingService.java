package com.slickteam.bowling;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BowlingService {

    public List<Integer> getScores() {

        List<List<Integer>> games = readAndParseCsvFile();

        return games.stream()
                .map(Game::score)
                .collect(Collectors.toList());
    }

    private List<List<Integer>> readAndParseCsvFile() {
        String fileContent = FileReader.readClassPathResourceFileContent("score.csv");
        return new BowlingCsvParser().parse(fileContent);
    }
}
