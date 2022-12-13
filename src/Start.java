import java.util.Scanner;

public class Start {

    public static PlayerChar opened() {
        Scanner scanner = new Scanner(System.in);
        PlayerChar playerChar = null;

        System.out.println("Would you like to make a new character? (y/n)");
        String makeNew = scanner.nextLine();

        if (makeNew.equals("y") || makeNew.equals("yes")) {
            playerChar = CharacterCreator.characterCreator();
        }

        return playerChar;
    }
}
