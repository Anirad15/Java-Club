public class Task4 {
    public static void main(String[] args) {
        
        System.out.println("The first 20 Fibbonacci numbers are:");

        int n0, n1, n2;
        int sum = 2;
        n0 = n1 = 1;
        System.out.print(n0 + " " + n1 + " ");

        for (int i = 3; i <= 20; i++){
            n2 = n0 + n1;
			System.out.print(n2 + " ");
            sum = sum + n2;
			n0 = n1;
			n1 = n2;
        }

        System.out.println("\nThe average is " + (double)sum/20);
    }
}
