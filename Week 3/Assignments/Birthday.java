public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double cumulativeMatches = 0;
        int numberOfPerson = 2;

        System.out.print(1 + "\t");
        System.out.print(0 + "\t");
        System.out.println(0.0);

        while (cumulativeMatches/trials < 0.5)
        {
            int matches = 0;
            for (int i = 0; i < trials; i++)
            {
                boolean[] isSameBirthday = new boolean[n];
                outerloop:
                while (true)
                {
                    for (int x = 0; x < numberOfPerson; x++)
                    {
                        int r = (int) (Math.random() * n);
                        if (isSameBirthday[r])
                        {
                            matches += 1;
                            break outerloop;
                        }
                        else isSameBirthday[r] = true;
                    }
                    break;
                }
            }
            cumulativeMatches += matches;
            System.out.print(numberOfPerson + "\t");
            System.out.print(matches + "\t");
            System.out.println(cumulativeMatches / trials);
            numberOfPerson++;
        }
    }
}