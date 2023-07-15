package closest_minmax;

import java.util.Arrays;
import java.util.Scanner;

class maxmin
{
    public void minmax(int n,int[] array,int max,int min)
    {
        int latestminindex=-1;
        int latestmaxindex=-1;
        int result=n;
        for(int i=0;i<n;i++)
        {
            if(array[i]==min)
            {
                latestminindex=i;
                if(latestmaxindex>=0)
                {
                    result=Math.min(result,i-latestmaxindex+1);
                }
            }
            if(array[i]==max)
            {
                latestmaxindex=i;
                if(latestminindex>=0)
                {
                    result=Math.min(result,i-latestminindex+1);
                }
            }
        }
        System.out.println(result);

    }
}

public class Closestinax
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of the array");
        int n=scanner.nextInt();
        System.out.print("Enter the elements  array");

        int[] array=new int[n];
        int[] sample=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
            sample[i]=array[i];
        }
        scanner.close();
        Arrays.sort(sample);
        int max=sample[n-1];
        int min=sample[0];
       maxmin sol =new maxmin();
        sol.minmax(n,array,max,min);
    }
}