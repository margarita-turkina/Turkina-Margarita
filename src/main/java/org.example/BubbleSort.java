package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BubbleSort implements SortingAlgorithm {
  private int maxElementsLimit;

  public BubbleSort(int maxElementsLimit) {
    this.maxElementsLimit = maxElementsLimit;
  }

  @Override
  public List<Integer> sort(List<Integer> list) throws Exception {
    if (list.size() > maxElementsLimit) {
      throw new Exception("List size exceeds the maximum limit for Bubble Sort");
    }

    List<Integer> sortedList = new ArrayList<>(list);
    for (int i = 0; i < sortedList.size() - 1; i++) {
      for (int j = 0; j < sortedList.size() - i - 1; j++) {
        if (sortedList.get(j) > sortedList.get(j + 1)) {
          int temp = sortedList.get(j);
          sortedList.set(j, sortedList.get(j + 1));
          sortedList.set(j + 1, temp);
        }
      }
    }
    return sortedList;
  }
}

