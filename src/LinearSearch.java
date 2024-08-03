public class LinearSearch {

    public void performLinearSearch(int[] arr,int size, int key) throws Exception {

        for(int i=0; i<size; i++) {
            if(arr[i] == key) {
                System.out.println("Element "+ key+ " found at Position: "+ (i+1));
                return;
            }
        }
        throw new Exception("Element not found in the list");
    }
}
