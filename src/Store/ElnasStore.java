package Store;

import Item.*;

public class ElnasStore extends PotionStore{
    @Override
    public Item makePotion(String name) {

        if (name.equals("hp")){
            return new HpPotion();
        }
        else if(name.equals("mp")){
            return new MpPotion();
        }
        else if(name.equals("stamina")){
            return new StaminaPotion();
        }
        else{
            return null;
        }

    }
}
