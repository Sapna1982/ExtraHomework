package ProgramOnForLoop;

public class Program10 {
    public static void main(String[] args) {
        int n = 10000;
        int o = 25000;
        do {
            System.out.println(n >= o);
            n--;
            o++;
        }
        while (n <= 1500);
        while (o >= 2000);
    }
}
