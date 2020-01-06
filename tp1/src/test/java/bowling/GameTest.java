package bowling;

import java.util.ArrayList;
import java.util.List;

class GameTest {

    private List<Integer> rollMany(int rollsNumber, int pins) {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < rollsNumber; i++) {
            rolls.add(pins);
        }
        return rolls;
    }
}