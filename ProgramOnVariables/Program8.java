package ProgramOnVariables;

public class Program8 {
    static int age;
    static String name;


    static void display(){
        System.out.println(" Age is: "+age);
        System.out.println(" Name is: "+name);
    }

    public static void main(String[] args) {

        age = 40;
        name = "Sapna";
        display();

        age = 40;
        name = "Alpesh";
        display();

    }

}
