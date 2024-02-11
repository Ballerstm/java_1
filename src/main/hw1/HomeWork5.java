package main.hw1;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println(number1(1));
    }

    static boolean number(int a) {
        return a >= 0 ? false : true;
    }
    static boolean number1(int a) {
        return !(a >= 0);
    }
}