import java.util.Scanner; 
public class Main{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean sortir = false;
        int opcio;

        //Colors
        String negre="\033[30m"; 
        String roig="\033[31m"; 
        String verd="\033[32m"; 
        String groc="\033[33m"; 
        String blau="\033[34m"; 
        String violeta="\033[35m"; 
        String blau_fluix="\033[36m";
        String negre_subrrallat="\u001B[40m";
        String roig_subrrallat="\u001B[41m";
        String verd_subrrallat="\u001B[42m";
        String groc_subrrallat="\u001B[43m";
        String blau_subrrallat="\u001B[44m";
        String violeta_subrrallat="\u001B[45m";
        String blau_fluix_subrrallat="\u001B[46m";
        String blanc_fluix_subrrallat="\u001B[47m";
        String blanc="\u001B[0m";

        while(!sortir){
            System.out.println(blau_fluix_subrrallat + "                        "+ blanc);
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "                    " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  "+ blanc + verd + "   " + "Trieu un nombre" + blanc + "  " + blau_fluix_subrrallat + "  "+ blanc);
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "                    " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "                        "+ blanc);                              
            System.out.println(blau_fluix_subrrallat + "  "+ blanc + "                    "+ blau_fluix_subrrallat + "  "+ blanc);
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "1. Inserir" + "        " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "2. Localitzar" + "     " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "3. Recuperar" + "      " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "4. Suprimir" + "       " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "5. Suprimir dada" + "  " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "6. Anular" + "         " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "7. Primer/Darrer" + "  " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "8. Imprimir" + "       " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "9. Ordenar" + "        " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "  " + "10. Sortir" + "        " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "  " + blanc + "                    " + blau_fluix_subrrallat + "  " + blanc );
            System.out.println(blau_fluix_subrrallat + "                        "+ blanc);
             
            opcio = entrada.nextInt();
             
            switch(opcio){
                case 1:
                    System.out.println("1");
                    break;

                case 2:
                    System.out.println("2");
                    break;

                case 3:
                    System.out.println("3");
                    break;

                case 4:
                    System.out.println("4");
                    break;

                case 5:
                    System.out.println("5");
                    break;

                case 6:
                    System.out.println("6");
                    break;

                case 7:
                    System.out.println("7");
                    break;

                case 8:
                    System.out.println("8");
                    break;

                case 9:
                    System.out.println("9");
                    break;

                case 10:
                    sortir = true;
                    break;

                 default:
                    System.out.println(roig + "\nERROR! Selecciona un nombre entre 1 i 10. Gràcies =D\n" + blanc);

            }
        }
    }
}


