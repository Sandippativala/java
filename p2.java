import java.util.*;

public class p2 {
    public static void main(String args[])
    {
        String arr[]=new String[5];
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Value :\n");
        for(int i=0;i<5;i++)
        {
            arr[i]=s1.nextLine();
        }
        Arrays.sort(arr);
        System.out.print("\nSorted String :");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }
        s1.close();
    }
}