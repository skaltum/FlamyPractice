package Flamy;

class Box1<T> implements Storage<T> {
    private T item;

    private Box1() {
    }
    private Box1(T item){
        this.item=item;
    }
    static <T> Box1<T> createBox1() {
        return new Box1<>();
    }
    public static <T> Box1<T> createBox1(T item){
        return new Box1<>(item);
    }
    public void put(T item){
        this.item=item;
    }
    public T get(){
        return item;
    }
    public boolean isEmpty(){
        if (item == null) return true;
        else return false;
    }
}
