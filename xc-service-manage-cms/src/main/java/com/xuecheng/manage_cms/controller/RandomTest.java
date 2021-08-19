package com.xuecheng.manage_cms.controller;

public class RandomTest {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50};
        int index = (int) (Math.random() * arr.length);
        int i = arr[index];
        System.out.println(i);

        Integer[] arr1 = new Integer[]{0, 10, 20, 30, 40, 50};

    }
}
