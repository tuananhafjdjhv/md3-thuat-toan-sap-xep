package thuc_hanh.bai3;

public class SelectionSort {
    static int[] arr = {5, 2, 9, 4, 5, 7, 4};

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
