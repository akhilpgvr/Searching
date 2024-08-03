public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = {3,9,1,8,6,7,2,13,11};
        int size = arr.length;
        System.out.println("...............................");
        System.out.println("Linear Search");
        System.out.println("...............................");
        System.out.print("Array is: ");
        for (int i: arr) System.out.print(i+" ");
        System.out.println();
        LinearSearch liSearch = new LinearSearch();
        liSearch.performLinearSearch(arr, size, 13);
        System.out.println("...............................");
    }
}