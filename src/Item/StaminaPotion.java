package Item;

public class StaminaPotion extends Item {

    public StaminaPotion(){
        name = "stamina포션";
    }
    @Override
    public void use() {
        System.out.println("stamina포션 사용");
    }
}
