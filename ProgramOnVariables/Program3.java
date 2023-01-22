package ProgramOnVariables;

public class Program3 {
    static int count = 1;
    public void increment()
    {
        count++;
    }

    public static void main(String[] args) {

        Program3 obj1 = new Program3();
        Program3 obj2 = new Program3();
        obj1.increment();
        obj2.increment();
        System.out.println("obj1: count is =" + obj1.count);
        System.out.println("obj2: count is =" + obj2.count);


    }
    }