 import java.util.Scanner;
public class revisao {
    public static void main(String[] args){
        System.out.println("Vamos calcular o delta e achar os x? ");
        Scanner armazenamento = new Scanner(System.in);

        System.out.println("Escolha o valor de b: ");
        int b = armazenamento.nextInt();

        System.out.println("Escolha um valor para a: " );
        int a = armazenamento.nextInt();

        System.out.println("Escolha um valor para c: ");
        int c = armazenamento.nextInt();

        armazenamento.close();
        double delta = b^2-4*a*c;
        System.out.println("Seu delta é igua a "+ delta);

        double x1 = (b + delta)/2*a;
        double resultado = Math.sqrt(x1);

        double x2 = (b - delta)/2*a;
        double resultado2 = Math.sqrt(x2);

        System.out.println("Seu x1 é igual a " + resultado + " e seu x2 é igual a " + resultado2);
        }
}
