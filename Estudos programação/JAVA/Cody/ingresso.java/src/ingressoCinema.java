import java.util.Scanner;
public class ingressoCinema {
    public static void main(String []args){

        int child = 10;
        int taxesChild = 3;

        int teen = 20;
        int taxesTeen = 6;

        int adult = 40;
        int taxesAdult = 12;

        int  old = 10;
        int taxesOld = 3;


        Scanner obj = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = obj.nextInt();

        System.out.println("What time is it? ");
        int time = obj.nextInt();

        obj.nextLine();

        System.out.println("Yes or No");
        System.out.println("Today is holiday? ");
        String isHoliday = obj.nextLine();

//tICKET CHILD
        if (age<10 && isHoliday.equals("Yes")){
            int price = child + taxesChild;
            System.out.println("O preço do ingresso vai ser de R$"+price);

        }else if(age<10 && isHoliday.equals("No")){
            int price = child;
            System.out.println("O preço do ingresso vai ser de R$"+price);

            //TAXES TEEN

        }else if (age<=18 && age>10 && isHoliday.equals("Yes")) {
            int price = teen + taxesTeen;
            System.out.println("O preço do ingresso vai ser de R$" + price);

        }else if(age<=18 && age>10 && isHoliday.equals("No")){
            int price = teen;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

            //TAXES ADULT

        }else if (age>=18 && age<=60 && isHoliday.equals("Yes") && time <=17){
            int price = adult + taxesAdult - 10;
            System.out.println("O preço do ingresso vai ser de R$"+price);

        }else if (age>=18 && age<=60 && isHoliday.equals("Yes") && time>=17){
            int price = adult + taxesAdult;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

        }else if (age>18 && age<=60 && isHoliday.equals("No") &&  time<=17){
            int price = adult - 10;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

        }else if (age>=18 && age<=60 && isHoliday.equals("No") && time>=17){
            int price = adult;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

            //TAXES OLD

        }else if(age>60 && isHoliday.equals("Yes") && time<=17){
            int price = old + taxesOld - 10;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

        }else if(age>60 && isHoliday.equals("Yes") && time>=17){
            int price = old + taxesOld;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

        }else if(age>60 && isHoliday.equals("No") && time>=17){
            int price = old ;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);

        }else if(age>60 && isHoliday.equals("No") && time<=17){
            int price = old -10 ;
            System.out.println("O preço do seu ingresso vai ser de R$"+price);
        }

        System.out.println("Muito obrigado por marcar no nosso cinema");
        System.out.println("BOM FILME!");
   }
}