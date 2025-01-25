import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int n = s.nextInt();

        while(counter<=n){
            sum = sum+counter;

            counter++;


        }
        System.out.println(sum);


    

    }
    
}
