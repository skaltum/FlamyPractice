package FlamyMap.com.pwflamy.collections.task1;

/**
 * Данная коллекция представляет собой список Integer. Максимальное количество элементов передается в конструкторе.
 * Изменять сигнатуры методов нельзя. Использовать коллекции нельзя, решение должно быть построено на основе массива.
 */
public class AmazingIntegerList {
    private final Integer[] list;

    public AmazingIntegerList(int maxSize) {
        this.list = new Integer[maxSize];
    }

    /**
     * Добавляет объект в конец списка, если объект null - выбросить IllegalArgumentException. Если список уже заполнен, тогда
     * выбросить эксепшен, созданный специально для этого (создать самостоятельно).
     */
    public void add(Integer obj) {
        if (obj == null) throw new IllegalArgumentException("Объект не должен равняться нулю");
        if (list[list.length - 1] != null) throw new IndexOutOfBoundsException("Список полок");
        for (int i = 0; i < list.length; ) {
            if (list[i] == null) {
                list[i] = obj;
                break;
            } else if (list[i] != null) {
                i++;
            }
        }
    }

    /**
     * Возвращает объект из списка по указанному индексу. Индекс начинается с 0
     * Если index указывает на несуществующую или пустую ячейку - выбросить IndexOutOfBoundsException
     */
    public Integer get(int index) {
        if (index < 0) throw new IndexOutOfBoundsException("Ячейка не существует");
        else if (index >= list.length) throw new IndexOutOfBoundsException("Ячейка не существует");
        else if (list[index] == null) throw new IndexOutOfBoundsException("Ячейка пуста");
        else return list[index];
    }

    /**
     * Возвращает текущий последний элемент списка
     */
    public Integer getLast() {
        if (list[0] == null) throw new RuntimeException("Список пуст");
        for (int i = 1; i < list.length; ) {
            if (list[i] == null) {
                return list[i - 1];
            } else i++;
        }
        return list[list.length - 1];
    }

    /**
     * Удаляет объект из списка по указанному индексу.
     * Если index указывает на несуществующую ячейку или пустую - выбросить IllegalArgumentException.
     * Важно, требуется передвинуть все элементы, что расположены правее, на 1 ячейку влево
     */
    public Integer remove(int index) {
        if (index < 0) throw new IllegalArgumentException("Ячейка не существует");
        if (index >= list.length) throw new IllegalArgumentException("Ячейка не существует");
        Integer object = list[index];
        int i = index;
        while (i < list.length - 1) {
            list[i] = list[i + 1];
            i++;
        }
        list[list.length - 1] = null;
        return object;
    }

    /**
     * Очищает весь список
     */
    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
    }

    /**
     * Возвращает текущее количество элементов
     */
    public int size() {
        if (list[0] == null) return 0;
        int s = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                s = i;
                break;
            } else s = list.length;
        }
        return s;
    }
}