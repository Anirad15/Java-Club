import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            var num = in.nextLine();

            boolean res = num.endsWith("3");
            System.out.println("Number ends with '3'? " + res);
            in.close();
        }
    }
}