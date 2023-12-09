
public class Factorial {

    public static void main(String[] args) {
            long r = facByIterative(30);
            System.out.println(r);
            ///////
            long currentTime = System.nanoTime();
            factByrecursive(20);
            long nTime = System.nanoTime();
            System.out.println("rec time: " + (nTime - currentTime) );
    }

    static long facByIterative(int n) {
        long currentTime = System.nanoTime();

        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }

        long nTime = System.nanoTime();
        System.out.println("iterative time: " + (nTime - currentTime) );
        return sum;
    }

    static long factByrecursive(int n) {
        if (n==0 || n==1) {
            return 1;
        } else {
            return n * factByrecursive( n - 1);
        }
    }
}
