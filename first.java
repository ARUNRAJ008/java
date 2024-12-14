import java.io.*;
import java.util.Scanner;
 class leepYear
{
    public static void main(String arg[])
    {
        int year;
        System.out.print("Enter the year....");
        Scanner in = new Scanner(System.in);
        year=in.nextInt();
        if(year%4==0)
        {
            System.out.println(" The Given year is a leep year.....");

        }
        else
        {
            System.out.println("The give year is not a leep year......");
        }
    } 
}