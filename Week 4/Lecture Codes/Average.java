public class Average 
{
    public static void main(String[] args)
    {
        double sum = 0;
        int count = 0;

        StdOut.println("Enter your values to calculate the average: ");
        
        while (!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            count++;
            sum += x;
        }
        StdOut.println("The average of entered values is: " + sum / count);
    }
}