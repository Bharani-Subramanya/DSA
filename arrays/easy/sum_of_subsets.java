import java.util.*;
public class sum_of_subsets {
    
    public static void main(String[] args)
    {
        int []arr={1,2,3};

        brute(arr);
        optimal(arr);

    }
    public static void brute(int []arr)
    {
        int n=arr.length;
        int result=0;

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                result+=sum;
            }
        }
        System.out.println("sum of all subsets: "+result);
    }

    public static void optimal(int []arr)
    {
        int n=arr.length;
        int result=0;

        for(int i=0;i<n;i++)
        {
            result+=arr[i]*(i+1)*(n-i);
        }
        System.out.println("sum of all subsets: "+result);
    }
}
