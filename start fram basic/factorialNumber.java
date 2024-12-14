import java.io.*;
import java.util.Scanner;
public class factorialNumber {
    public static void main(String []args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number .....");
    int num = in.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++)
    fact=fact*i;
    System.out.println("The factorial  is ....."+fact);
}
    
}
