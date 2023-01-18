public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] field = new int[m][n];
        int x = 0;
        while (x < k)
        {
            int randX = (int) (Math.random() * m);
            int randY = (int) (Math.random() * n);
            if (field[randX][randY] == 1);
            else 
            {
                field[randX][randY] = 1;
                x++;
            }
        }
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {   
                int num = 0;
                if (field[i][j] == 1)
                {
                    System.out.print("*  ");
                    continue;
                }
                if (i < m - 1 && field[i + 1][j] == 1) num++;
                if (i > 0 && field[i - 1][j] == 1) num++;
                if (j < n - 1 && field[i][j + 1] == 1) num++;
                if (j > 0 && field[i][j - 1] == 1) num++;
                if (i > 0 && j > 0 && i < m - 1 && j < n - 1)
                {
                    if (field[i - 1][j - 1] == 1) num++;
                    if (field[i + 1][j + 1] == 1) num++;
                    if (field[i - 1][j + 1] == 1) num++;
                    if (field[i + 1][j - 1] == 1) num++;
                }
                String z = Integer.toString(num);
                System.out.print(z + "  ");
            }
            System.out.println();
        }
    }
}
