import java.util.*; 
public class Main{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Sortida menú
        boolean sortir = false;
        //Nombre de la opció elegida
        int opcio;
        // Compta el número d'alumnes que tenim a agenda
        int nalumnes = 5;
        final int MIDA = 50;
        String[] agenda = new String [MIDA];
        agenda[0] = "Garcia";
        agenda[1] = "Roman";
        agenda[2] = "Pasalamar";
        agenda[3] = "Rkouni";
        agenda[4] = "Girbes";
        


        //Colors i subratllat
        final String NEGRE="\033[30m"; 
        final String ROIG="\033[31m"; 
        final String VERD="\033[32m"; 
        final String GROC="\033[33m"; 
        final String BLAU="\033[34m"; 
        final String VIOLETA="\033[35m"; 
        final String BLAU_FLUIX="\033[36m";
        final String NEGRE_SUBRRALLAT="\u001B[40m";
        final String ROIG_SUBRRALLAT="\u001B[41m";
        final String VERD_SUBRALLAT="\u001B[42m";
        final String GROC_SUBRALLAT="\u001B[43m";
        final String BLAU_SUBRALLAT="\u001B[44m";
        final String VIOLETA_SUBRRALLAT="\u001B[45m";
        final String BLAU_FLUIX_SUBRRALLAT="\u001B[46m";
        final String BLANC_FLUIX_SUBRRALLAT="\u001B[47m";
        final String BLANC="\u001B[0m";

        //Menú principal
        while(!sortir){
            System.out.println("");
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "                        "+ BLANC);
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "                    " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  "+ BLANC + VERD + "   " + "Trieu un nombre" + BLANC + "  " + BLAU_FLUIX_SUBRRALLAT + "  "+ BLANC);
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "                    " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "                        "+ BLANC);                              
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  "+ BLANC + "                    "+ BLAU_FLUIX_SUBRRALLAT + "  "+ BLANC);
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "1. Inserir" + "        " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "2. Localitzar" + "     " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "3. Recuperar" + "      " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "4. Suprimir" + "       " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "5. Suprimir dada" + "  " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "6. Anular" + "         " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "7. Primer/Darrer" + "  " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "8. Imprimir" + "       " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "9. Ordenar" + "        " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "  " + "10. Sortir" + "        " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "  " + BLANC + "                    " + BLAU_FLUIX_SUBRRALLAT + "  " + BLANC );
            System.out.println(BLAU_FLUIX_SUBRRALLAT + "                        "+ BLANC);
            System.out.println(" ");
          
            opcio = entrada.nextInt();
            
            //Opcions del menú
            switch(opcio){
                //Inserir FALTA ACABAR
                case 1:
                 /* Si llista plena 
                    ** informar que no es pot inserir o que s'esborraran dades */
                    /* cas contrari 
                   
                Insereix element x en la posició p (p és una posició coherent els elements es desplacen a la dreta, si cal)
                Augmenta en 1 controlador de numero d’elements
                Imprimeix llista després de la inserció*/
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

                //Suprimir nombre FALTA ACABAR
                case 4:
                    System.out.println("\nAquests són els alumnes actuals:\n");
                    for(int x = 0 ; x <= nalumnes ; x++){
                        System.out.println((x + 1) + "." + agenda[x]);
                }
                    System.out.println("Escriu el nombre de l'alumne que voleu eliminar:");
                    break;

                //Suprimir dada
                case 5:
                    System.out.println("5");
                    break;

                //Anular
                case 6:
                    System.out.println("\nAquests són els alumnes actuals:\n");
                    
                    for(int x = 0 ; x < nalumnes ; x++){
                       
                        System.out.println((x + 1) + "." + agenda[x]);
                    }
                    
                    System.out.println("\nEstàs segur de voler borrar tota l'agenda?\n");
                    System.out.println("Si/No\n");
                    String si = entrada.next();
                    
                    if(si.compareToIgnoreCase("si") == 0){
                        
                        nalumnes = 0;
                        
                    }                       
                    break;
                    
                //Primer/Darrer
                case 7:

                    boolean tornar = false;
                    while(!tornar){

                        System.out.println("\nVoleu veure el primer o darrer cognom de la llista?\n");
                        System.out.println("Primer/Darrer\n");
                        String resposta = entrada.next();
                    
                        if(resposta.compareToIgnoreCase("primer") == 0){
                                
                            System.out.println("\n" + agenda[0]);
                            tornar = true;
                            
                        }else if(resposta.compareToIgnoreCase("darrer") == 0) {
                                
                            System.out.println("\n" + agenda[nalumnes - 1 ]);
                            tornar = true;

                        }else {

                            System.out.println("\nIntrodueix primer o darrer, perfavor!\n");
                            
                        }
                    }
                    
                    
                    break;

                //Imprimir
                case 8:
                    if(nalumnes <= 0){
                        System.out.println("\nNo hi han alumnes per mostrar\n");
                    }else{
                        System.out.println("\nAquests són els alumnes actuals:\n");
                        for(int x = 0 ; x < nalumnes ; x++){
                            System.out.println((x + 1) + "." + agenda[x]);
                        }
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
                    System.out.println(ROIG + "\nERROR! Selecciona un nombre entre 1 i 10. Gràcies =D\n" + BLANC);

            }
        }
    }
}
