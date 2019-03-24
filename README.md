# Design Patterns In Java

게임으로 시나리오를 구성하여 디자인 패턴을 배우자

## Table of Contents


[1. 유저를 생성하자. [싱글톤 패턴]](#singleton)

[2. 캐릭터를 만들고 무기를 장착하자. [스트레티지 패턴]](#strategy)
  



[유저를 생성하자 - Singleton](/src/User.java)
------------

The singleton pattern ensures that only one object of a particular class is ever created.
All further references to objects of the singleton class refer to the same underlying instance.
There are very few applications, do not overuse this pattern!

#### Example:

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

#### Usage

```java
User myUser = User.getInstance();
myUser.print();

User testUser = User.getInstance();
testUser.print();
```

#### Output

```
객체의 주소 : User@3498ed
객체의 주소 : User@3498ed
```
