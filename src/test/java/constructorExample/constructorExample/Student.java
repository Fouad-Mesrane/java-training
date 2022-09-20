package constructorExample.constructorExample;

public class Student {
    String studentName ;
    int rollNum ;

    public Student(String studentName, int rollNum) // this is constructor
    {
        this.studentName = studentName;
        this.rollNum = rollNum;
    }

    public  Student (){}
    public Student (String studentName, int rollNum, long mobile){

    }



    public static void main(String[] args) {
        Student student1 = new Student("Fouad", 101);

        Student student2 = new Student("Asmaa", 102);

        System.out.println(student1.studentName + " " + student1.rollNum );
        System.out.println(student2.studentName + " " + student2.rollNum);






    }
        /*public void provideStudentName(String sName, int rollN){
        studentName = sName;
        rollNum = rollN;
        }*/
}
