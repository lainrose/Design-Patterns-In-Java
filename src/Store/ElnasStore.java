package Store;

import Item.*;

public class ElnasStore extends PotionStore{

    public ElnasStore(){
        System.out.println("엘나스 물약 상점");
    }

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
