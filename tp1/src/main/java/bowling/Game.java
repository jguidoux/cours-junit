package bowling;

import java.util.List;

class Game {

    final static int TOTAL_FRAMES_NUMBER = 10;
    final static int TEN_POINTS = 10;
    /**
     * score method is used to calculate a bowling score
     * @param rolls a list of int
     * @return int - the bowling total result
     */
    static int score(List<Integer> rolls) {

        int totalResult = 0;
        int index =0;


        for(int frame =1; frame <= TOTAL_FRAMES_NUMBER ; frame++){

            if(isStrike(rolls, index)){

                totalResult += TEN_POINTS + rolls.get(index+1) + rolls.get(index+2);
                index++;
            } else {
                if(isSpare(rolls, index)){

                    totalResult += TEN_POINTS + rolls.get(index+2);
                    index = index+2;
                }else{
                    totalResult += rolls.get(index)+rolls.get(index+1);
                    index = index+2;
                }
            }
        }
        return totalResult;
    }

    public static Boolean isSpare (List<Integer> rolls, int index) {
        boolean Spare = false;
        if(rolls.get(index) + rolls.get(index+1) == TEN_POINTS){
            Spare = true;
        }
        return Spare;
    }

    public static Boolean isStrike (List<Integer> rolls, int index) {
        boolean Strike = false;
        if(rolls.get(index) == TEN_POINTS){
            Strike = true;
        }
        return Strike;
    }
}
