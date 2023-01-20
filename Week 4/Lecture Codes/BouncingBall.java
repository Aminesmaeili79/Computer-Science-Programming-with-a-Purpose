public class BouncingBall {
    public static void main(String[] args) {
        double rx = 0.5; double ry = 0.5;
        double vx = 0.015; double vy = 0.008;
        double radius = 0.05;

        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        while (true)
        {
            StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
            StdDraw.filledSquare(0, 0, 1);

            if (Math.abs(rx + vx) + radius > 1)
            {
                vx = -vx;
                // StdAudio.play("");
            }
            if (Math.abs(ry + vy) + radius > 1)
            {
                vy = -vy;
                // StdAudio.play("");
            }

            rx += vx;
            ry += vy;

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);
            // StdDraw.picture(rx, ry, "");
            StdDraw.pause(20);
        }
    }
}
