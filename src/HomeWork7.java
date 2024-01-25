public class HomeWork7 {
    public static void main(String[] args) {
        System.out.println(year(1800));
    }

    static String year(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            return "Год високосный";
        } else {
            return "Год не високосный";
        }
    }
}




