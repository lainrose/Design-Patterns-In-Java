package Item;

public class MpPotion extends Item {

    public MpPotion(){
        name = "mp포션";
        System.out.println(name);
    }

    @Override
    public void use() {
        System.out.println("MP포션을 사용");
    }
}
