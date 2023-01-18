public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int[] cumulative = new int[args.length - 1];
        cumulative[0] = Integer.parseInt(args[1]);

        for (int i = 2, j = 1; i < args.length; i++, j++)
        {
            cumulative[j] = Integer.parseInt(args[i]) + cumulative[j-1];
        }

        int i = 0;
        
        while (i < m)
        {
            int j = 0;
            int r = (int) (Math.random() * cumulative[cumulative.length - 1]);
            while (j < cumulative.length)
            {
                if (r < cumulative[j])
                {
                    System.out.print((j + 1) + " ");
                    break;
                }
                else j++;
            }
            i++;
        }
    }
}
