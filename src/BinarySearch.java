public class BinarySearch {

    public void performBinarySearch(int[] arr,int first, int last, int key) throws Exception  {

        if(first>=last) {
            throw new Exception("Element not found");
        }
        int mid = (first+last)/2;
        if(arr[mid] == key) {
            System.out.println("Element "+ key+ " found at Position: "+ (mid+1));
        }
        else if (arr[mid]>key) {
            performBinarySearch(arr, first, mid-1, key);
        }
        else {
            performBinarySearch(arr, mid+1, last, key);
        }
    }
}
