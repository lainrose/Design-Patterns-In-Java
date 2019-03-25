package Monster;

public class Ghost implements Monster {

    String name = "Ghost";
    int hp = 500;
    int damage = 100;

    public Ghost(){}

    public Ghost(Ghost ghost){
        this.name = ghost.name;
        this.hp = ghost.hp;
        this.hp = ghost.damage;
    }

    @Override
    public Monster clone() {
        System.out.println("고스트 복제");
        return new Ghost(this);
    }

    @Override
    public void attack() {
        System.out.println("고스트가 공격했습니다.");
    }

}
