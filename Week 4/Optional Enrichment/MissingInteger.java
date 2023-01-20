public class MissingInteger {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        boolean[] foundIntegers = new boolean[n];

        for (int i = 1; i < args.length; i++)
        {
            if (Integer.parseInt(args[i]) < 1 || Integer.parseInt(args[i]) > n) continue;
            if (!foundIntegers[Integer.parseInt(args[i]) - 1])
            {
                foundIntegers[Integer.parseInt(args[i]) - 1] = true;
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (!foundIntegers[i]) System.out.print(i + 1 + " ");
        }
        System.out.println();
    }    
}
