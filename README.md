# Design Patterns In Java

게임으로 시나리오를 구성하여 디자인 패턴을 배우자

## Table of Contents


[1. 유저를 생성하자. [싱글톤 패턴]](#Singleton)

[2. 캐릭터를 만들고 무기를 장착하자. [스트레티지 패턴]](#strategy)
  

디자인 패턴
==========

>많은 사람들이 수많은 시간동안 개발하면서 여러 형태의 문제들을 해결해왔는데,
>
>이러한 검증된 좋은 해결 방법을 패턴이라는 이름하에 정리한 것이다.

[유저를 생성하자 - Singleton](/src/User.java)
   ------------
   
   The singleton pattern ensures that only one object of a particular class is ever created.
   All further references to objects of the singleton class refer to the same underlying instance.
   There are very few applications, do not overuse this pattern!
   
   #### 예제
   ```java
   public class User {
       private static User user = null;
   
       private User(){}
   
       public static synchronized User getInstance(){
           if(user == null){
               user = new User();
           }
           return user;
       }
   
       public void print(){
           System.out.println("객체의 주소 : " + this);
       }
   }
   ```
   
   #### 사용법
   ```java
   public class Client {
   
       public static void main(String[] args){
   
           User user = User.getInstance();
           user.print();
           User test_user = User.getInstance();
           test_user.print();
       }
   }
   ```
   
   #### Output
   ```
   객체의 주소 : User@3498ed
   객체의 주소 : User@3498ed
   ```

[캐릭터를 만들고 무기를 장착하자 - Strategy](/src/User.java)
------------

The strategy pattern is used to create an interchangeable family of algorithms
from which the required process is chosen at run-time.

#### 예제
```java
public interface Weapon {

    public void attack();
}
```

```java
public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("검으로 공격하였습니다.");
    }
}
```

```java
public class Wand implements Weapon{
    @Override
    public void attack() {
        System.out.println("완드로 공격하였습니다.");
    }
}
```

```java
public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("단검으로 공격하였습니다.");
    }
}
```

```java
public class Character {

    private Weapon weapon;

    public void walk(){
        System.out.println("걷기");
    }

    public void jump(){
        System.out.println("점프");
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon == null){
            System.out.println("무기가 없습니다.");
        }
        else{
            weapon.attack();
        }
    }
}
```

#### 사용법
```java
public class Client {

    public static void main(String[] args){

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
```

#### Output
```
무기가 없습니다.
검으로 공격하였습니다.
단검으로 공격하였습니다.
완드로 공격하였습니다.
```