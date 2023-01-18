public class BandMatrix
{
    public static void main(final String[] array) {
        int r = Integer.parseInt(array[0]);
        int width = Integer.parseInt(array[1]);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (j != 0) {
                    System.out.print("  ");
                }
                if (Math.abs(i - j) > width) {
                    System.out.print("0");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}