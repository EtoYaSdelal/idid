package algorithms.recursion;

public class RecRunner {
    public static void main(String[] args) {
        System.out.println("5! = " + rec(5) + " " + circle(5));
    }

    public static int rec(int x) {
        if (x == 1)
            return x;
        return x * rec(x - 1);
    }

    public static int circle(int x) {
        int result = x;
        while (x != 1) {
            result = result * --x;
        }
        return result;
    }
}
