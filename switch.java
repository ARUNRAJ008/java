import java.io.*;
import java.util.Scanner;
class switchCase
{
    public static void main (String arg[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lutter ");
        char alfa=sc.next().charAt(0);
        switch(alfa)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("vouwouls");
            break;
            default:
            System.out.println("Consnonent...");
        }

    }

}