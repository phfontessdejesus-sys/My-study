import java.util.Scanner;

public class exercicioAula26 {
    public static void main(String []args){
        System.out.println("Dia útil ou não");
        Scanner number = new Scanner(System.in);

        System.out.println("\nSunday - 1");
        System.out.println("Monday - 2");
        System.out.println("Tuesday - 3");
        System.out.println("Wednesday - 4");
        System.out.println("Thursday - 5");
        System.out.println("Friday - 6");
        System.out.println("Sartuday - 7");

        System.out.println("\nChoose a day of week: ");
        int week = number.nextInt();

        switch (week){
            case 1:
                System.out.println("It isn't a day of the week");
                break;
            case 2:
                System.out.println("It is a day of the week");
                break;
            case 3:
                System.out.println("It is a day of the week");
                break;
            case 4:
                System.out.println("It is a day of the week");
                break;
            case 5:
                System.out.println("It is a day of the week");
                break;
            case 6:
                System.out.println("It is a day of the week");
                break;
            case 7:
                System.out.println("It isn't a day of the week");
                break;
            default:
                System.out.println("You choosed number wrong");
        }

    }
}
// switch (week){
//    case 1:
//    case 7:
//          System.out.println()
//          break;
//    case 2:
//    case 3:
//    case 4:
//    case 5:
//    case 6:
//          System.out.println()
//          break;
//    }