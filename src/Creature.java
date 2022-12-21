public class Creature {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int str;
    private int dex;
    private int con;
    private int intel;
    private int wis;
    private int cha;
    private int str_mod;
    private int dex_mod;
    private int con_mod;
    private int intel_mod;
    private int wis_mod;
    private int cha_mod;

    public Creature() {
        new Creature("Peasant", 10, 10, 10, 10, 10, 10, 10,
                10, 0, 0, 0, 0, 0, 0);
        System.out.println("Empty Creature constructor call, made a peasant");
    }

    public Creature(String name, int maxHealth, int currentHealth, int str, int dex, int con, int intel,
                    int wis, int cha, int str_mod, int dex_mod, int con_mod,
                    int intel_mod, int wis_mod, int cha_mod) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
        this.str_mod = str_mod;
        this.dex_mod = dex_mod;
        this.con_mod = con_mod;
        this.intel_mod = intel_mod;
        this.wis_mod = wis_mod;
        this.cha_mod = cha_mod;
    }

    // currently acts as an unarmed strike
    public void attack(Creature target) {
        int damageDone = 1 + getStr_mod();
        int initHealth = target.getCurrentHealth();
        target.setCurrentHealth(target.getCurrentHealth() - damageDone);
        System.out.println(target.getName() + " has been hit and takes " + damageDone + " damage.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
        this.str_mod = Modifiers.statModifiers(str);
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
        this.dex_mod = Modifiers.statModifiers(dex);
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
        this.con_mod = Modifiers.statModifiers(con);
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
        this.intel_mod = Modifiers.statModifiers(intel);
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
        this.wis_mod = Modifiers.statModifiers(wis);
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
        this.cha_mod = Modifiers.statModifiers(cha);
    }

    public int getStr_mod() {
        return str_mod;
    }

    public int getDex_mod() {
        return dex_mod;
    }

    public int getCon_mod() {
        return con_mod;
    }

    public int getIntel_mod() {
        return intel_mod;
    }

    public int getWis_mod() {
        return wis_mod;
    }

    public int getCha_mod() {
        return cha_mod;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", health=" + currentHealth + "/" + maxHealth +
                ", str=" + str +
                ", dex=" + dex +
                ", con=" + con +
                ", intel=" + intel +
                ", wis=" + wis +
                ", cha=" + cha +
                ", str_mod=" + str_mod +
                ", dex_mod=" + dex_mod +
                ", con_mod=" + con_mod +
                ", intel_mod=" + intel_mod +
                ", wis_mod=" + wis_mod +
                ", cha_mod=" + cha_mod;
    }
}
