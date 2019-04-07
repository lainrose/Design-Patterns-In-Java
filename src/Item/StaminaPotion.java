package Item;

public class StaminaPotion extends Item {

    public StaminaPotion(){
        name = "stamina포션";
        System.out.println(name);
    }
    @Override
    public void use() {
        System.out.println("stamina포션 사용");
    }
}
