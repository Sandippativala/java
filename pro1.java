import java.util.Arrays;
import java.util.Scanner;
public class pro1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

        System.out.println("Enter 5 value");
        for(int i = 0; i < 5; i++){
            number[i] = sc.nextInt();
        }

        Arrays.sort(number);
        System.out.println("sorted Number :");
        for(int i = 0; i < 5; i++){
            System.out.print(number[i] + " ");
        }

        System.out.println("\nminimum value :-" + number[0]);
        System.out.println("maximum value :-" + number[4]);
    }    
}
