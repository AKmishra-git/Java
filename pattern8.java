import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            int start = 0;
            if(i%2!=0){
                start = 1;

            }
            else start = 0;

            for(int j = 1;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    
}
