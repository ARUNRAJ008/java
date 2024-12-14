import java.io.*;
class maxpro{
    public static void main(String Args[])
    {
        int arr[]={2,3,-2,4,4,4};
        int out=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            out=arr[i+1];
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length-1;j++)
            {
                int temp=arr[j]*arr[j+1];
                if(temp>out)
                out=temp;               

            }
        }
        System.out.println(out);
    }
}