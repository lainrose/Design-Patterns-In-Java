package Character_;

import State.CharacterState;
import State.PoisonState;
import State.RecoverState;
import Weapon.Weapon;

public class Character_ {

    int hp;
    private Weapon weapon;
    private CharacterState characterState;

    public Character_(){
        hp = 1000;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setState(CharacterState characterState){
        this.characterState = characterState;
    }

    public void changeState(){
        characterState.changedState(this);
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