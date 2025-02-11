public class issortedrecursion {
    public static boolean issorted(int[] arr, int si){
        if(si==arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        else{
             return issorted(arr, si+1);

        }
    

    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,8,9};
        int si=0;
        boolean ans = issorted(arr, si);
        System.out.println(ans);
    }
    
}
