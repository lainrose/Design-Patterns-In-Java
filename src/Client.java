public class Client {

    public static void main(String[] args){

        User user = User.getInstance();

        Character character = new Character();
        character.attack();
        character.setWeapon(new Sword());
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Wand());
        character.attack();

    }
}