
public class Main {

    public static void main(String[] args) {
        PlayerChar playerChar = Start.opened();
        Weapon weapon = new Weapon("Dagger", "Simple Weapon", 1, 2, 4, 1);

        assert playerChar != null;
        System.out.println(playerChar.toString());
        System.out.println("class= " + playerChar.getPlayerClass() + " ,level= " + playerChar.getLevel());

        playerChar.attack(weapon, playerChar);
        System.out.println("Current health is now " + playerChar.getCurrentHealth() + "/" + playerChar.getMaxHealth());

    }
}
