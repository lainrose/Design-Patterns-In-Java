package Item.Jewelry;

import Decorator.WeaponDecorator;
import Weapon.*;

public class Ruby extends WeaponDecorator {

    private String name;

    public Ruby(Weapon weapon){
        super(weapon);
        name = "루비";
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
