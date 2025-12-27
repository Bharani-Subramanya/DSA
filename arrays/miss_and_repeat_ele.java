import java.util.*;
public class miss_and_repeat_ele {
    
    public static void main(String[] args)
    {
        int [] arr={3,1,3,4,2};
        missAndRepeat(arr);
    }
    public static void missAndRepeat(int []arr)
    {
        int n=arr.length;
        List<Integer>l=new ArrayList<>();
        int [] freq=new int[n+1];

        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(freq[i]==0)
            {
                l.add(i);
            }
            else if(freq[i]>1)
            {
                l.add(i);
            }
        }
        System.out.println("missing and repeating elements are: "+l);

    }
}
