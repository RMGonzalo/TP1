package tp.pr0;

public class MathsFunctions {

    // Método factorial
    public static int factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Método combinatorio: n sobre k
    public static int combinatorial(int n, int k) {
        if (k < 0 || n < 0) {
            return -1;
        }
        if (k > n) {
            return 0;
        }
        // Fórmula: n! / (k! * (n - k)!)
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}