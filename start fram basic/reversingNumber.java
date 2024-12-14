import java.io.*;
import java.util.Scanner;
public class reversingNumber {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number....");
        int num = in.nextInt();
        int rev=0;
        while(num>=1)
        {
            
            rev=(rev*10)+(num%10);
            num=num/10;
        }
        System.out.println("The revers number is .... "+rev);
    }
    
}
