package Weapon;

public class Knife extends Weapon {

    public Knife(){
        weaponName = "나이프";
    }

    @Override
    public void attack() {
        System.out.println("단검으로 공격하였습니다.");
    }

}