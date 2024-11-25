package com.demo1;

public class Example01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.printf("%d ", arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("角标越界");
        }
        System.out.println("over");
    }
}
