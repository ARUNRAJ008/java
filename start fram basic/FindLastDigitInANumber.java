import java.io.*;
import java.util.Scanner;
public class FindLastDigitInANumber {
public static void main (String []args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number ..");
    int num= in.nextInt();
    System.out.println("The last number is ...."+num%10);

}    
}
