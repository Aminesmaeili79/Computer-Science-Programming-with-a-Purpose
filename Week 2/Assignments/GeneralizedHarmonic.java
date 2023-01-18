public class GeneralizedHarmonic
{
    public static void main(final String[] array) {
        int n = Integer.parseInt(array[0]);
        int r = Integer.parseInt(array[1]);
        double x = 0;
        for (int i = 1; i <= n; i++) {
            x += 1 / Math.pow(i, r);
        }
        System.out.println(x);
    }
}