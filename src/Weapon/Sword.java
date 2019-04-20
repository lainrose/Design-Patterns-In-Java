package Weapon;

public class Sword extends Weapon{

    public Sword(){
        weaponName = "검";
    }

    @Override
    public void attack() {
        System.out.println("검으로 공격하였습니다.");
    }

}