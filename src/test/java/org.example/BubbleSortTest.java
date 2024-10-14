package org.example;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
  @Test
  public void testSort() throws Exception {
    BubbleSort bubbleSort = new BubbleSort(10);
    List<Integer> list = Arrays.asList(5, 6, 1, 7, 18);
    List<Integer> sortedList = bubbleSort.sort(list);
    assertEquals(Arrays.asList(1, 5, 6, 7, 18), sortedList);
  }

  @Test
  public void testSort_EmptyList() throws Exception {
    BubbleSort bubbleSort = new BubbleSort(10);
    List<Integer> list = Arrays.asList();
    List<Integer> sortedList = bubbleSort.sort(list);
    assertEquals(Arrays.asList(), sortedList);
  }

  @Test
  public void testSort_MaxElementsExceeded() throws Exception {
    BubbleSort bubbleSorting = new BubbleSort(10);
    List<Integer> list = Arrays.asList(5, 2, 8, 1, 9, 3, 17, 10, 12, 20, 21);
    assertThrows(Exception.class, () -> bubbleSorting.sort(list));
  }

  @Test
  public void testSort_SingleElementList() throws Exception {
    BubbleSort bubbleSort = new BubbleSort(10);
    List<Integer> list = Arrays.asList(5);
    List<Integer> sortedList = bubbleSort.sort(list);
    assertEquals(Arrays.asList(5), sortedList);
  }

}

