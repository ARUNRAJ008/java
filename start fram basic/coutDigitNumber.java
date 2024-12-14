import java.io.*;
import java.util.Scanner;
public class coutDigitNumber {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=in.nextInt();
        int count=0;
        while(num>=1){
            num=num/10;
            count++;
        }
        System.out.println("The digets of the number is ...."+count);
    }
    
}
