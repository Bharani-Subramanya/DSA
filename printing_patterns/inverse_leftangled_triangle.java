package coding.printing_patterns;

import java.util.*;
public class inverse_leftangled_triangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of the row : ");
        int r=sc.nextInt();
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
