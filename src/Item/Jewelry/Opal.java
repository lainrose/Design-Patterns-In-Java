package Item.Jewelry;

import Decorator.WeaponDecorator;
import Weapon.Weapon;

public class Opal extends WeaponDecorator {

    private String name;

    public Opal(Weapon weapon){
        super(weapon);
        name = "오팔";
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
