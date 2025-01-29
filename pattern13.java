import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"); //stars
            }

            for(int j=1;j<=2*n-(2*i+1);j++){
                System.out.print(" "); //spaces
            }

            for(int j=1;j<=i;j++){
                System.out.print("*"); //stars
            }

            System.out.println();
        }

    }
    
}
