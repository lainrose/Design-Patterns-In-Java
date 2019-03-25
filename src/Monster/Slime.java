package Monster;

public class Slime implements Monster {

    String name;
    int hp;
    int damage;

    public Slime(){
        name = "Ghost";
        hp = 500;
        damage = 100;
    }

    public Slime(Slime slime){
        this.name = slime.name;
        this.hp = slime.hp;
        this.hp = slime.damage;
    }

    @Override
    public Monster clone() {
        System.out.println("슬라임 복제");
        return new Slime(this);
    }

    @Override
    public void attack() {
        System.out.println("슬라임이 공격했습니다.");
    }

}
