public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2: " + result); // 20

        int result2 = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2: " + result2); // 30
    }
}