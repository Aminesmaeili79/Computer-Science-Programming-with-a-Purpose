public class RemoveDuplicate {
    public static void main(String[] args) {
        // int maxRun = 0;
        // int maxInt = 0;
        // int currentMaxRun = 0;

        for (int i = 0; i < args.length; i++)
        {
            if (i == 0) System.out.print(args[i] + " ");
            else if (args[i].equals(args[i - 1]))
            {
                // maxInt = Integer.parseInt(args[i]);
                // currentMaxRun++;
                // maxRun = currentMaxRun;
            }
            else
            {
                System.out.print(args[i] + " ");
            }
        }
    }    
}
