package FlamyMap.com.pwflamy.collections.task2;

import java.util.Arrays;

/**
 * Данная коллекция представляет собой список Integer. Максимальное количество элементов передается в конструкторе.
 * Изменять сигнатуры методов нельзя. Использовать коллекции нельзя, решение должно быть построено на основе массива.
 */
public class AmazingInfIntegerListAnswer {

    private int currAmount = 0;
    private Integer[] list = new Integer[10];

    /**
     * Добавляет объект в список, если объект null - выбросить IllegalArgumentException. Если список уже заполнен, тогда
     * выбросить эксепшен, созданный специально для этого
     */
    public void add(Integer obj) {
        if (currAmount == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[currAmount++] = obj;
    }

    /**
     * Возвращает объект из списка по указанному индексу. Индекс начинается с 0
     * Если index указывает на несуществующую или пустую ячейку - выбросить IllegalArgumentException
     */
    public Integer get(int index) {
        if (index < 0 || index >= this.currAmount) {
            throw new IllegalArgumentException();
        }
        return list[index];
    }

    /**
     * Возвращает текущий последний элемент списка
     */
    public Integer getLast() {
        return list[currAmount - 1];
    }

    /**
     * Удаляет объект из списка по указанному индексу.
     * Если index указывает на несуществующую ячейку или пустую - выбросить IllegalArgumentException.
     * Важно, требуется передвинуть все элементы, что расположены правее, на 1 ячейку влево
     */
    public Integer remove(int index) {
        if (index < 0 || index >= this.currAmount) {
            throw new IllegalArgumentException();
        }
        Integer deleted = list[index];
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i+1];
        }
        list[list.length - 1] = null;
        this.currAmount--;
        return deleted;
    }

    /**
     * Очищает весь список
     */
    public void clear() {
        Arrays.fill(list, null);
        currAmount = 0;
    }

    /**
     * Возвращает текущее количество элементов
     */
    public int size() {
        return currAmount;
    }
}
