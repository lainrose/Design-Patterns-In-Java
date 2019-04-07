package Store;


import Item.*;

public class HennesisStore extends PotionStore {

    public HennesisStore(){
        System.out.println("헤네시스 물약 상점");
    }

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
