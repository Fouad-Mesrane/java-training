package Arrays.Arrays;

public class Trial {
    public static void main(String[] args) {
        Trial t = new Trial();
        String newString =t.notString("not bad");
        System.out.println(newString);
    }

    public String notString(String str) {
        if (str.equals(str)){
            return "not " + str;
        } else {
            return  str;
        }

    }
}
