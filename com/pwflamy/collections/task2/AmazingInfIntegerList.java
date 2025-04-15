package FlamyMap.com.pwflamy.collections.task2;

import java.util.Arrays;

/**
 * Данная коллекция представляет собой список Integer. Максимальное количество элементов ограничено Integer.MAX_VALUE элементами.
 * Изменять сигнатуры методов нельзя. Использовать коллекции нельзя, решение должно быть построено на основе массива.
 */
public class AmazingInfIntegerList {
    private Integer[] list;
    private int lastObjIndex =-1;
    public AmazingInfIntegerList(){
        this.list=new Integer[0];
    }
    /**
     * Добавляет объект в конец списка, если объект null - выбросить IllegalArgumentException.
     */
    public void add(Integer obj) {
        if(obj==null) throw new IllegalArgumentException("Объект не может равняться null");
        Integer[] check = new Integer[0];
        if(Arrays.equals(list, check)){
            this.list=new Integer[1];
            lastObjIndex++;
            list[0]=obj;
        }
        else if(list[list.length-1]!=null){
            this.list=Arrays.copyOf(this.list, list.length*2);
            list[lastObjIndex+1]=obj;
            lastObjIndex++;
        }
        else {
            list[lastObjIndex+1]=obj;
            lastObjIndex++;
        }
    }

    /**
     * Возвращает объект из списка по указанному индексу. Индекс начинается с 0
     * Если index указывает на несуществующую или пустую ячейку - выбросить IndexOutOfBoundsException
     */
    public Integer get(int index) {
        if (index < 0 || index>=list.length) throw new IndexOutOfBoundsException("Ячейка не существует");
        if(list[index]==null) throw new IndexOutOfBoundsException("Ячейка пуста");
        return list[index];
    }

    /**
     * Возвращает текущий последний элемент списка
     */
    public Integer getLast() {
        return list[lastObjIndex];
    }

    /**
     * Удаляет объект из списка по указанному индексу.
     * Если index указывает на несуществующую ячейку или пустую - выбросить IllegalArgumentException.
     * Важно, требуется передвинуть все элементы, что расположены правее, на 1 ячейку влево.
     * Уменьшать размер массива не требуется.
     */
    public Integer remove(int index) {
        if(index<0 || index>=list.length) throw new IllegalArgumentException("Ячейка не существует");
        if(list[index]==null) throw new IllegalArgumentException("Ячейка пуста");
        Integer removedObj=list[index];
        for(int i=index;i<list.length-1;i++){
            list[i]=list[i+1];
        }
        list[lastObjIndex]=null;
        lastObjIndex--;
        return removedObj;
    }

    /**
     * Очищает весь список
     */
    public void clear() {
        this.list= new Integer[0];
        lastObjIndex =-1;
    }

    /**
     * Возвращает текущее количество элементов
     */
    public int size() {
        return lastObjIndex+1;
    }
}
