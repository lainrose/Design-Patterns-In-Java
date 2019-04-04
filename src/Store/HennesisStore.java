package Store;


import Item.*;

public class HennesisStore extends PotionStore {

    Item hpPotion = new HpPotion();
    @Override
    public Item makePotion(String name) {

        if (name.equals("hp")){
            return new HpPotion();
        }
        else if (name.equals("mp")){
            return new MpPotion();
        }
        else{
            return null;
        }
    }
}
