package Item;

public class MpPotion extends Item {

    public MpPotion(){
        name = "mp포션";
        System.out.println(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void use() {
        System.out.println("MP포션을 사용");
    }
}
