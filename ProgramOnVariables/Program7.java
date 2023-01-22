package ProgramOnVariables;

public class Program7 {
    static int count = 1;

    public void increment() {
    }

    public void decrement() {
    }

    {
        count++;
        count--;
    }

    public static void main(String[] args) {

        ProgramOnVariables.Program7 obj1 = new ProgramOnVariables.Program7();
        ProgramOnVariables.Program7 obj2 = new ProgramOnVariables.Program7();
        obj1.increment();
        obj2.decrement();
        System.out.println("obj1: count is =" + obj1.count);
        System.out.println("obj2: count is =" + obj2.count);
    }
}