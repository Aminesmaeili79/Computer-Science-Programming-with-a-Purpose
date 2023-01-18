public class RandomWalkers {
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0.0;

        for (int x = 0; x < trials; x++)
        {
            int i = 0;
            int j = 0;
            double steps = 0.0;

            while (Math.abs(i) + Math.abs(j) != r)
            {
                double rand = Math.random();

                if (rand < 0.25) i++;
                else if (rand < 0.5) i--;
                else if (rand < 0.75) j++;
                else j--;

                steps += 1.0;
            }
            totalSteps += steps;
        }
        System.out.println("average number of steps = " + totalSteps / trials);
    }
}
