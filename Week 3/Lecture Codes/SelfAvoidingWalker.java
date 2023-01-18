public class SelfAvoidingWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadends = 0;

        for (int i = 0; i < trials; i++)
        {
            int x = n/2, y = n/2;
            boolean[][] neighborhood = new boolean[n][n];
            while ((x > 0 && x < n-1) && (y > 0 && y < n-1))
            {
                if (neighborhood[x-1][y] && neighborhood[x][y-1] && neighborhood[x+1][y] && neighborhood[x][y+1])
                {
                    deadends++;
                    break;
                }
                neighborhood[x][y] = true;
                double r = Math.random();
                if (r < 0.25) {if (!neighborhood[x+1][y]) x++;}
                else if (r < 0.5) {if (!neighborhood[x-1][y]) x--;}
                else if (r < 0.75) {if (!neighborhood[x][y-1]) y--;}
                else if (r < 1.00) {if (!neighborhood[x][y+1]) y++;};
            }
        }
        System.out.println("Total number of deadends is: " + deadends);
        System.out.println("Chance of hitting a deadend is: %" + ((double) (100 *deadends)/trials));
    }
}
