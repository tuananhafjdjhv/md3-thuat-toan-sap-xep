package thuc_hanh.bai1;

import static thuc_hanh.bai1.BubbleSort.list;

public class Main {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int i = 0; i < list.length && needNextPass; i++) {
            if (list[i]>list[i+1]){
                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
        needNextPass=true;
            }
        }
    }

}
