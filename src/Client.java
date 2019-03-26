import State.RecoverState;
import Weapon.*;
import Monster.*;
import Character_.Character_;
public class Client {

    public static void main(String[] args){

        User user = User.getInstance();
        user.print();
        User test_user = User.getInstance();
        test_user.print();

        Character_ character = new Character_();
        character.attack();
        character.setWeapon(new Sword());
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Wand());
        character.attack();

        Monster slime = new Slime();
        Monster slime1 = slime.clone();

        System.out.println("슬라임" + slime);
        System.out.println("복제슬라임" + slime1);

        slime.attack(character);
        slime1.attack(character);

        character.setState(new RecoverState());
        character.changeState();


    }
}