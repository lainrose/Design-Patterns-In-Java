import Weapon.*;
import Monster.*;

public class Client {

    public static void main(String[] args){

        User user = User.getInstance();
        user.print();
        User test_user = User.getInstance();
        test_user.print();

        Character character = new Character();
        character.attack();
        character.setWeapon(new Sword());
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Wand());
        character.attack();

        Monster slime = new Slime();
        slime.attack();
        Monster slime1 = slime.clone();
        slime1.attack();

        System.out.println("슬라임" + slime);
        System.out.println("복제슬라임" + slime1);

    }
}