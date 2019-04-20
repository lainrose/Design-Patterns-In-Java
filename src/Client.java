import Item.*;
import Item.Jewelry.Opal;
import Item.Jewelry.Ruby;
import Item.Jewelry.Sapphire;
import State.RecoverState;
import Store.CunningCityStore;
import Store.ElnasStore;
import Store.HennesisStore;
import Store.PotionStore;
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
        System.out.println("슬라임" + ((Slime) slime).getHp());
        ((Slime) slime).setHp(10);
        System.out.println("슬라임" + ((Slime) slime).getHp());

        Monster slime1 = slime.clone();
        System.out.println("슬라임" + ((Slime) slime1).getHp());

        slime.attack(character);
        slime1.attack(character);

        character.setState(new RecoverState());
        character.changeState();

        PotionStore hennesisStore = new HennesisStore();
        hennesisStore.orderItem("hp");
        hennesisStore.orderItem("mp");
        hennesisStore.orderItem("stamina");

        PotionStore cunningCityStore = new CunningCityStore();
        cunningCityStore.orderItem("mp");

        PotionStore elnasStore = new ElnasStore();
        cunningCityStore.orderItem("stamina");


        Item bag = new Bag();
        Item hpPotion = new HpPotion();
        Item mpPotion = new MpPotion();
        ((Bag) bag).addItem(hpPotion);
        ((Bag) bag).addItem(mpPotion);
        bag.use();

        Item bag1 = new Bag();
        Item staminaPorion = new StaminaPotion();
        ((Bag) bag1).addItem(staminaPorion);

        ((Bag) bag).addItem(bag1);

        bag.use();

        Weapon sword = new Sword();
        sword = new Opal(sword);
        sword = new Sapphire(sword);
        sword = new Ruby(sword);
        System.out.println(sword.getName());
        sword.attack();

        Weapon wand = new Sapphire(new Opal(new Wand()));
        System.out.println(wand.getName());
        wand.attack();
    }
}