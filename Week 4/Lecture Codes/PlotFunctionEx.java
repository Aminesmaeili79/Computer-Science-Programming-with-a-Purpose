public class PlotFunctionEx {
    public static void main(String[] args) {

        int Percision = Integer.parseInt(args[0]);
        double x_axis[] = new double[Percision + 1];
        double y_axis[] = new double[Percision + 1];

        for (int i = 0; i <= Percision; i++)
        {
            x_axis[i] = (Math.PI * i) / Percision;
            y_axis[i] = Math.sin(4 * x_axis[i]) + Math.sin(20 * x_axis[i]);
        }

        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2 , 2);

        for (int i = 0; i < Percision; i++)
        {
            StdDraw.line(x_axis[i], y_axis[i], x_axis[i + 1], y_axis[i + 1]);
        }
    }
}
