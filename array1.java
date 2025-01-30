import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = s.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
    
}
