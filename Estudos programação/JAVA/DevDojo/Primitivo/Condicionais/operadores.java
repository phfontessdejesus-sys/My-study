//operadores lógicos
public class operadores{
    public static void main(String []args){

        //Declarando variaveis
        float carro = 50000;
        float valorPoupanca = 10000;
        float salario = 5000;

        //Boolean
        boolean comprarCarro = salario>=4000 && valorPoupanca >=10000;
        System.out.println(comprarCarro + " :Você consegue comprar o carro");

//Operadores de atribuição (=, +=, -=, /=, %=)
        //Declarando variável
        double bonus = 2000;
        bonus = bonus + 1000; // Ou poderia abreviar "bonus += 1000"
        System.out.println(bonus);

        //Incremenetador
        double dinheiro = 1;
        dinheiro = dinheiro + 1;
        //Duas abreviações:
        
        //Dinheiro +=1;
        //Dinheiro++;

    }
}