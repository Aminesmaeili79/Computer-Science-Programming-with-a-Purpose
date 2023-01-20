public class WorldMap {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);

        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        
        while (!StdIn.isEmpty())
        {
            StdIn.readString();
            int vertices = StdIn.readInt();

            double[] xCoordination = new double[vertices];
            double[] yCoordination = new double[vertices];

            for (int i = 0; i < vertices; i++)
            {
                xCoordination[i] = StdIn.readDouble();
                yCoordination[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xCoordination, yCoordination);
        }
        StdDraw.show();
    }
}