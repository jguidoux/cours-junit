package bowling;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void should_return_score_with_zero() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        Integer score = Game.score(rolls);
        assertEquals(0, score);
    }

    @Test
    public void should_return_score_with_spare() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(0, 0, 0, 0, 7, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        Integer score = Game.score(rolls);
        assertEquals(14, score);
    }

    @Test
    public void should_return_score_with_strike() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(0, 0, 0, 0, 10, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        Integer score = Game.score(rolls);
        assertEquals(20, score);
    }

    @Test
    public void should_return_score_like_main() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6));
        Integer score = Game.score(rolls);
        assertEquals(133, score);
    }

    @Test
    public void should_return_score_always_strike() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10));
        Integer score = Game.score(rolls);
        assertEquals(300, score);
    }
}