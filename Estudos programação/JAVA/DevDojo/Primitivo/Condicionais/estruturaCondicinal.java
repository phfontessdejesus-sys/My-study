public class estruturaCondicinal {
    public static void main(String []args){

        //Estrutura condicial (if e else)
        double carro = 50000;
        double salario = 2000;
        float entrada = 15000;
        boolean financiamento = salario >= 4000 && 15000 >= entrada;

        //Condição para fazer o financiamento
        if( salario >= 4000  && 15000 >= entrada){
            System.out.println("Pode fazer o financiamento do seu carro");
        }

        //Condição para não fazer o financiamento
        if(financiamento == false){
        //Segunda opção: if (!financiamento)
            System.out.println("Você não pode fazer o financiamento");
        }

        //Usando if e else
        double ps5 = 4000;
        double money = 2000;

        if(money >= ps5){
            System.out.println("Pode comprar o video game");
        }else{
            System.out.println("Não tem dinheiro suficiente");
        }

        }
    }

