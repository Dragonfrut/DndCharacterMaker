public class Weapon extends Item {

    private int baseDamage;
    private int dDice;

    public Weapon(String name, String type, int quantity, int cost, int baseDamage, int dDice) {
        super(name, type, quantity, cost);
        this.baseDamage = baseDamage;
        this.dDice = dDice;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getDDice() {
        return dDice;
    }

    public void setDDice(int dDice) {
        this.dDice = dDice;
    }
}
