package Weapon;

public abstract class Weapon {

    protected String weaponName;

    public abstract void attack();

    public String getName(){
        return weaponName;
    }
}