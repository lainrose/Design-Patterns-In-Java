public class User {
    private static User user = null;

    private User(){}

    public static synchronized User getInstance(){
        if(user == null){
            user = new User();
        }
        return user;
    }
}