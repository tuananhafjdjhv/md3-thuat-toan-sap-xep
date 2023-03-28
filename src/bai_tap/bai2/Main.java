package bai_tap.bai2;

public class Main {
    static int[] list = {1, 9, 5, 6, 7, -45};
    public static void insertionSort(int[] list){
        int pos,x;
        for (int i = 0; i < list.length; i++) {
            x= list[i];
            pos = i;
            while (pos >0 && x < list[pos-1] ){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
    }
}
