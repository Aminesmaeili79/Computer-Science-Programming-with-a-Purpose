

public class PlayTune {

    public static double[] tone(double hz, double duration)
    {
        int N = (int) (44100 * duration);
        double[] a = new double[N + 1];
        for (int i = 0; i <= N; i++)
        {
            a[i] = Math.sin((2 * Math.PI * i * hz / 44100));
        }
        return a;
    }
    public static void main(String[] args) {
        
        double tempo = Double.parseDouble(args[0]);
        while (!StdIn.isEmpty())
        {
            double pitch = StdIn.readDouble();
            double duration = StdIn.readDouble() * tempo;
            double hz = 440 * Math.pow(2, pitch / 12);

            double[] a = tone(hz, duration);
            StdAudio.play(a);
        }        
    }
}
