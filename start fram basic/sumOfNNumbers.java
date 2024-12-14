import java.io.*;
import java.util.Scanner;
public class sumOfNNumbers {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number....");
        int num = in.nextInt();
        int sum = 0;
        for(int i=0;i<=num;i++)
        sum=sum+i;
        System.out.println("The ans is ...."+sum);
    }
    
}
