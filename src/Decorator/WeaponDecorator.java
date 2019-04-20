package Decorator;

import Weapon.*;

public abstract class WeaponDecorator extends Weapon {
     protected Weapon weapon;

    public WeaponDecorator(Weapon weapon){
        this.weapon = weapon;
    }

    public abstract String getName();
}