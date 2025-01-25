import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = s.nextInt();

        boolean flag = true;
        int div =2;

        while(div<=n-1){
            if(n%div==0){
                flag = false;
            }

            div++;
        }

        if(flag == false){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }

    }
    
}
