import java.io.*;
import java.util.Scanner;
public class febnosic {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num = in.nextInt();
        int i=2;
        int num1 = 0;
        int num2 = 1;
        int ne;
        System.out.println(num1);
        System.out.println(num2);
        while( i<=num)
        {
          ne=num2+num1;
          num1=num2;
          num2=ne;
          System.out.println(num2);         
          i++;
        }


    }
    
}
