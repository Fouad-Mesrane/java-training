package OOPS.OOPS.Polymorphisme;

public class SampleWebsite extends RBI {
    public static void main(String[] args) {

        SampleWebsite ref = new SampleWebsite();
        double rate = ref.getRate("SBI","Home");
        System.out.println(rate);

    }
        public double getRate (String bankName, String loanType){
        if (bankName.equalsIgnoreCase("SBI") && loanType.equalsIgnoreCase("Home") ){
        RBI ref = createObject(bankName);
        return ref.getHomeLoanROI();



        }else if (bankName.equalsIgnoreCase("HDFC") && loanType.equalsIgnoreCase("Car")){
           RBI ref = createObject(bankName);
            return ref.getCarLoanROI();

        }else {
            return 0;
        }
        }

        public static RBI createObject (String newObj){
            if (newObj.equalsIgnoreCase("sbi")){

                return new SBI();
            }else if (newObj.equalsIgnoreCase("HDFC")){
               return  new HDFC();
            }
            return new RBI();
        }

}
