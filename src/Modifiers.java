
public class Modifiers {

    // Checks the value of a stat to decide on a modifier.
    public static int statModifiers(int value) {
        int mod = 100;

        if (value == 1) {
            mod = -5;
        } else if (value == 2 || value == 3) {
            mod = -4;
        } else if (value == 4 || value == 5) {
            mod = -3;
        } else if (value == 6 || value == 7) {
            mod = -2;
        } else if (value == 8 || value == 9) {
            mod = -1;
        } else if (value == 10 || value == 11) {
            mod = 0;
        } else if (value == 12 || value == 13) {
            mod = 1;
        } else if (value == 14 || value == 15) {
            mod = 2;
        } else if (value == 16 || value == 17) {
            mod = 3;
        } else if (value == 18 || value == 19) {
            mod = 4;
        } else if (value == 20 || value == 21) {
            mod = 5;
        } else if (value == 22 || value == 23) {
            mod = 6;
        } else if (value == 24 || value == 25) {
            mod = 7;
        } else if (value == 26 || value == 27) {
            mod = 8;
        } else if (value == 28 || value == 29) {
            mod = 9;
        } else if (value == 30) {
            mod = 10;
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
        int hitDice = 0;

        switch (playerClass) {
            case "Barbarian" -> {
                if (level == 1) {
                    health = HitDTwelve + con_mod;
                } else {
                    do {
                        hitDice++;
                        health = HitDTwelve + con_mod;
                        health = health + DiceRoller.diceRoll(HitDTwelve) + con_mod;
                        System.out.println("health: " + health);
                    } while (hitDice < level);
                }
            }
            case "Fighter", "Paladin", "Ranger" -> {
                if (level == 1) {
                    health = HitDTen + con_mod;
                } else {
                    do {
                        hitDice++;
                        health = HitDTen + con_mod;
                        health = health + DiceRoller.diceRoll(HitDTen) + con_mod;
                        System.out.println("health: " + health);
                    } while (hitDice < level);
                }
            }
            case "Artificer", "Bard", "Cleric", "Druid", "Monk", "Rogue", "Warlock" -> {
                if (level == 1) {
                    health = HitDEight + con_mod;
                } else {
                    do {
                        hitDice++;
                        health = HitDEight + con_mod;
                        health = health + DiceRoller.diceRoll(HitDEight) + con_mod;
                        System.out.println("health: " + health);
                    } while (hitDice < level);
                }
            }
            case "Wizard", "Sorcerer" -> {
                if (level == 1) {
                    health = HitDSix + con_mod;
                } else {
                    do {
                        hitDice++;
                        health = HitDSix + con_mod;
                        health = health + DiceRoller.diceRoll(HitDSix) + con_mod;
                        System.out.println("health: " + health);
                    } while (hitDice < level);
                }
            }
        }
        return health;
    }
}
