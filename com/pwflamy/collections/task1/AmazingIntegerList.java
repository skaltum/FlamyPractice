package FlamyMap.com.pwflamy.collections.task1;

/**
 * Данная коллекция представляет собой список Integer. Максимальное количество элементов передается в конструкторе.
 * Изменять сигнатуры методов нельзя. Использовать коллекции нельзя, решение должно быть построено на основе массива.
 */
public class AmazingIntegerList {

    public AmazingIntegerList(int maxSize) {

    }

    /**
     * Добавляет объект в конец списка, если объект null - выбросить IllegalArgumentException. Если список уже заполнен, тогда
     * выбросить эксепшен, созданный специально для этого (создать самостоятельно).
     */
    public void add(Integer obj) {

    }

    /**
     * Возвращает объект из списка по указанному индексу. Индекс начинается с 0
     * Если index указывает на несуществующую или пустую ячейку - выбросить IndexOutOfBoundsException
     */
    public Integer get(int index) {
        return null;
    }

    /**
     * Возвращает текущий последний элемент списка
     */
    public Integer getLast() {
        return null;
    }

    /**
     * Удаляет объект из списка по указанному индексу.
     * Если index указывает на несуществующую ячейку или пустую - выбросить IllegalArgumentException.
     * Важно, требуется передвинуть все элементы, что расположены правее, на 1 ячейку влево
     */
    public Integer remove(int index) {
        return null;
    }

    /**
     * Очищает весь список
     */
    public void clear() {

    }

    /**
     * Возвращает текущее количество элементов
     */
    public int size() {
        return 0;
    }
}
