public class CouponCollector {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        boolean[] found = new boolean[N];
        int cards = 0;
        int collected = 0;
        
        while (collected < N)
        {
            int r = (int) (Math.random()*N);
            if (!found[r])
            {
                collected += 1;
                found[r] = true;
            }
            cards++;
        }
        System.out.println(cards);
    }
}
