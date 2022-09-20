package OOPS.OOPS.Polymorphisme;

public class ValidateLoginFunctionality {
    public void doLogin(String email, String Password){
        System.out.println("Logged in successfully ");
    }
    public void doLogin(long mobile, String Password) {
        System.out.println("Logged in successfully \n using mobile number");
    }


    public static void main(String[] args) {
        ValidateLoginFunctionality login = new ValidateLoginFunctionality();
        login.doLogin(7207575814L,"fouad");

    }

}
