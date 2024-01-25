public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(printName1("Вадим", "Сергей", "Ангелина"));
    }

    private static String printName(String name) {
        return "Привет, " + name + "!";
    }

    private static String printName1(String name, String name1, String name2) {
        return String.format("Привет, %s, %s, %s!", name, name1, name2);
    }

}