import java.util.Scanner;

public class Arrays {
    public static void main(String[]args){
        int [] age = new int[5];
        age[0] = 18;
        age[1] = 19;
        age[2] = 20;
        age[3] = 21;
        age[4] = 22;

        for (int i = 0; i <age.length; i++){
            System.out.println(age[i]);
        }

        int [] numbers = {23,43,65,32,12,54};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int num : numbers){
            System.out.println(num);
        }
    }
}
