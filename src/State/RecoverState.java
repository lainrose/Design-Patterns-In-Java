package State;

import Character_.Character_;

public class RecoverState implements CharacterState{

    @Override
    public void changedState(Character_ character) {
        for(int i = 0 ; i < 10; i++){
            character.setHp(character.getHp()+10);
        }
        System.out.println("체력이 100 증가했습니다." + character.getHp());
    }
}
