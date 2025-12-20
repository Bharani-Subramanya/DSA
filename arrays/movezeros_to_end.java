import java.util.*;
public class movezeros_to_end {
    
    public static void main(String[] args)
    {
        int[] arr={0,1,0,3,12,0,5,0};

        usingtemparray(arr);
        usingcount(arr);
    }

    public static void usingtemparray(int []arr)
    {
        int n=arr.length;
        int[] temp=new int[n];
        int j=0;


        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[j++]=arr[i];
                
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void usingcount(int []arr)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }

        }
        int j=0;
        int []temp=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
