public class Fibonacci {
    static long[] memo = new long[100];
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (memo[N] == 0) {
            memo[N] = F(N-1) + F(N-2);}
        return memo[N];
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(F(N));
    }
}
