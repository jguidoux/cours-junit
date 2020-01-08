package com.slickteam.bowling;


import com.slickteam.bowling.entity.BowlingGame;
import com.slickteam.bowling.repository.BowlingRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Main.class)
public class RepositoryTest {
    @Autowired
    private BowlingRepository bowlingRepository;

    @BeforeEach
    public void setUp() {
        bowlingRepository.deleteAll();
    }

    @Test
    void name() {
        bowlingRepository.save(new BowlingGame());
    }
}
