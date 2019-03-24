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