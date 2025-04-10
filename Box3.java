package Flamy;

class Box3<T> extends Box2<T>{
    private T item;
    private Box3(){
        super();
    }
    private Box3(T item){
        super();
        this.item=item;
    }
    public static <T> Box3<T> createBox3(){
        return new Box3<>();
    }
    public static <T> Box3<T> createBox3(T item){
        return new Box3<>(item);
    }
    @Override
    public void put(T item){
        if(item!=null) throw new RuntimeException();
        else this.item=item;
    }
    @Override
    public T get(){
        if(item==null) throw new RuntimeException();
        else return item;
    }
    @Override
    public boolean isEmpty() {
        if(item==null) return true;
        else return false;
    }
}