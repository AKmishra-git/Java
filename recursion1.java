import java.util.Scanner;

public class recursion1 {
    public static void printdecreasing(int n){
        if(n==0) return;

        System.out.println(n);
        printdecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printdecreasing(n);
    }
        
    
    
}
