public class IntegerRun {
    public static void main(String[] args) {
        int maxRun = 0;
        int maxInt = 0;
        int currentMaxRun = 0;

        for (int i = 1; i < args.length; i++)
        {
            if (args[i].equals(args[i - 1]))
            {
                maxInt = Integer.parseInt(args[i]);
                currentMaxRun++;
                maxRun = currentMaxRun;
            }
            else currentMaxRun = 0;
        }
        System.out.println("Longest run: " + maxRun + " consecutive " + maxInt + "s.");
    }    
}
