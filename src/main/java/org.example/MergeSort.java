package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort implements SortingAlgorithm {
  private int maxElementsLimit;

  public MergeSort(int maxElementsLimit) {
    this.maxElementsLimit = maxElementsLimit;
  }

  @Override
  public List<Integer> sort(List<Integer> list) throws Exception {
    if (list.size() > maxElementsLimit) {
      throw new Exception("List size exceeds the maximum limit for Merge Sort");
    }

    List<Integer> sortedList = new ArrayList<>(list);
    Collections.sort(sortedList);
    return sortedList;
  }
}
