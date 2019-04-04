package Item;

public class MpPotion extends Item {

    public MpPotion(){
        name = "mp포션";
    }

    @Override
    public void use() {
        System.out.println("MP포션을 사용");
    }
}
