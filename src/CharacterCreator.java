import java.util.Scanner;

public class CharacterCreator {

    public static PlayerChar characterCreator() {
        PlayerChar playerChar;
        boolean cSelected;
        Scanner scanner = new Scanner(System.in);
        int maxHealth = 0;
        int classNum;
        String playerClass = "Class not Selected";

        // Collect players stats
        System.out.println("enter your characters name");
        String name = scanner.nextLine();
        System.out.println("Please enter stats between 1 and 18");
        System.out.println("enter str");
        int str = scanner.nextInt();
        System.out.println("enter dex");
        int dex = scanner.nextInt();
        System.out.println("enter con");
        int con = scanner.nextInt();
        System.out.println("enter int");
        int intel = scanner.nextInt();
        System.out.println("enter wis");
        int wis = scanner.nextInt();
        System.out.println("enter cha");
        int cha = scanner.nextInt();
        System.out.println("What level are you starting as? (1-20)");
        int level = scanner.nextInt();

        // Get user to select a class. Repeat until a valid class is selected.
        do {
            System.out.println("""
                    Which class do you choose\s
                    1: Artificer
                    2: Barbarian
                    3: Bard
                    4: Cleric
                    5: Druid
                    6: Fighter
                    7: Monk
                    8: Paladin
                    9: Ranger
                    10: Rogue
                    11: Sorcerer
                    12: Warlock
                    13: Wizard
                    Please enter the corresponding number""");
            classNum = scanner.nextInt();
            cSelected = true;
            switch (classNum) {
                case 1 -> playerClass = "Artificer";
                case 2 -> playerClass = "Barbarian";
                case 3 -> playerClass = "Bard";
                case 4 -> playerClass = "Cleric";
                case 5 -> playerClass = "Druid";
                case 6 -> playerClass = "Fighter";
                case 7 -> playerClass = "Monk";
                case 8 -> playerClass = "Paladin";
                case 9 -> playerClass = "Ranger";
                case 10 -> playerClass = "Rogue";
                case 11 -> playerClass = "Sorcerer";
                case 12 -> playerClass = "Warlock";
                case 13 -> playerClass = "Wizard";
                default -> {
                    System.out.println("A proper class was not selected, please try again.");
                    cSelected = false;
                }
            }
        } while (!cSelected);

        // Create character
        playerChar = new PlayerChar(name, level, Modifiers.proBonus(level), playerClass, maxHealth, maxHealth, str, dex, con, intel, wis, cha,
                Modifiers.statModifiers(str), Modifiers.statModifiers(dex),
                Modifiers.statModifiers(con), Modifiers.statModifiers(intel),
                Modifiers.statModifiers(wis), Modifiers.statModifiers(cha));

        // update the characters health
        playerChar.setMaxHealth(Modifiers.healthCalc(level, playerClass, playerChar.getCon_mod()));
        playerChar.setCurrentHealth(playerChar.getMaxHealth());
        return playerChar;

    }
}
