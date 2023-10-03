public class TestCondition {
    public static void main(String[] args) {
        // Testcase 1: valid
        int h1 = 160;
        int t1 = 18;
        String result1 = condition(h1, t1);
        System.out.println("Testcase 1: " + result1);

        // Testcase 2: invalid
        int h2 = 175;
        int t2 = 22;
        String result2 = condition(h2, t2);
        System.out.println("Testcase 2: " + result2);

        // Testcase 3: valid
        int h3 = 178;
        int t3 = 20;
        String result3 = condition(h3, t3);
        System.out.println("Testcase 3: " + result3);
    }
