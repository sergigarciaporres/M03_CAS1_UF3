import java.util.*;
import java.util.jar.Attributes.Name; 
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
            //Decoració menú
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

                    System.out.println( VERD + "\nPosa un cognom d'un alumne\n" + BLANC );
                    
                    agenda[nalumnes] = entrada.next();
                    nalumnes ++;

                    break;

                //Localitzar
                case 2:
                
                    boolean no_llistat = false;
                    while(!no_llistat){
                        
                        System.out.println( VERD + "\nEntra un cognom de la llista:\n" + BLANC );
                        String cognom = entrada.next();
                        boolean trobat = false;
                        
                        for(int x = 0 ; x < nalumnes ; x++){
                            
                            if(agenda[x].equals(cognom)){
                           
                                System.out.println( VIOLETA + "\n Està a la posició: " + (x + 1) + BLANC );
                                trobat = true;
                                no_llistat = true;

                            }
                        }

                        if(!trobat){

                            System.out.println( VIOLETA + "L'element "+ cognom + " no està a la llista" + BLANC );
                            no_llistat = false;

                        }
                }
                    break;
                //Recuperar
                case 3:

                    System.out.println("3");

                    break;

                //Suprimir posició FALTA ACABAR
                case 4:
                    boolean No_llistat = false;
                    System.out.println( VERD + "\nAquests són els alumnes actuals:\n" + BLANC );

                    for(int x = 0 ; x < nalumnes ; x++){

                        System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                    }

                    while(!No_llistat){

                        System.out.println( VERD + "Escriu la posició de la llista que voleu eliminar:\n" + BLANC );
                        int posicio = entrada.nextInt();

                        if( posicio > nalumnes ){

                            System.out.println( VERD + "La posició introduïda no pertany a cap alumne, voleu introduir una altra posició?\n" + BLANC );
                            System.out.println( VERD + "Si/No\n" + BLANC );
                            String si = entrada.next();
                    
                            if(si.compareToIgnoreCase("si") == 0){
                            
                                No_llistat = false;

                            }else if(si.compareToIgnoreCase("no") == 0){

                                System.out.println( "\n" + VERD +"Has sortit correctament del menú suprimir." + BLANC + "\n"  );
                                No_llistat = true;

                            }

                        }else {

                        nalumnes = posicio;
                        System.out.println( "\n" + VIOLETA +"S'ha eliminat correctament de la posició " + posicio + " el alumne: "+ agenda[nalumnes - 1 ] + BLANC + "\n"  );
                        No_llistat = true;
    
                    }
                        
                    }
                    

                    
                    

                    break;

                //Suprimir nombre
                case 5:

                    System.out.println("5");

                    break;

                //Anular
                case 6:

                    System.out.println( VERD + "\nAquests són els alumnes actuals:\n" + BLANC );
                    
                    for(int x = 0 ; x < nalumnes ; x++){
                       
                        System.out.println( VERD + (x + 1) + "." + agenda[x] + BLANC );

                    }
                    
                    System.out.println( VERD + "\nEstàs segur de voler borrar tota l'agenda?\n" + BLANC );
                    System.out.println( VERD + "Si/No\n" + BLANC );
                    String si = entrada.next();
                    
                    if(si.compareToIgnoreCase("si") == 0){
                        
                        nalumnes = 0;
                        System.out.println( VERD + "\nLa llista ha estat esborrada correctament!\n" + BLANC );
                        
                    }      

                    break;
                    
                //Primer/Darrer
                case 7:

                    boolean tornar = false;
                    while(!tornar){

                        System.out.println( VERD + "\nVoleu veure el primer o darrer cognom de la llista?\n" + BLANC );
                        System.out.println( VERD + "Primer/Darrer\n" + BLANC );
                        String resposta = entrada.next();
                    
                        if(resposta.compareToIgnoreCase("primer") == 0){
                                
                            System.out.println( VIOLETA + "\n" + agenda[0] + BLANC );
                            tornar = true;
                            
                        }else if(resposta.compareToIgnoreCase("darrer") == 0) {
                                
                            System.out.println( VIOLETA + "\n" + agenda[nalumnes - 1 ] + BLANC );
                            tornar = true;

                        }else {

                            System.out.println( VERD + "\nIntrodueix primer o darrer, perfavor!\n" + BLANC );
                            
                        }
                    }
                    
                    
                    break;

                //Imprimir
                case 8:

                    if(nalumnes <= 0){

                        System.out.println( VERD + "\nNo hi han alumnes per mostrar\n" + BLANC );

                    }else{

                        System.out.println( VERD + "\nAquests són els alumnes actuals:\n" + BLANC );

                        for(int x = 0 ; x < nalumnes ; x++){

                            System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

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
                    
                    System.out.println( VERD + "\nHeu sortit del menú correctament!\n" + BLANC );
                    sortir = true;

                    break;
                //Error
                 default:

                    System.out.println( ROIG + "\nERROR! Selecciona un nombre entre 1 i 10. Gràcies =D\n" + BLANC );

            }
        }
    }
}
