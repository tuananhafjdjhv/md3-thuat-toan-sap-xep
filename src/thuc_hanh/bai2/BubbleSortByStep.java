package thuc_hanh.bai2;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");

        }
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for (int i = 0; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length -i; j++) {
                if (list[i]> list[i+1]){
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false){
                System.out.println("Mảng có thể được sắp xếp và không cần vượt qua tiếp theo");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]+"\t");
            }
            System.out.println();
        }
    }
}
