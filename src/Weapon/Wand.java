package Weapon;

public class Wand extends Weapon{

    public Wand(){
        weaponName = "완드";
    }

    @Override
    public void attack() {
        System.out.println("완드로 공격하였습니다.");
    }

}