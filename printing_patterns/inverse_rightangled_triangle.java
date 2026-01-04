package coding.printing_patterns;

import java.util.*;
public class inverse_rightangled_triangle {
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the value of the row : ");
            int r=sc.nextInt();

            for(int i=r;i>=0;i--)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
