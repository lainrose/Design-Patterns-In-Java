package Item;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Item{

    public Bag(){
        name = "가방";
        System.out.println(name);
    }

    private List<Item> bag = new ArrayList<Item>();

    public void addItem(Item item){
        System.out.println(item.getName() + " 가방에 추가");
        bag.add(item);
    }

    public void removeItem(Item item){
        System.out.println(item.getName() + " 가방에서 삭제");
        bag.remove(item);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void use() {
        System.out.println("------------가방속 아이템 출력-------------");
        for(Item item: bag){
            System.out.println(item.getName());
        }
        System.out.println("-------------------------------------------");
    }
}
