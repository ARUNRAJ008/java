import java.io.*;
import java.util.Scanner;
class SumOfTwoNumbers {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number one...");
        int num1 = in.nextInt();
        System.out.println("Enter the number two...");
        int num2 = in.nextInt();
        int ans = num1+num2;
        System.out.println("The ans is ...."+ans+".....!");


    }

}