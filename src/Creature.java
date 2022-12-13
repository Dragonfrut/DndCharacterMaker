public class Creature {

    private String name;
    private int health;
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

    public Creature(){
        System.out.println("Empty Creature constructor call");
    }

    public Creature(String name, int health, int str, int dex, int con, int intel,
                    int wis, int cha, int str_mod, int dex_mod, int con_mod,
                    int intel_mod, int wis_mod, int cha_mod) {
        this.name = name;
        this.health = health;
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

//    public void attack(Weapon weapon, Creature target){
//        int targHP = target.getHealth();
//        int wDamage =
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
        this.str_mod = Modifiers.statModifiers(1, str);
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
        this.dex_mod = Modifiers.statModifiers(2, dex);
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
        this.con_mod = Modifiers.statModifiers(3, con);
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
        this.intel_mod = Modifiers.statModifiers(4, intel);
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
        this.wis_mod = Modifiers.statModifiers(5, wis);
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
        this.cha_mod = Modifiers.statModifiers(6, cha);
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
}
