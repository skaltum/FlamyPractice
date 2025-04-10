public class ExerciseCycle2 {
    public static void main(String[] args) {
        int population = 1000;
        int born = 14;
        int dead = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + born - dead;
            if (born > 7)
                born-=1;
            if (dead > 6)
                dead-=1;
        }
        System.out.printf("Население города XYZ через 10 лет составит: %d", population * 10000);
    }
}

