import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();

        for(int i =1;i<=2*n-1;i++){
            int x = i;
            if(i>n) x = 2*n-i;
            for(int j =1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
