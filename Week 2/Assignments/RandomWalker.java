public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int i = 0;
        int j = 0;
        int steps = 0;

        System.out.println("(0, 0)");
        while (Math.abs(i) + Math.abs(j) != r)
        {
            double rand = Math.random();

            if (rand < 0.25) i++;
            else if (rand < 0.5) i--;
            else if (rand < 0.75) j++;
            else j--;

            steps += 1;
            System.out.println("(" + i + " ," + j + ")");
        }
        System.out.println("steps = " + steps);
    }
}
