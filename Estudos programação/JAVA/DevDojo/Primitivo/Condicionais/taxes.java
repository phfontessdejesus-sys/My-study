public class taxes{
    public static void main(String []args){
        double salary = 20000;

        if(salary<2900){
            double salary1 = (salary*7.5)/100;
            System.out.println("Você vai  pagar R$"+salary1);

        }else if(salary>2900 && salary<3700){
            double salary1 = (salary*15)/100;
            System.out.println("Você vai  pagar R$"+salary1);

        }else if(salary>3700 && salary<4600){
            double salary1 = (salary*22.5)/100;
            System.out.println("Você vai  pagar R$"+salary1);

        }else if(salary>4600){
            double salary1 = (salary*27.5)/100;
            System.out.println("Você vai  pagar R$"+salary1);
        }
        
    }
}