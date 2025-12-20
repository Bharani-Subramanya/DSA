import java.util.*;

public class rotatearray{
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,6,7};
        int d=2;

        looprotate(arr,d);
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
}
