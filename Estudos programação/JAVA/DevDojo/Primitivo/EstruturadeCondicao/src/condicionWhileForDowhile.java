public class condicionWhileForDowhile {
    public static void main(String[] args) {

        int count = 0;
        while (count < 1000) {
            System.out.println(++count);
            //++count = count += 1;
        }
        count = 0;
        do {
            System.out.println("Dentro do-while" + ++count);
        } while (count < 10);


        int sapo;
        for (sapo = 0; sapo < 10; sapo++) ;
        System.out.println("For " + sapo);

    }
}
