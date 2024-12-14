import java.util.Scanner;
class felding 
{
    public void catching()
    {
        System.out.println("can tack a catch ..."); 
    }
    public void throwing()
    {
        System.out.println("can hit the stemp ...");
    }
}
 class bowler extends felding 
 {
    felding obj = new felding();
     bowler()
    {
        obj.catching();
        obj.throwing();
        System.out.println("Can sping the ball...");
    }
   

 }
 class bating extends felding
 {
    felding obj = new felding();
     bating()
    {
    obj.catching();
    obj.throwing();
    System.out.println("we can Hit six ....");
    }

 }
  class cricket 
  {
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("  1.BATS MAN..");
        System.out.println("  2.BOWLER ..");
        System.out.println("  3.ALLROUNDER..");
        System.out.println("  4.WEKEEPER...");
        System.out.println("  Enter the number who your ...");
        System.out.println("*************************************");
        int who=in.nextInt();

        switch (who) {
            case 1:
                bating ba = new bating();
                break;
           
            case 2:
                bowler bo = new bowler();
                break;
           
            case 3:
                System.out.println("Will be update later...?");

                break;
           
            case 4:
            System.out.println("Con't bowl...");
            
            bating ba2=new bating();


                break;

        
            default:
            System.out.println("Enter the valed number only ....!");
                break;
        }

    }
  }