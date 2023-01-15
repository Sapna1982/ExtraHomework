package ProgramOnForLoop;

public class Program9 {
    public static void main(String[] args) {
        int l = 1000;
        int m = 2500;
        do {
            System.out.println(l >= m);
            l--;
            m++;
        }
        while (l <= 150);
        while (m >= 200);
    }
}
