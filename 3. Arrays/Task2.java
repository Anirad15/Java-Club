import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n, i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        n = in.nextInt();
        in.close();

        int[] arr = new int[n];
        for (i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 20);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n" + arr[arr.length-1] + " ");
        for (i = 0; i < arr.length-1; i++)
            System.out.print(arr[i] + " ");
    }
}