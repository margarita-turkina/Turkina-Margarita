import java.util.Arrays;

/**
 * Кастомная реализация динамически расширяемого списка.
 *
 * @param <A> тип элементов, которые хранятся в списке.
 */
public class CustomArrayList<A> implements Methods<A> {
  private static final int INITIAL_CAPACITY = 10;
  private A[] elements;
  private int size;

  /**
   * Конструктор, инициализирующий массив с заданной начальной ёмкостью.
   */
  @SuppressWarnings("unchecked")
  public CustomArrayList() {
    elements = (A[]) new Object[INITIAL_CAPACITY];
    size = 0;
  }

  /**
   * Добавляет новый элемент в список.
   *
   * @param element элемент для добавления в список.
   * @throws IllegalArgumentException если элемент равен null.
   */
  @Override
  public void add(A element) {
    if (element == null) {
      throw new IllegalArgumentException("Элемент не может быть null");
    }
    ensureCapacity();
    elements[size++] = element;
  }

  /**
   * Возвращает элемент по указанному индексу.
   *
   * @param index индекс элемента, который требуется получить.
   * @return элемент по данному индексу.
   * @throws IndexOutOfBoundsException если индекс вне допустимого диапазона.
   */
  @Override
  public A get(int index) {
    checkIndex(index);
    return elements[index];
  }

  /**
   * Удаляет элемент с указанного индекса и сдвигает оставшиеся элементы.
   *
   * @param index индекс удаляемого элемента.
   * @return удалённый элемент.
   * @throws IndexOutOfBoundsException если индекс выходит за допустимый диапазон.
   */
  @Override
  public A remove(int index) {
    checkIndex(index);
    A removedElement = elements[index];
    int numMoved = size - index - 1;
    if (numMoved > 0) {
      System.arraycopy(elements, index + 1, elements, index, numMoved);
    }
    elements[--size] = null;  // Очистка последнего элемента
    return removedElement;
  }

  /**
   * Увеличивает ёмкость массива, если текущий размер достиг предела.
   */
  private void ensureCapacity() {
    if (size == elements.length) {
      int newCapacity = elements.length * 2;
      elements = Arrays.copyOf(elements, newCapacity);
    }
  }

  /**
   * Проверяет, находится ли индекс в пределах допустимого диапазона.
   *
   * @param index индекс для проверки.
   * @throws IndexOutOfBoundsException если индекс меньше 0 или больше текущего размера списка.
   */
  private void checkIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
    }
  }

  /**
   * Преобразует список в строку для удобного вывода.
   *
   * @return строковое представление текущего состояния списка.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
      sb.append(elements[i]);
      if (i < size - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }
}