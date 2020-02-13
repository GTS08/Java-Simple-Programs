import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        String xstr, ystr;
        float f;
        boolean success = false;
        
        while(!success)
        {
            try
            {
                Scanner input =  new Scanner(System.in);
                System.out.println("Give an integer value for x.");
                xstr = input.nextLine();
                System.out.println("Give an integer value for y.");
                ystr = input.nextLine();
                int x = Integer.parseInt(xstr);
                int y = Integer.parseInt(ystr);
                f = (x-7)*y/(x-2);
                System.out.println("The result is " + f);
                success = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You should have given an integer.");
                System.out.println("Please, enter the values again.");
            }
            catch(ArithmeticException e)
            {
                System.out.println("The x should have been different from 2.");
            }
        }
    }
}