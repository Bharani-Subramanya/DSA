import java.util.*;
public class max_consecutive_ones {
    

    public static void main(String[] args)
    {
        int [] arr={1,1,0,1,1,1,0,1,1,1,1};
        bruteforce(arr);
        singlepass(arr);
        slidingwindow(arr);

    }
    public static void bruteforce(int []arr)
    {
        int n=arr.length;
        
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==1)
                {
                    count++;   
                }
                else{
                    break;
                }
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }

    /////////////////////////////////////////
    public static void singlepass(int []arr)
    {
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
    }
    /////////////////////////////////////////
    public static void slidingwindow(int []arr)
    {
        int n=arr.length;
        int window=0;
        int last=-1;
        int max=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                last=i;
            }
            window=i-last;
            max=Math.max(max,window);

        }
        System.out.println(max);
    }


}
