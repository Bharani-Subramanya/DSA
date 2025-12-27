import java.util.*;

public class rotatearray{
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6,7};
        int d=2;

        looprotate(arr,d);

        int [] arr2={1,2,3,4,5,6,7};
        int d2=2;
        temparray(arr2,d2);
    }
    public static void looprotate(int [] arr, int d)
    {
        int n=arr.length;

        for(int i=0;i<d;i++)
        {
            int fir=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=fir;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void temparray(int []arr, int d)
    {
        int n=arr.length;

        d%=n;
        int [] temp =new int[n];

        for(int i=0;i<n-d;i++)
        {
            temp[i]=arr[d+i];
        }
        for(int i=0;i<d;i++)
        {
            temp[n-d+i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }

        System.out.println(Arrays.toString(arr));
     }
}
