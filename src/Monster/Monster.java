package Monster;

import Character_.Character_;

public interface Monster {

    Monster clone();

    void attack(Character_ character);


}