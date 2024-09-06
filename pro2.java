import  java.util.Arrays;
import  java.util.Scanner;

public class pro2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str[] = new  String[5];        
        System.out.println("Enter 5 String :");
        for(int i = 0; i < 5; i++){
            str[i] = sc.nextLine();
        }

        Arrays.sort(str);
        System.out.println("Sorted String :");
        for(int i = 0; i < 5; i++){
            System.out.print(str[i] + " ");
        }
    }
}
