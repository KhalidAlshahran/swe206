# swe206
This repo is for swe206 labs
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;       
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5 ,6};
        System.out.println("Unsorted array: " + Arrays.toString(myArr));
        
        insertionSort(myArr);
        
        System.out.println("Sorted array: " + Arrays.toString(myArr));
    }








