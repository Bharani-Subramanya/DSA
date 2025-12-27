import java.util.*;

public class array_wave_pattern {
    public static void main(String[]args)
    {
        int [] arr={1,2,3,4,5,6,7,8,9};
        wavepattern(arr);
    }

    public static void wavepattern(int []arr)
    {
        int n=arr.length;
        // given the array is sorted and every even index should be greater than its next odd index element
        for(int i=0;i<n-1;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;  
        }
        System.out.println(Arrays.toString(arr));
    }
}
