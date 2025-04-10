public class Artifact {
    private int id;
    private String culture;
    private int age;
    public Artifact(int id){
        this.id=id;
    }
    public Artifact(int id, String culture){
        this.id=id;
        this.culture=culture;
    }
    public Artifact(int id, String culture, int age){
        this(id, culture);
        this.age=age;
    }
    public String getCulture(){
        return culture;
    }
    public void setCulture(String culture){
        this.culture=culture;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public static void main(String args[]){
        Artifact art1 = new Artifact(91234);
        Artifact art2 = new Artifact(91233, "Ацтеки");
        Artifact art3 = new Artifact(91232, "Майя", 7);
        System.out.println("Порядковый номер первого артефакта: "+art1.getId());
        System.out.println("Порядковый номер второго артефакта: "+art2.getId()+"\tКультура второго артефакта: "+art2.getCulture());
        System.out.print("Порядковый номер третьего артефакта: "+art3.getId()+"\tКультура третьего артефакта: "+art3.getCulture()+"\t");
        System.out.println("Век находки третьего артефакта: "+art3.getAge());
    }
}
