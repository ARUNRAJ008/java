import java.io.*;
import java.util.Scanner;
public class gcd {
     static int  gcdFind(int min,int max)
    {
        if(max%min==0)
        return min;
        else{
            int rem=min/2;
            while(min>=1)
            {
                if(max%rem==0 && min%rem==0 )
                return rem;
                else
                rem--;
            }
            return 1;
        }

    }
    
    
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numers....");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int min = num1<num2?num1:num2;
        int max = num1>num2?num1:num2;
        System.out.println("The Gcd is "+gcdFind(min,max));

    }
    
    
}
