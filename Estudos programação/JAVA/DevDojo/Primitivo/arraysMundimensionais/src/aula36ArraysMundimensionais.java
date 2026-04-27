public class aula36ArraysMundimensionais {
    public static void main(String[]args){
        String [][]year = new String[4][3];
        year[0][0] = "Janeiro";
        year[0][1] = "Fevereiro";
        year[0][2] = "Março";

        year[1][0] = "Abril";
        year[1][1] = "Maio";
        year[1][2] = "Junho";

        year[2][0] = "Julho";
        year[2][1] = "Agosto";
        year[2][2] = "Setembro";

        year[3][0] = "outubro";
        year[3][1] = "Novembro";
        year[3][2] = "Dezembro";

        for(int i = 0; i <year.length; i++){
            System.out.println();
            for(int j = 0; j <year[i].length; j++){
                System.out.println(year[i][j]);
            }
        }
    }
}
//Ou você pode: String age = {{items},{items},{items}};