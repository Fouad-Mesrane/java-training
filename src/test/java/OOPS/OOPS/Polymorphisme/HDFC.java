package OOPS.OOPS.Polymorphisme;

public class HDFC extends RBI{
    public static void main(String[] args) {
        HDFC obj = new HDFC();
        double ed_roi = obj.getEducationLoanROI();
        System.out.println(ed_roi);

    }
    public double getHomeLoanROI(){
        return 7.5;
    }
    public double getCarLoanROI(){
        return 9.75;
    }
    public double getEducationLoanROI(){
        return 12.65;
    }

    /*
     *
     *
     * covariant return type: When we use class name as a return type
     * (we can change return type while overriding only if return type is covariant return type)
     * */
    public Integer get (){
        return  20;
    }

}
