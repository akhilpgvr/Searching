public class InterpolationSearch {

    public void performInterpolationSearch(int[] arr,int lo, int hi, int x) throws Exception  {

        if(lo>=hi) {
            throw new Exception("Element not found");
        }
        int mid = lo+(((hi-lo)*(x-arr[lo]))/(arr[hi]-arr[lo]));
        if(arr[mid] == x) {
            System.out.println("Element "+ x+ " found at Position: "+ (mid+1));
        }
        else if (arr[mid]>x) {
            performInterpolationSearch(arr, lo, mid-1, x);
        }
        else {
            performInterpolationSearch(arr, mid+1, hi, x);
        }
    }
}
