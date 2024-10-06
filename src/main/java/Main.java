/**
 * Пример использования кастомного списка CustomArrayList.
 */
public class Main {
  public static void main(String[] args) {
    CustomArrayList<Integer> list = new CustomArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println("Изначальный список: " + list);
    System.out.println("Элемент на индексе 2: " + list.get(2));
    System.out.println("Удалённый элемент: " + list.remove(2));
    System.out.println("Список после удаления: " + list);

    // Добавление дополнительных элементов
    for (int i = 6; i <= 10; i++) {
      list.add(i);
    }
    System.out.println("Список после добавления новых элементов: " + list);

    // Демонстрация обработки исключений
    try {
      list.remove(25);
      System.out.println("Этот код не должен выполняться");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Перехвачено исключение IndexOutOfBoundsException");
    }

    try {
      list.add(null);
      System.out.println("Этот код не должен выполняться");
    } catch (IllegalArgumentException e) {
      System.out.println("Перехвачено исключение IllegalArgumentException");
    }
  }
}