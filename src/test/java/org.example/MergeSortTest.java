package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
  @Test
  public void testSort() throws Exception {
    MergeSort mergeSort = new MergeSort(10);
    List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);
    List<Integer> sortedList = mergeSort.sort(list);
    assertEquals(Arrays.asList(1, 2, 5, 8, 9), sortedList);
  }

  @Test
  public void testSort_EmptyList() throws Exception {
    MergeSort mergeSort = new MergeSort(10);
    List<Integer> list = Arrays.asList();
    List<Integer> sortedList = mergeSort.sort(list);
    assertEquals(Arrays.asList(), sortedList);
  }

  @Test
  public void testSort_SingleElementList() throws Exception {
    MergeSort mergeSort = new MergeSort(10);
    List<Integer> list = Arrays.asList(5);
    List<Integer> sortedList = mergeSort.sort(list);
    assertEquals(Arrays.asList(5), sortedList);
  }
}
