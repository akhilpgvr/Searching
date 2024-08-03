public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = {3,9,1,8,6,7,2,13,11};
        int[] arr1 = {1,2,3,6,7,8,9,11,13};
        System.out.println("...............................");
        System.out.println("Linear Search");
        System.out.println("...............................");
        System.out.print("Array is: ");
        for (int i: arr) System.out.print(i+" ");
        System.out.println();
        LinearSearch liSearch = new LinearSearch();
        liSearch.performLinearSearch(arr, arr.length, 13);
        System.out.println("...............................");
        System.out.println("Binary Search");
        System.out.println("...............................");
        System.out.print("Array is: ");
        for (int i: arr1) System.out.print(i+" ");
        System.out.println();
        BinarySearch biSearch = new BinarySearch();
        biSearch.performBinarySearch(arr1,0,  arr1.length, 13);
        System.out.println("...............................");
    }
}
/*

Output:
...............................
Linear Search
...............................
Array is: 3 9 1 8 6 7 2 13 11
Element 13 found at Position: 8
...............................
Binary Search
...............................
Array is: 1 2 3 6 7 8 9 11 13
Element 13 found at Position: 9
...............................

 */