package bowling;

import java.util.List;

class Game {


    /**
     * score method is used to calculate a bowling score
     * @param rolls a list of int
     * @return int - the bowling total result
     */
    static int score(List<Integer> rolls) {

        int totalResult = 0;
        int index =0;

        for(int i =0;i<10;i++){

            /*if(i == 9 && rolls.get(index) == 10){
                totalResult += 10 + rolls.get(index+1) + rolls.get(index+2);
            }else if(i == 9 && rolls.get(index) + rolls.get(index+1) == 10){
                totalResult += 10 + rolls.get(index+2);
            }else if(i == 9){
                totalResult += rolls.get(index) + rolls.get(index+1);
            }*/

            //if(rolls.get(index) == 10 && i != 9){
            if(rolls.get(index) == 10 ){
                //strike
                totalResult += 10 + rolls.get(index+1) + rolls.get(index+2);
                index++;
            } else {
                if(rolls.get(index) + rolls.get(index+1) == 10){
                    //spare
                    totalResult += 10 + rolls.get(index+2);
                    index = index+2;
                }else{
                    totalResult += rolls.get(index)+rolls.get(index+1);
                    index = index+2;
                }
            }
        }
        return totalResult;
    }
}
