package ProgramOnVariables;

public class Program9 {
    static int age;
    static String name;
    static int year;


    static void display(){
        System.out.println(" Age is: "+age);
        System.out.println(" Name is: "+name);
        System.out.println(" Year; "+year);
    }

    public static void main(String[] args) {

        age = 15;
        name = "Pratham";
        year = 10;
        display();

        age = 13;
        name = "Simran";
        year = 9;
        display();

        age = 11;
        name = "Devin";
        year = 7;
        display();
    }

}

