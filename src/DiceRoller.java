import java.util.Random;

public class DiceRoller {

    public static int diceRoll(int diceSize) {
        Random diceRoller = new Random();
        final int minRandom = 1;
        int roll = diceRoller.nextInt(diceSize - minRandom + 1) + minRandom;
        return roll;
    }
}
