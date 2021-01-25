import java.util.*; 
public class Main{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Sortida menú
        boolean sortir = false;
        //Nombre de la opció elegida
        int opcio;
        int nalumnes = 4;
        int mida = 50;
        String[] agenda = new String [mida];
        agenda[0] = "Garcia";
        agenda[1] = "Roman";
        agenda[2] = "Pasalamar";
        agenda[3] = "Rkouni";
        agenda[4] = "Girbes";
        


        //Colors i subratllat
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

        //Menú principal
        while(!sortir){
            System.out.println("");
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
            
            //Opcions del menú
            switch(opcio){
                //Inserir
                case 1:
                    System.out.println("Posa un cognom d'un alumne");
                    nalumnes ++;
                    agenda[nalumnes] = entrada.next();
                    break;
                //Localitzar
                case 2:
                    System.out.println("2");
                    break;
                //Recuperar
                case 3:
                    System.out.println("3");
                    break;
                //Suprimir
                case 4:
                    System.out.println("4");
                    break;
                //Suprimir dada
                case 5:
                    System.out.println("5");
                    break;
                //Anular
                case 6:
                    System.out.println("6");
                    break;
                //Primer/Darrer
                case 7:
                    System.out.println("7");
                    break;
                //Imprimir
                case 8:
                    System.out.println("\nAquests són els alumnes actuals:\n");
                    for(int x = 0 ; x <= nalumnes ; x++){
                        System.out.println((x + 1) + "." + agenda[x]);
                    }
                    System.out.println("");
                    break;
                //Ordenar
                case 9:
                    System.out.println("9");
                    break;
                //Sortir
                case 10:
                    sortir = true;
                    break;
                //Error
                 default:
                    System.out.println(roig + "\nERROR! Selecciona un nombre entre 1 i 10. Gràcies =D\n" + blanc);

            }
        }
    }
}
