package Item.Jewelry;

import Decorator.WeaponDecorator;
import Weapon.Weapon;

public class Sapphire extends WeaponDecorator {

    private String name;

    public Sapphire(Weapon weapon){
        super(weapon);
        name = "사파이어";
    }

    @Override
    public void attack() {
        System.out.print(name + "의 ");
        weapon.attack();
    }

    @Override
    public String getName() {
        return name + "의 " + weapon.getName();
    }

}
