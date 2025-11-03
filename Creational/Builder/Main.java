public class Main {
    public static void main(String[] args) {
        User user= new User.UserBuilder()
            .setEmailId("pearl.rathour33@gmail.com")
            .setUserName("Pearl")
            .setUserId("USR123")
            .build();

        System.out.println(user);
    }
    
}
