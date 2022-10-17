import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int i, j, n, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        n = in.nextInt();
        in.close();

        for (j = 1, i = 1, sum = 0; i <= n; i++) {
            System.out.println(j);
            sum = sum + j;
            j = j + 2;
        }

        System.out.println("Sum = " + sum);
        in.close();
    }
}