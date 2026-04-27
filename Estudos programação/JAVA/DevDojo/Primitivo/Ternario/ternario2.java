public class ternario2 {
    public static void main(String[] args){
        double salary = 5000;
        String get = "I wanna";
        String Noget = "I don't wanna";
        String quero;

        //(condição) ? true : false;
        String queroString = salary > 6000 ? get : Noget;
        System.out.println(queroString);
    }
}
