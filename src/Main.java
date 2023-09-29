public class Main {


    public static void main(String[] args) {
        int sum = add(10, 5);
        System.out.println(sum); // Prints 15
    }


    // 1. add

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 2. add
    public static int add(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }


    // 3. morningGreeting
    public static String morningGreeting(String a) {
        String morning ="早上好, " + a + "!";
        return morning;
    }


    // 4. afternoonGreeting
    public static String afternoonGreeting(String b) {
        String afternoon = "下午好, " + b + "!";
        return afternoon;
    }
    // 5. triple
    public static String triple(String a){
        return a+a+a;
    }
    // 6. half
    public static double half(double a){
        double i = a/2;
        return i;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        a = a + 0.5;
        return (int) a;
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        a = a - 0.5;
        int i = (int)a;
        return i;
    }
}