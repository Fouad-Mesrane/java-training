package OOPS.OOPS.Polymorphisme;

import java.sql.Wrapper;

public class RBI {
    public double getHomeLoanROI(){
        return 7.0;
    }
    public double getCarLoanROI(){
        return 10.0;
    }
    public double getEducationLoanROI(){
        return 10.0;
    }
    /*
     *
     *
     * covariant return type: When we use class name as a return type
     * (we can change return type while overriding only if return type is covariant return type)
     * */
    public Number get(){
        return 10;
    }
}
