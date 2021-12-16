package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int x = 5;
        final int y = 60;
        final int z = 111;
        System.out.println("введите длину массива");
        Scanner L = new Scanner(System.in);
        int length = L.nextInt();
        int[] array = new int[length];
        for (int i = 0; i <  array.length; i++) {
            System.out.println("введите элемент массива");
            array[i] = L.nextInt();
            if (array[i] == x || array[i] == y || array[i] == z ) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}
