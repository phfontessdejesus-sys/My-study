import java.util.Scanner;

public class parcelaDoCarro {
    public static void main(String []args){
        Scanner preço = new Scanner(System.in);

        int car = 200000;
        int x = 1;

        int parcela;
        for(parcela = 1000;car/x >= parcela;x++){
            if (x <= 30){
                double finalPrice = car/x;
                System.out.println("Temos parcelas de: "+finalPrice+" São "+x+" parcelas");
            }

        }
    }
}
