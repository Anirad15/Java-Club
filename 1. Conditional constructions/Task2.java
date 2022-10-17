import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("\nInput a number: ");
            var num = in.nextInt();

            if (num > 10 || num < 0) 
                System.out.println("Error");
            else if (num >= 2 && num <= 4)
                System.out.print(num + " гривнi");
            else if (num == 1)
                System.out.print(num + " гривня");
            else
                System.out.print(num + " гривень");
            
            in.close();
        }
    }
}