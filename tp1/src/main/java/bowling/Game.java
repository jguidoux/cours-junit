package bowling;

import java.util.List;

class Game {

    // Calculate scores
    static int score(List<Integer> rolls) {

        // Initialize variables
        int ball1 = 0;
        int ball2 = 0;
        int ball3 = 0;
        int totalByRoll = 0;
        int index = 0;
        int score = 0;

        // All 10 frames
        for (int i = 0; i < 10; i++) {
                // Strike
                if(rolls.get(index) == 10) {
                    ball1 = rolls.get(index);
                    ball2 = rolls.get(index+1);
                    ball3 = rolls.get(index+2);
                    totalByRoll = ball1 + ball2 + ball3;
                    index++;

                } else {
                    ball1 = rolls.get(index);
                    ball2 = rolls.get(index+1);
                    totalByRoll = ball1 + ball2;

                    //Spare
                    if(totalByRoll == 10) {
                        totalByRoll += rolls.get(index+2);
                    }
                    index+=2;
                }
            score += totalByRoll;
        }
        return score;
    }
}
