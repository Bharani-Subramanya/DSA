import java.util.*;
public class remove_duplicates {

    public static void main(String[] args)
    {
        int [] arr={1,1,2,2,3,4,4,5,5,5,6};
        brute(arr);
        comparing(arr);
    }
    public static void brute(int []arr)
    {
        int n=arr.length;
        ArrayList<Integer> l=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(!l.contains(arr[i]))
            {
                l.add(arr[i]);
            }
        }
        System.out.println("using storage unit: "+l);
    }
    public static void comparing(int []arr)
    {
        int n=arr.length;
        ArrayList<Integer>l =new ArrayList<>();
        l.add(arr[0]);
        int i=1;
        while(i<n)
        {
            if(arr[i]!=arr[i-1])
            {
                l.add(arr[i]);
            }
            i++;
        }
        System.out.println("using comparing method: "+l);
    }

}
