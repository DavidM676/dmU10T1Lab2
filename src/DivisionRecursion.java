public class DivisionRecursion {
    public static void main(String [] args) {
        System.out.println(recursiveDivision(9999999));
    }

    // this recursive method returns a value
    public static int recursiveDivision(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + recursiveDivision(num / 2);
        }
    }
}
