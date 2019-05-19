package Store;

import Item.Item;

import java.util.HashMap;
import java.util.Map;

public abstract class PotionStore {

    public Item orderItem(String name){
        Item potion;
        potion = makePotion(name);
        System.out.println("포션 지급 완료");

        return potion;
    }

    public abstract Item  makePotion(String name);

}