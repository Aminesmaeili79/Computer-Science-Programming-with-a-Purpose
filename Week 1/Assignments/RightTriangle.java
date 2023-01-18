public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = (a + b + c) - (max + min);

        boolean isRightTriangle = (min*min + mid*mid == max*max);

        System.out.println(isRightTriangle);
    }
}
