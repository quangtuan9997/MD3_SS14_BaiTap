package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
public static void insertionSort(List<Integer> arr){
    for (int i = 1; i < arr.size(); i++) {
        for (int j = i-1; j >=0; j--) {
            if (arr.get(j+1)<arr.get(j)){
                int tem=arr.get(j);
                arr.set(j,arr.get(j+1));
                arr.set(j+1,tem);
            }
        }
    }
    System.out.println(arr);
}

    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
       arr.add(19);
       arr.add(9);
       arr.add(14);
       arr.add(182);
       arr.add(12);
       insertionSort(arr);
    }
}
