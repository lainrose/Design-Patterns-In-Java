package State;

import Character_.Character_;

public class PoisonState implements CharacterState{


    @Override
    public void changedState(Character_ character) {
        for(int i = 0 ; i < 10; i++){
            character.setHp(character.getHp()-1);

        }
        System.out.println("체력이 10 감소했습니다." + character.getHp());
    }
}
