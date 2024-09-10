import java.util.*;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 values (press enter after each value):\n");

        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr);

        System.out.print("Sorted strings: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        scanner.close();
    }
}