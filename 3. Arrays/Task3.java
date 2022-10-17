import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n, m, i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the 1st array: ");
        n = in.nextInt();
        System.out.print("Enter the length of the 2nd array: ");
        m = in.nextInt();
        in.close();

        int[] a = new int[n];
        for (i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 20);
            System.out.print(a[i] + " ");
        }

        System.out.println();

        int[] b = new int[m];
        for (i = 0; i < b.length; i++){
            b[i] = (int)(Math.random() * 20);
            System.out.print(b[i] + " ");
        }
        
        System.out.println();

        int[] c = new int[n+m];
        int count = 0;
        for(i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
        for(i = 0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
}