
public class Main {

    public static void main(String[] args) {
        PlayerChar playerChar = Start.opened();
        Weapon weapon = new Weapon("Dagger", "Simple Weapon", 2, 4, 1);

        assert playerChar != null;
        System.out.println("Your name is " + playerChar.getName() + " and you have " + playerChar.getHealth() + "hp");

        System.out.println("Your characters Strength is " + playerChar.getStr() + " with a modifier of " + playerChar.getStr_mod());
        System.out.println("Your characters Dexterity is " + playerChar.getDex() + " with a modifier of " + playerChar.getDex_mod());
        System.out.println("Your characters Constitution is " + playerChar.getCon() + " with a modifier of " + playerChar.getCon_mod());
        System.out.println("Your characters Intelligence is " + playerChar.getIntel() + " with a modifier of " + playerChar.getIntel_mod());
        System.out.println("Your characters Wisdom is " + playerChar.getWis() + " with a modifier of " + playerChar.getWis_mod());
        System.out.println("Your characters Charisma is " + playerChar.getCha() + " with a modifier of " + playerChar.getCha_mod());


    }
}
