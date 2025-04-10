package Flamy;

class Box2<T> implements Storage<T> {
    private T item;
    protected Box2(){}
    protected Box2(T item){
        this.item=item;
    }
    public static <T> Box2<T> createBox2(){
        return new Box2<>();
    }
    public static <T> Box2<T> createBox2(T item){
        return new Box2<>(item);
    }
    public void put(T item){
        try{
            if(item!=null) throw new Exception("Throw the gun away, David");
            else this.item=item;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }
    public T get(){
        try{
            if(item==null) throw new Exception("DA BOX IS EMPTY");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(2);
        }
        return item;
    }
    public boolean isEmpty() {
        if (item == null) return true;
        else return false;
    }
}

