public class HomeWork4 {
    public static void main(String[] args) {
//        System.out.println(number(0));
//        System.out.println(number(-1));
//        System.out.println(number(1));
//        System.out.println(number(Integer.MAX_VALUE));
//        System.out.println(number(Integer.MIN_VALUE));
        System.out.println(number1(-2));
    }

    //    static String number (int a){
//        if (a>=0) {
//            return "число положительное";
//        }else{
//            return "число отрицательное";
//        }
//
//    }
    static boolean number(int a) {
        return a >= 0;
    }

    static String number1(int a) {
        return a >= 0 ? "число положительное" : "число отрицательное";

    }
}