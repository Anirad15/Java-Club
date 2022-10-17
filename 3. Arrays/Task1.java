import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n, max, min, max_index, min_index, i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        n = in.nextInt();
        in.close();

        int[] arr = new int[n];
        for (i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 20);
            System.out.print(arr[i] + " ");
        }

        max = max_index = 0;
        for (i = 0; i < arr.length; i++) {    
            if (arr[i] > max) {
                    max = arr[i];
                    max_index = i;
            }
        }

        min = min_index = 36;
        for (i = 0; i < arr.length; i++) {    
            if (arr[i] < min) {
                    min = arr[i];
                    min_index = i;
            }
        }

        int sum = 0;
        if(min_index < max_index){
            for(i = min_index+1; i < max_index; i++)
                sum+=arr[i];
        }
        else{
            for(i = max_index-1; i < min_index; i++)
                sum += arr[i];
        }

        System.out.println("\nmax index: "+ max_index);
        System.out.println("min index: "+ min_index);
        System.out.print(sum);
    }
}