public class ExercicioWhile {
    public static void main(String []args){
        int count = 0;

        while (count<1000000){
            count +=1;
            if (count%2 == 0){
                System.out.println(count);
                continue;
            }
        }
    }
}
