package ProgramOnVariables;

public class Program6 {
    static int count = 5;

    public void decrement() {
        count--;
    }

    public static void main(String[] args) {

        ProgramOnVariables.Program6 obj1 = new ProgramOnVariables.Program6();
        ProgramOnVariables.Program6 obj2 = new ProgramOnVariables.Program6();
        obj1.decrement();
        obj2.decrement();
        System.out.println("obj1: count is =" + obj1.count);
        System.out.println("obj2: count is =" + obj2.count);
    }
}
