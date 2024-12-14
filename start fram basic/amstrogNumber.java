import java.io.*;
import java.util.Scanner;
public class amstrogNumber {
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number....");
        int num = in.nextInt();
        int ams=0;
        int mod=num;
        while(mod>=1)
        {
           int rem= mod%10;
           ams = ams+(rem*rem*rem);
           mod= mod/10;
        }
        if(num==ams)
        System.out.println("The number is amstrong number..."+ams+"number is "+num);
        else
        System.out.println("The number is not a amstrong number...."+ams+"number is "+num);

    }
    
}
