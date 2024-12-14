import java.io.*;
import java.util.Scanner;
class array

{
    public static void main(String args[])
    {
        int nums[]={1,3,5,6};
         int n=4;
         int count=0;
        System.out.println(".....The Output.....");
        for(int i=0;i<nums.length-1;i++)
        {
            if(n!=nums[i] && n>nums[i])
            count++;
            else
            {
            System.out.println(count);
            i=nums.length;
            }

            
            
        }
        

    }
}