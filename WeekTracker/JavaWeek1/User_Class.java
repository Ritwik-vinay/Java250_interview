package JavaWeek1;

public class User_Class {
    static String Email;
    static String Name;
    static String Password;
    static void getUserDetails(){
        System.out.println(Name);
        System.out.println(Email);

        System.out.println(Password);
    }
    static void setUserDetails(String name, String email, String password){
        Email= email;
        Name= name;
        Password= password;
    }

    public static void main(String[] args) {
        User_Class.setUserDetails("Ritwik", "rvTest@gmail.com","I am Luckiest");
        User_Class.getUserDetails();
        User_Class.setUserDetails("Ritwik2", "rvTest2@gmail.com","I am Luckiest");
        User_Class.getUserDetails();
        
    }
}
