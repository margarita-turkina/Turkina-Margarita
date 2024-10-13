package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {
  @Test
  public void testSort() throws Exception {
    Sorter sorter = new Sorter();
    sorter.addAlgorithm(new BubbleSort(10));
    sorter.addAlgorithm(new MergeSort(100));

    List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);
    List<Integer> sortedList = sorter.sort(list);
    assertEquals(Arrays.asList(1, 2, 5, 8, 9), sortedList);
  }
}

