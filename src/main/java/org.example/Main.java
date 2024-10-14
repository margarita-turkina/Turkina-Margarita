package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    Sorter sorter = new Sorter();
    sorter.addAlgorithm(new BubbleSort(10));
    sorter.addAlgorithm(new MergeSort(20));

    List<Integer> list = Arrays.asList(5, 2, 3, 4, 1);
    List<Integer> sortedList = sorter.sort(list);
    System.out.println("Sorted list: " + sortedList);
  }
}