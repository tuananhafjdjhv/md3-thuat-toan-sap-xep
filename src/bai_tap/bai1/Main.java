package bai_tap.bai1;

public class Main {
    static int[] list = {1, 9, 5, 6, 7, -45,0,3,6,9,5,44,678,6757};
    public static void bubbleSort(int[] list){
        int pos,x;
        for (int i = 0; i < list.length; i++) {
            x =list[i];
            pos =i;
            while (pos>0 && x< list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+ " ");
        }
    }

}
