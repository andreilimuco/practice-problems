package algo;

public class Algo {

    /**
     * Fibonacci Number:   0 1 1 2 3 5 8...
     * Position:           0 1 2 3 4 5 6...
     *
     * Given a number n, print the n-th Fibonacci Number.
     * Input: n = 2
     * Output: 1
     * Input: n = 15
     * Output: 610
     **/

    private static int fib(int n) {
        //answer
        int firstNum = 0;
        int secondNum = 1;

        for(int i = 0; i < n; i++) {
            int sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }

        return firstNum;

    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(fib(n));

    }


}