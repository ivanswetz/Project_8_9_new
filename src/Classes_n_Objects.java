import java.util.Calendar;

class MyClass{
}
class MyClassWithMethod{
    public void print(String s){
        System.out.println(s);
    }
}
class MyClassWithPrivateMethod{
    private void print(String s){
        System.out.println(s);
    }
}
class MyClassWithConstructor{
    public MyClassWithConstructor(){
        System.out.println("Hello, World!");
    }
}
class MyClass5{
    public int a;
    public String b = "Hiya!";
    public boolean c;
    public double d;
    public void print(){
        System.out.println(b);
    }
}
class Student{
    //VARIABLES
    public String name;
    public String surname;
    private int enrolmentYear;
    private int graduationYear;
    private String program;

    //METHODS
    public Student(){
        name = "NO_NAME";
        surname = "NO_SURNAME";
    }
    public Student(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public void printInfo(){
        System.out.println(name + " " + surname);
    }
    public void setEnrolmentYear(int enrolmentYear){
        this.enrolmentYear = enrolmentYear;
    }
    public int getEnrolmentYear(){
        return enrolmentYear;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public String getProgram(){
        return program;
    }
    public void setGraduationYear(int graduationYear){
        this.graduationYear = graduationYear;
    }
    public int getGraduationYear(){
        return graduationYear;
    }
    public void printFullInformation(){
        System.out.println(name + " " + surname);
        System.out.println(getProgram());
        System.out.println(getEnrolmentYear());
        System.out.println(getGraduationYear());
    }
}

public class Classes_n_Objects {
    public static void main(String[] args){
        MyClass num1 = new MyClass();
        MyClassWithMethod num2 = new MyClassWithMethod();
        num2.print("Hello");
        MyClassWithPrivateMethod num3 = new MyClassWithPrivateMethod();
        //num3.print("Hello");
        MyClassWithConstructor num4 = new MyClassWithConstructor();
        MyClass5 num5 = new MyClass5();
        num5.print();
        Student std1 = new Student("Ivan" , "Shvets");
        std1.setProgram("BDS");
        std1.setEnrolmentYear(2020);
        std1.setGraduationYear(2026);
        std1.printFullInformation();
    }
}


