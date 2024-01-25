public class HomeWork3 {
    public static void main(String[] args) {
       // System.out.println(sum(15, 5));
        System.out.println(sum1(21, 34));

        System.out.println(sum1(9, 19));
        System.out.println(sum1(9, 1));

        System.out.println(sum1(10, 19));
        System.out.println(sum1(10, 0));

        System.out.println(sum1(11, 3));
        System.out.println(sum1(11, 19));

        System.out.println(sum1(1, 19));
        System.out.println(sum1(9, 19));

        System.out.println(sum1(-1, 20));
        System.out.println(sum1(10, 20));

        System.out.println(sum1(-2, 21));
        System.out.println(sum1(11, 21));

    }

//    static boolean sum(int a, int b) {
//        if (a + b >= 10 && a + b <= 20) {
//            return true;
//        } else {
//            return false;
//        }
//  }
    static boolean sum1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
