public class aula38Array {
    public static void main(String[]args){
        int [][] array = new int[2][];

        for(int [] arrayBase:array){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
