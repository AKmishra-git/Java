import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "); //for spaces
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("1"); //for 1's
            }

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
