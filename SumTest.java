package com.bridge.labz;

public class SumTest {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int sum=0 , count=0;

        for (int i=0; i<arr.length;i++){
            sum=sum+arr[i];
            count++;
            System.out.println (i+" Add "+sum);
        }
        System.out.println ("Count numbers "+count);
    }
}
