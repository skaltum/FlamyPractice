package FlamyMap.com.pwflamy.task1;

import FlamyMap.com.pwflamy.task1.dto.Creature;

import java.util.*;

/**
 * Данная реализация кеша должна сохранять все переданные значения с одинаковым ключем в список.
 * Требуется реализовать работу следующих методов:
 * 1) Метод put - по переданному ключу key, сохраняет переданное значение value в кэш. Если данный ключ уже существует,
 * то значение добавляется в список
 * 2) Метод get - возвращает список значений, ассоциированных с ключом key. Если ключа не существует в кэше, то вернуть
 * пустой список
 * 3) Метод remove - убирает key из кэша и возвращает список значений ассоциированных с ним
 * 4) Метод clear - очищает весь кэш, ничего не возвращает
 * 5) Метод putAll - по переданному ключу key, сохраняет переданный список значений values в кэш. Список значений
 * представлен в виде Collection. Если данный ключ уже существует, то все значения добавляется в существующий список.
 * 6) Метод copyTo - на входе другой экземпляр NewGenericCache, в который нужно скопировать все элементы текущего кэша
 * <p>
 * Дополнительно переопределить метод toString, который будет описывать все содержимое кэша в виде строки
 */
public class NewGenericCache<K,V> {
    private final Map<K, List<V>> cache;
    public NewGenericCache(){
        cache = new HashMap<>();
    }
    public void put(K key, V value) {
        if (cache.containsKey(key)) {
            List<V> list= cache.get(key);
            list.add(value);
        } else {
            ArrayList<V> list = new ArrayList<>();
            list.add(value);
            cache.put(key,list);
        }
    }
    public List<V> get(K key){
        return cache.getOrDefault(key, Collections.emptyList());
    }
    public List<V> remove(K key){
        return cache.remove(key);
    }
    public void clear(){
        cache.clear();
    }
    public void putAll(K key, Collection<? extends V> values){
        List<V> newValues = cache.computeIfAbsent(key, k -> new ArrayList<>());
        newValues.addAll(values);
    }
    public void copyTo(NewGenericCache<? super K, ? super V> destination){
        for(Map.Entry<K, List<V>> entry : this.cache.entrySet()){
            K key = entry.getKey();
            List<V> values = entry.getValue();
            for(V value: values){
                destination.put(key,value);
            }
        }
    }
}
