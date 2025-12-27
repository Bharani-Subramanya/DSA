import java.util.*;

public class largest_sec_largest{

    public static void main(String[] args)
    {
        int [] arr={12,34,56,78,90,11,23,45};

        sort(arr);
        twopass(arr);
        singlepass(arr);
    }
    
    public static void sort(int []arr)
    {
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;

        Arrays.sort(arr);

        lar=arr[arr.length-1];
        sec=arr[arr.length-2];
        
        System.out.println("using sort: "+lar+" "+sec);

    }
    
    public static void twopass(int []arr)
    {
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sec && arr[i]<lar)
            {
                sec=arr[i];
            }
        }

        System.out.println("using two pass: "+lar+" "+sec);
    }

    public static void singlepass(int []arr)
    {
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                sec=lar;
                lar=arr[i];
            }
            else if(arr[i]>sec && arr[i]<lar)
            {
                sec=arr[i];
            }
        }
        System.out.println("using single pass: "+lar+" "+sec);
    }
}