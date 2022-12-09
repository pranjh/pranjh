public class JavaExample
{
    public static void main(String args[])
    {
        int row, column, numberofRows=8;
        for(row=0; row<numberofRows;row++)
         {
             for (column=0; column<=row; column++)
             {
                 System.out.print("* ");
             }
             //This is just to print the starts in line
             System.out.println();
         }
    }
}
