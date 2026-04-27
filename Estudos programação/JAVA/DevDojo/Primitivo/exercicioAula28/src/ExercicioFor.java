public class ExercicioFor {
    public static void main(String []args){
        int count;
        for (count = 0;count<=1000000;count++){
            if (count%2 == 0){
                System.out.println(count);
                continue;
            }
        }
    }
}
