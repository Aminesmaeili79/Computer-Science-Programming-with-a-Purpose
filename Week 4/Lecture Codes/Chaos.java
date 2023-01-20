public class Chaos {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        double c = Math.sqrt(3) / 2;
        double cx[] = {0.0 , 1.0, 0.5};
        double cy[] = {0.0, 0.0, c};

        double x = 0.0;
        double y = 0.0;
        StdDraw.setPenRadius(0.005);

        for (int i = 0; i < N; i++)
        {
            int r = (int) (Math.random() * 3);
            x = ((cx[r]) + x) / 2;
            y = ((cy[r] + y) / 2);
            StdDraw.point(x, y);
        }
    }
}
