public class ExerciseCycle {
    public static void main(String[] args){
        int population = 1000;
        for(int i=1;i<=10;i++){
            population = population+14-8;
        }
        System.out.printf("Население города XYZ через 10 лет составит: %d", population*10000);
    }
}
