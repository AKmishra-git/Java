import java.util.Scanner;

public class recursion2 {
    public static void printincreasing(int n){
        if(n==0) return;

        printincreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printincreasing(n);
    }
    
}
