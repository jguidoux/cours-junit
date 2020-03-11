package bowling;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class GameTest {


@Test
public void should_return_score_zero () {
    List<Integer> rolls = new ArrayList<>();
    rolls.addAll(asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));     //all Frames

    int result = Game.score(rolls);
    assertEquals(0, result);
}
    @Test
    public void should_return_score_spare () {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(0,0,0,0,0,0,3,7,1,0,0,0,0,0,0,0,0,0,0,0));     //all Frames

        int result = Game.score(rolls);
        assertEquals(12, result);
    }
    @Test
    public void should_return_score_strike () {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(0,0,0,0,0,0,10,7,1,0,0,0,0,0,0,0,0,0,0));     //all Frames

        int result = Game.score(rolls);
        assertEquals(26, result);
    }
    @Test
    public void should_return_score_main_test () {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(7, 3));     // Frame 1
        rolls.addAll(asList(10));     // Frame 2
        rolls.addAll(asList(5, 5));     // Frame 3  => 2 rolls spare
        rolls.addAll(asList(7, 2));     // Frame 4  => 2 rolls spare
        rolls.add(10);                  // Frame 5  => 1 roll strike
        rolls.add(10);     // Frame 6
        rolls.addAll(asList(7, 3));     // Frame 7  => 2 rolls spare
        rolls.addAll(asList(7, 2));     // Frame 8  => 2 rolls spare
        rolls.addAll(asList(5, 3));                  // Frame 9  => 1 roll strike
        rolls.addAll(asList(8, 2, 10));  // Frame 10 => 3 rolls with 1 spare

        int result = Game.score(rolls);
        assertEquals(167, result);
    }
    @Test
    public void should_return_score_only_strike() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(10,10,10,10,10,10,10,10,10,10,10,10));     //all Frames

        int result = Game.score(rolls);
        assertEquals(300, result);
    }
}