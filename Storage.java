package Flamy;

interface Storage<T>{
    void put(T item);
    T get();
    boolean isEmpty();
    }
