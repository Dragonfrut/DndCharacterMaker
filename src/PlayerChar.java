import java.util.ArrayList;

public class PlayerChar extends Creature {
    private int level;
    private int pBonus;
    private String playerClass;

    public PlayerChar(String name, int level, int pBonus, String playerClass, int maxHealth, int currentHealth, int str,
                      int dex, int con, int intel, int wis, int cha, int str_mod, int dex_mod, int con_mod, int intel_mod, int wis_mod, int cha_mod) {
        super(name, maxHealth, currentHealth, str, dex, con, intel, wis, cha, str_mod, dex_mod, con_mod, intel_mod, wis_mod, cha_mod);
        this.level = level;
        this.pBonus = pBonus;
        this.playerClass = playerClass;
    }

    public void attack(Weapon weapon, Creature target) {
        int maxDamage = weapon.getBaseDamage();
        int damageDone = DiceRoller.diceRoll(maxDamage);
        //int initHealth = target.getCurrentHealth();
        target.setCurrentHealth(target.getCurrentHealth() - damageDone);
        System.out.println(target.getName() + " has been hit with " + weapon.getName() + " and took " + damageDone + " damage.");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }
}
