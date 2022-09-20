package OOPS.OOPS.Polymorphisme;

public class SBI extends RBI {
    public static void main(String[] args) {


//        SBI sbi = new SBI();
//        double home_roi = sbi.getHomeLoanROI();
//        //System.out.println(home_roi);
//        RBI ref = new SBI(); // polymorphic reference
//        System.out.println(ref.getHomeLoanROI());
    }
    public double getHomeLoanROI(){
        return 8.0;
    }
    public double getCarLoanROI(){
        return 10.5;
    }
    public double getEducationLoanROI(){
        return 11.25;
    }
}
