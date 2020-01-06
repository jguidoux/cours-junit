package bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {


        /* FIRST GAME */
        List<Integer> firstGameRolls = getFirstGameRolls();
        // Should print 133
        System.out.println(Game.score(firstGameRolls));


        /* SECOND GAME */
        List<Integer> secondGameRolls = getSecondGameRolls();
        // Should print 300
        System.out.println(Game.score(secondGameRolls));


//        Exercice 2
//        String fileName = "score1.csv";
//        String fileContent = FileReader.readClassPathResourceFileContent(fileName);
//        List<List<Integer>> gamesRolls = new BowlingCsvParser().parse(fileContent);
//
//        gamesRolls.forEach(game ->
//                System.out.println(Game.score(game)));

    }

    private static List<Integer> getSecondGameRolls() {
        // Only strike on this game
        return IntStream.range(0, 12)
                .map(i -> 10)
                .boxed()
                .collect(Collectors.toList());
    }

    private static List<Integer> getFirstGameRolls() {
        List<Integer> rolls = new ArrayList<>();
        rolls.addAll(asList(1, 4));     // Frame 1
        rolls.addAll(asList(4, 5));     // Frame 2
        rolls.addAll(asList(6, 4));     // Frame 3  => 2 rolls spare
        rolls.addAll(asList(5, 5));     // Frame 4  => 2 rolls spare
        rolls.add(10);                  // Frame 5  => 1 roll strike
        rolls.addAll(asList(0, 1));     // Frame 6
        rolls.addAll(asList(7, 3));     // Frame 7  => 2 rolls spare
        rolls.addAll(asList(6, 4));     // Frame 8  => 2 rolls spare
        rolls.add(10);                  // Frame 9  => 1 roll strike
        rolls.addAll(asList(2, 8, 6));  // Frame 10 => 3 rolls with 1 spare
        return rolls;
    }
}
