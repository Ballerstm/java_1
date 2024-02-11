package main.hw1;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println(calc(3, 4, 5, 6));
    }
    static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
}
