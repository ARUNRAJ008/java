import java.io.*;
import java.util.Scanner;
public class primeNumber {
    public static void main (String arg[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();
        int n=1;
        for(int i=num/2;i>=2;--i)
        {
            if(num%i==0)
            {   
                i=0;
                n=0;
            }
            
        }
        if(n==1)
        System.out.println("The number is  a prime number ....");
        else
        System.out.println("The numerb is not a prime number....");
    }
}
