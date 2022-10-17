import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        boolean isPrime = true;

        int i = 2;
        while (i <= Math.sqrt(num)){
            if (num % i == 0){
                isPrime = false;
                break;
            }
            i = i + 1;
        }
        if (isPrime)
            System.out.println(num + " is prime number");
        else
            System.out.println(num + " is not prime number");

        in.close();
    }
}