package JavaWeek2;

public class LoginWithOverLoading {
    public static void main(String[] args) {
        //Create a login() method with overloading for different login types (email, phone, OTP).
        Login login = new Login();
        login.login_with_Parameter("rvistheBest@gmail.com");
        login.login_with_Parameter("rvLucky@gmail.com" , 987653215);
        login.login_with_Parameter("luckyrv@gmail.com" ,789741854,987654);

    }
}
class Login{
    void login_with_Parameter(String email){
        System.out.println("Login with " + email);
    }
    void login_with_Parameter(String email, int phone){
        System.out.println("Login with "+ email + " "+ phone);
    }
    void login_with_Parameter(String email, int phone, int otp){
        System.out.println( "Login with "+ email + " "+ phone +" "+ otp);
    }
}
