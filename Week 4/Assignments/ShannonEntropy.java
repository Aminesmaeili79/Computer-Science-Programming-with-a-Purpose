public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int totalCount = 0;
        Double[] countOfIntegers = new Double[m];
        double enthropyResult = 0;
        
        for (int i = 0; i < m; i++)
        {
            countOfIntegers[i] = 0.0;
        }

        while (!StdIn.isEmpty())
        {
            int x = StdIn.readInt();
            countOfIntegers[x - 1]++;
            totalCount++;
        }
        for (int i = 0; i < m; i++)
        {
            if ((double) (countOfIntegers[i]) / totalCount != 0)
            {
            enthropyResult += (((double) (countOfIntegers[i]) / totalCount) * (Math.log((double) (countOfIntegers[i]) / totalCount) / Math.log(2)));
            }
        }
        StdOut.printf("%.4f", -enthropyResult);
    }
}
