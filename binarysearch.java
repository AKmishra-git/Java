import java.util.Scanner;

public class binarysearch {
    public static int binarysearch(int arr[], int tar){
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>tar){
                high = mid-1;
            }
            else if(arr[mid]<tar){
                low = mid+1;
            }
            else{
                return mid;
            }


            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {20,30,40,60,80};
        Scanner s = new Scanner(System.in);
        int tar = s.nextInt();
        int ans = binarysearch(arr, tar);
        System.out.println(ans);
    }
    
}
