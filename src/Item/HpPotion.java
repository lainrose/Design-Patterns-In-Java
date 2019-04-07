package Item;

public class HpPotion extends Item{

    public HpPotion(){
        name = "hp포션";
        System.out.println(name);
    }

    @Override
    public void use() {
        System.out.println("hp 포션 사용");
    }
}
