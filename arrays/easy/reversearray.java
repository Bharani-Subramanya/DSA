import java.util.*;

public class reversearray{
    public static void main(String[] args)
    {
        int [] arr={12,34,56,78,90,11,23,45};

        twopointer(arr);
        swap(arr);
        builtin(arr);
    }
    public static void twopointer(int []arr)
    {
        int left=0;
        int right=arr.length-1;


        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        System.out.println("using two pointer: "+Arrays.toString(arr));
    }

    public static void swap(int []arr)
    {
        int n=arr.length;


        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        System.out.println("using swap: "+Arrays.toString(arr));
    }

    public static void builtin(int []arr)
    {
        Collections.reverse(Arrays.asList(arr));

        System.out.println("using builtin: "+Arrays.toString(arr));
    }

}