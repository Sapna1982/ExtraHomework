package ProgramOnMethods;

public class Program2 {
    void myMethod(){
        System.out.println("My Non Static Method");
    }

    public static void main(String[] args) {
        Program2 Program2 = new Program2();
        Program2.myMethod();
    }
}
