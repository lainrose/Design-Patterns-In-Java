package Store;

import Item.*;

public class CunningCityStore extends PotionStore {
    @Override
    public Item makePotion(String name) {

        if (name.equals("mp")){
            return new MpPotion();
        }
        else {
            return null;
        }
    }
}
