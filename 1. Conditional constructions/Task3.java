import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        while(true){
            double a, b, c, D;
            System.out.println("Input a, b, c");
            Scanner in = new Scanner(System.in);

            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();

            D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2 * a);
                x2 = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("D = " + D);
                System.out.println("x1 = " + x1 + ", x2 = "+ x2);
            }
            else if (D == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("D = " + D);
                System.out.println("x = " + x);
            }
            else{
                System.out.println("D = " + D);
                System.out.println("The quadratic equation has no roots");
            }
            in.close();
        }
    }
}