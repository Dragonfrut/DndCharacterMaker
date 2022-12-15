
public class Modifiers {

    // Checks the value of a stat to decide on a modifier.
    public static int statModifiers(int statValue) {
        int mod = 9999;

        switch (statValue){
            case 1 -> mod = -5;
            case 2,3 -> mod = -4;
            case 4,5 -> mod = -3;
            case 6,7 -> mod = -2;
            case 8,9 -> mod = -1;
            case 10,11 -> mod = 0;
            case 12,13 -> mod = 1;
            case 14,15 -> mod = 2;
            case 16,17 -> mod = 3;
            case 18,19 -> mod = 4;
            case 20,21 -> mod = 5;
            case 22,23 -> mod = 6;
            case 24,25 -> mod = 7;
            case 26,27 -> mod = 8;
            case 28,29 -> mod = 9;
            case 30 -> mod = 10;
            default -> System.out.println("Illegal stat");
        }
        return mod;
    }

    // Calculates health based on class, level and con mod.
    public static int healthCalc(int level, String playerClass, int con_mod) {
        int HitDTwelve = 12;
        int HitDTen = 10;
        int HitDEight = 8;
        int HitDSix = 6;
        int health = 0;
        int hitDice = 1;
        int diceRoll;

        switch (playerClass) {
            case "Barbarian" -> {
                if (level == 1) {
                    health = HitDTwelve + con_mod;
                } else if (level > 1){
                    health = HitDTwelve + con_mod;
                    do {
                        hitDice++;
                        diceRoll = DiceRoller.diceRoll(HitDTwelve);
                        health = health + diceRoll + con_mod;
                    } while (hitDice < level);
                }
            }
            case "Fighter", "Paladin", "Ranger" -> {
                if (level == 1) {
                    health = HitDTen + con_mod;
                } else if (level > 1){
                    health = HitDTen + con_mod;
                    do {
                        hitDice++;
                        diceRoll = DiceRoller.diceRoll(HitDTen);
                        health = health + diceRoll + con_mod;
                    } while (hitDice < level);
                }
            }
            case "Artificer", "Bard", "Cleric", "Druid", "Monk", "Rogue", "Warlock" -> {
                if (level == 1) {
                    health = HitDEight + con_mod;
                } else if (level > 1){
                    health = HitDEight + con_mod;
                    do {
                        hitDice++;
                        diceRoll = DiceRoller.diceRoll(HitDEight);
                        health = health + diceRoll + con_mod;
                    } while (hitDice < level);
                }
            }
            case "Wizard", "Sorcerer" -> {
                if (level == 1) {
                    health = HitDSix + con_mod;
                } else if (level > 1){
                    health = HitDSix + con_mod;
                    do {
                        hitDice++;
                        diceRoll = DiceRoller.diceRoll(HitDSix);
                        health = health + diceRoll + con_mod;
                    } while (hitDice < level);
                }
            }
        }
        return health;
    }
}
