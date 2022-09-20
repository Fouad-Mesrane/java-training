package Arrays.Arrays;

public class Sample {
    public static void main(String[] args) {
        Sample s = new Sample();
        int res= s.getOtp();
        System.out.println(res);


    }

    public int getOtp(){
       int otp = (int)(Math.random()*10000);
        return otp;
    }
}
