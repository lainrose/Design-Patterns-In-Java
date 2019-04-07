package Store;

import Item.*;

public class CunningCityStore extends PotionStore {

    public CunningCityStore(){
        System.out.println("커닝시티 물약 상점");
    }
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
