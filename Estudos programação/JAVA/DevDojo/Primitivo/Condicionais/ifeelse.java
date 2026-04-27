public class ifeelse {
    public static void main(String []args){
        System.out.println("Vamos ver qual é a sua categoria?");

        //Valor para a variável age
        int age = 17;

        //if, else e else if
        if(age <= 15){
            System.out.println("Você é da categoria infantil");

        }else if(age>15 && age<18){
        System.out.println("Você é da categoria juvenil");

        }else {
        System.out.println("Você é da categoria adulto");
        }

        //Segunda opção:
        int idade =  12;
        String categoria;

        if(idade<15){
            categoria = "Sua categoria é a infantil";

        }else if(idade >= 15 && idade<18){
            categoria = "Sua categoria é juvenil";

        }else{
            categoria = "Sua categoria é adulta";
        }
    }
}

