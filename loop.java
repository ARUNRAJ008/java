import java.io.*;
import java.util.Scanner;
public class loop {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        for(int i=1;i<=num; i++)
        {
            for(int j=1;j<=num;j++)
            {
            if(i==1||i==num)
            System.out.print("*");
            else if(j==1||j==num)
            System.out.print('*');
            else
            System.out.print(" ");
            }
            System.out.println("");
           // else
           // {
           //     for(int j=1;j<=num;j++)
           // System.out.print("*");
           // }

        }
    }
    
}
