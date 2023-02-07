public class HTree {
    public static void draw(int N, double sz, double x, double y) {
        if (N == 1) return;
        sz = sz / 2;
        double x0 = x - sz; double x1 = x + sz;
        double y0 = y - sz; double y1 = y + sz;
        StdDraw.line(x0, y, x1, y);
        StdDraw.line(x0, y0, x0, y1);
        StdDraw.line(x1, y0, x1, y1);
        draw(N - 1, sz, x0, y0);
        draw(N - 1, sz, x0, y1);
        draw(N - 1, sz, x1, y0);
        draw(N - 1, sz, x1, y1);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        draw(N, 0.5, 0.5, 0.5);
    }
}
