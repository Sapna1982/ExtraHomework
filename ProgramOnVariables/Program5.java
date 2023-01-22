package ProgramOnVariables;

public class Program5 {

    int SamsungTV;
    int BushTV;
    int SonyTv;

    public static void main(String[] args) {
        Program5 ob1 = new Program5();
        ob1.SamsungTV = 2000;
        ob1.BushTV = 1000;
        ob1.SonyTv = 1500;
        System.out.println("Price of Samsung:" + ob1.SamsungTV + "\nPrice of Bush:" + ob1.BushTV + "\nPrice of Sony:" + ob1.SonyTv);
    }
}
