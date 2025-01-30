import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int tar = s.nextInt();
        int[] arr = {20,30,45,65,32};
        int ans = linearsearch(arr,tar);
        System.out.println(ans);
    }

    public static int linearsearch( int arr[],int tar){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==tar){
                    return i;
                }
            }
            return -1;
        }    


    
    
}
