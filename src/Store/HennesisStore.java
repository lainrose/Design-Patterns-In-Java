package Store;


import Item.*;

import java.util.HashMap;
import java.util.Map;

public class HennesisStore extends PotionStore {

    Map<String, Item> Items = new HashMap<String, Item>();

    public HennesisStore(){
        System.out.println("헤네시스 물약 상점");
    }

    @Override
    public Item makePotion(String name) {

        Item item = Items.get(name);

        if (name.equals("hp")){
            if (item == null){
                Items.put(name, new HpPotion());
            }
            return item;
        }
        else if (name.equals("mp")){
            if (item == null){
                Items.put(name, new MpPotion());
            }
            return item;
        }
        else{
            return null;
        }
    }
}
