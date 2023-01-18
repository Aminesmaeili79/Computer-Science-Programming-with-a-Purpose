public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] sequence = new boolean[n];
        int x = 1;

        while (x < n)
        {
            int i = 0;
            while (i < x)
            {
                int z = x+i;
                if (z == sequence.length) break;
                sequence[z]= !sequence[i];
                i++;
            }
            x *= 2;
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j< n; j++)
            {
                if (sequence[i] == sequence[j])
                {
                    System.out.print("+  ");
                }
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}