import java.util.Scanner;

public class lowerbound {
    public static int lowerbound(int[] arr, int data){
        int low = 0;
        int high = arr.length-1;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==data){
                ans = mid;
                high = mid - 1;

            }
            else if(arr[mid]>data){
                high = mid-1;

            }
            else{
                low = mid+1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        System.out.println("Enter the target you want");
        int data = s.nextInt();
        System.out.println();
        
        int[] arr = new int[n];
       

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();

        }
        System.out.println();
        int ans = lowerbound(arr, data);
        System.out.println(ans);
    }
    
}
