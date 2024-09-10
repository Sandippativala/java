import java.util.Scanner;
import java.util.Arrays;

public class p1 {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Value :\n");
        for(int i=0;i<5;i++)
        {
            arr[i]=s1.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("\nSorted Array :");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nMaximum Value :"+ arr[4]);
        System.out.print("\nMinimum Value :"+ arr[0]);
        s1.close();
    }
}