package Monster;

public class Snail implements Monster {

    String name = "Ghost";
    int hp = 500;
    int damage = 100;

    public Snail(){}

    public Snail(Snail snail){
        this.name = snail.name;
        this.hp = snail.hp;
        this.hp = snail.damage;
    }

    @Override
    public Monster clone() {
        System.out.println("달팽이 복제");
        return new Snail(this);
    }

    @Override
    public void attack() {
        System.out.println("달팽이가 공격했습니다.");
    }

}
