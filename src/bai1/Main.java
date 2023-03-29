package bai1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,7,3,9,1,0,8,4};
        for (int i = 1; i < arr.length; i++) {
            System.out.print("tai vi tri i ="+i+"\n");
            for (int j = i-1; j >=0; j--) {
                if (arr[j+1]<arr[j]){
                    System.out.print("so sanh hai gia tri "+arr[j+1]+" va "+arr[j]+"\n");
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                    System.out.print("mang sau khi chen "+Arrays.toString(arr)+"\n");
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
