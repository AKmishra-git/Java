import java.util.Scanner;

public class fibon {
    public static void main(String[] args) {
        int a = 0;
        int b =1 ;
        int sum;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int count = 1;

        while(count<=n+1){
            System.out.println(a);
            sum = a+b;

            a = b;
            b = sum;
            count++;
            
        }

    }
    
}
