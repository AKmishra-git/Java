public class firstindexrecursion {
    public static int fi(int[] arr, int si, int n){
        if(si>arr.length-1){
            return -1;

        }

        if(arr[si]==n){
            return si;
        }
        else{
            return fi(arr, si+1, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,4,5,8};
        int si = 0;
        int n = 8;
        int ans = fi(arr, si, n);
        System.out.println(ans);
    } 
    
}
