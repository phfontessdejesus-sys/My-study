public class condicionaisSwitch{
    public static void main(String []args){
        byte dia = 5;
        //Pode colocar no SWITCH - char, int, byte, short, enum, string
        switch (dia){
            case 1:
                System.out.println("Domingo");
            case 2:
                System.out.println("Segunda");
            case 3:
                System.out.println("Terça");
            case 4:
                System.out.println("Quarta");
            case 5:
                System.out.println("Quinta");
            case 6:
                System.out.println("Sexta");
            case 7:
                System.out.println("Sábado");
        }
    }
}