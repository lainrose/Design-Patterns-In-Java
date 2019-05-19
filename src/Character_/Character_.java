package Character_;

import Weapon.Weapon;

public class Character_ {

    private final String name;
    private int level;
    private int hp;
    private int mp;
    private int str;
    private int dex;
    private int int_;
    private int luk;

    public static class Builder {
        private final String name;

        private int level = 1;
        private int hp = 50;
        private int mp = 200;
        private int str = 4;
        private int dex = 4;
        private int int_ = 4;
        private int luk = 4;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setLevel(int level) {
            this.level = level;
            return this;
        }

        public Builder setHp(int hp) {
            this.hp = hp;
            return this;
        }

        public Builder setMp(int mp) {
            this.mp = mp;
            return this;
        }

        public Builder setStr(int str) {
            this.str = str;
            return this;
        }

        public Builder setDex(int dex) {
            this.dex = dex;
            return this;
        }

        public Builder setInt_(int int_) {
            this.int_ = int_;
            return this;
        }

        public Builder setLuk(int luk) {
            this.luk = luk;
            return this;
        }

        public Character_ build(){
            return new Character_(this);
        }
    }

    public Character_(Builder builder){
        name = builder.name;
        level = builder.level;
        hp = builder.hp;
        mp = builder.mp;
        str = builder.str;
        dex = builder.dex;
        int_ = builder.int_;
        luk = builder.luk;
    }

    private Weapon weapon;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void walk(){
        System.out.println("걷기");
    }

    public void jump(){
        System.out.println("점프");
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null){
            System.out.println("무기가 없습니다.");
        }
        else{
            weapon.attack();
        }
    }
}