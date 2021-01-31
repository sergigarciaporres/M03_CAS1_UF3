import java.util.*;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner6; 
public class Main{
    private static int i;

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Sortida menú
        boolean sortir = false;

        //Nombre de la opció elegida
        int opcio;

        // Compta el número d'alumnes que tenim a agenda
        int nAlumnes = 5;

        //Mida de màxima de l'array
        final int MIDA = 50;

        //Declarar el array amb la mida màxima
        String[] agenda = new String [MIDA];
        agenda[0] = "Garcia";
        agenda[1] = "Roman";
        agenda[2] = "Pasalamar";
        agenda[3] = "Rkouni";
        agenda[4] = "Girbes";
        
        //Opció de resposta simple dintre de les funcions del programa
        String resposta;
        


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
                    
                    agenda[nAlumnes] = entrada.next();
                    nAlumnes ++;

                break;

                //Localitzar
                case 2:

                    boolean tornarLocalitzar = false;
                    while(!tornarLocalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println("Vols continuar amb aquesta operació? Si/No");
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){
                                    
                            boolean no_llistat = false;
                        
                            if(nAlumnes <= 0){
        
                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                no_llistat = true;
        
                            }else {
        
                                while(!no_llistat){
                                
                                    System.out.println( VERD + "\nEntra un cognom de la llista:\n" + BLANC );
                                    String cognom = entrada.next();
                                    boolean trobat = false;
                                    
                                    for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                        if(agenda[x].equals(cognom)){
                                    
                                            System.out.println( VIOLETA + "\n El cognom " + BLANC + cognom + VIOLETA + " està a la posició: " + BLANC + (x + 1) );
                                            trobat = true;
                                            no_llistat = true;
                                            tornarLocalitzar = true;
            
                                        }
                                    }
            
                                    if(!trobat){
            
                                        System.out.println( VIOLETA + "\nL'element " + BLANC + cognom + VIOLETA + " no està a la llista, voleu introduir una altra cognom?" + BLANC );
                                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                                        resposta = entrada.next();
                                        
                                        if(resposta.compareToIgnoreCase("si") == 0){
                                        
                                            no_llistat = false;
                                            trobat = false;
            
                                        }else if(resposta.compareToIgnoreCase("no") == 0){
            
                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar.1" + BLANC + "\n"  );
                                            no_llistat = true;
                                            trobat = true;
            
                                        }
                                    }
                                }
                            }
                        
                         
                                               
                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                            tornarLocalitzar = true;
                            break;
                        
                        }else{
                            System.out.println("Hola");
                        }
                    }
                
                    

                //Recuperar
                case 3:

                    //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                    System.out.println("Vols continuar amb aquesta operació? Si/No");
                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                    resposta = entrada.next();

                    //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                    if(resposta.compareToIgnoreCase("si") == 0){

                        boolean noLlistat = false;
                        
                        if(nAlumnes <= 0){

                            System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                            noLlistat = true;

                        }else {

                            while(!noLlistat){
                            
                                System.out.println( VERD + "\nEntra una posició de la llista:\n" + BLANC );
                                int posicioDelCognom = entrada.nextInt();
                                boolean trobatPosicio = false;
                                int contadorPosicioArray = 0;

                                for(int x = 0 ; x < nAlumnes ; x++){
                                    
                                    while(contadorPosicioArray < posicioDelCognom){
                                        contadorPosicioArray++;
                                    }

                                    System.out.println( VIOLETA + "\n A la posicio " + BLANC + posicioDelCognom + VIOLETA + " està el cognom: " + BLANC + agenda[contadorPosicioArray] );
                                    trobatPosicio = true;
                                    noLlistat = true;
                                    break;
                                }

                                if(!trobatPosicio){
        
                                    System.out.println( VIOLETA + "\nL'element " + BLANC + posicioDelCognom + VIOLETA + " no està a la llista, voleu introduir una altra posicio?" + BLANC );
                                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    if(resposta.compareToIgnoreCase("si") == 0){
                                    
                                        noLlistat = false;
                                        trobatPosicio = false;
        
                                    }else if(resposta.compareToIgnoreCase("no") == 0){
        
                                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Recuperar." + BLANC + "\n"  );
                                        noLlistat = true;
                                        trobatPosicio = true;
        
                                    }
                                }
                            }
                        }
                    //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                    }else if(resposta.compareToIgnoreCase("no") == 0){

                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );

                        break;
                    }

                    break;

                //Suprimir posició FALTA ACABAR
                case 4:
                    boolean No_llistat = false;
                    
                    if(nAlumnes <= 0){

                        System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                        No_llistat = true;

                    }else{

                        System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                        for(int x = 0 ; x < nAlumnes ; x++){
                        System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                        }

                        while(!No_llistat){

                            System.out.println( VERD + "\nEscriu la posició de la llista que voleu eliminar:\n" + BLANC );
                            int posicio = entrada.nextInt();

                            if( posicio > nAlumnes ){

                                System.out.println( VERD + "\nLa posició introduïda no pertany a cap cognom, voleu introduir una altra posició?\n" + BLANC );
                                System.out.println( VERD + "Si/No\n" + BLANC );
                                resposta = entrada.next();
                        
                                if(resposta.compareToIgnoreCase("si") == 0){
                                
                                    No_llistat = false;

                                }else if(resposta.compareToIgnoreCase("no") == 0){

                                    System.out.println( "\n" + VERD +"Has sortit correctament del menú suprimir." + BLANC + "\n"  );
                                    No_llistat = true;

                                }

                            }else {

                            
                            
                            System.out.println( "\n" + VIOLETA +"S'ha eliminat correctament de la posició " + BLANC + posicio + VIOLETA + " el cognom: " + BLANC + agenda[ posicio - 1] + "\n"  );
                            
                            for ( int x = posicio -1; x < nAlumnes; x++ ){

                                agenda[ x ] = agenda[ x +1 ];

                            }

                            nAlumnes --;
                            No_llistat = true;
        
                            }
                        }                        
                    }            

                    break;

                //Suprimir nombre
                case 5:

                    boolean NO_llistat = false;
                    
                    if(nAlumnes <= 0){

                        System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                        NO_llistat = true;

                    }else{

                        System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                        for(int x = 0 ; x < nAlumnes ; x++){
                        System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                        }

                        while(!NO_llistat){

                            System.out.println( VERD + "\nEscriu el cognom de la llista que voleu eliminar:\n" + BLANC );
                            String cognom = entrada.next();
                            boolean Trobat = false;
                            
                            for(int x = 0 ; x < nAlumnes ; x++){
                                
                                if(agenda[x].equals(cognom)){
                               
                                    System.out.println( "\n" + VIOLETA +"S'ha eliminat correctament el cognom "  + BLANC + cognom + VIOLETA + " de la posició " + BLANC + ( x + 1 ) + "\n" );
                            
                                    for ( int i = x; i < nAlumnes; i++ ){

                                    agenda[ i ] = agenda[ i + 1 ];

                                    }

                                    nAlumnes --;
                                    NO_llistat = true;
                                    Trobat = true;
    
                                }else if(!Trobat){
    
                                    System.out.println( VIOLETA + "\nEl cognom " + BLANC + cognom + VIOLETA + " no està a la llista, voleu introduir una altra cognom?" + BLANC );
                                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    if(resposta.compareToIgnoreCase("si") == 0){
                                    
                                        NO_llistat = false;
                                        Trobat = true;
        
                                    }else if(resposta.compareToIgnoreCase("no") == 0){
        
                                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Suprimir Dada." + BLANC + "\n"  );
                                        NO_llistat = true;
                                        Trobat = true;
        
                                    }
                                }
                            }                        
                        }
                    }

                    break;

                //Anular
                case 6:

                    if(nAlumnes <= 0){

                        System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );

                    }else{

                        System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                    
                        for(int x = 0 ; x < nAlumnes ; x++){
                       
                            System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                        }
                    
                        System.out.println( VERD + "\nEstàs segur de voler borrar tota l'agenda?\n" + BLANC );
                        System.out.println( VERD + "Si/No\n" + BLANC );
                        resposta = entrada.next();
                        
                        if(resposta.compareToIgnoreCase("si") == 0){
                            
                            nAlumnes = 0;
                            System.out.println( VERD + "\nLa llista ha estat esborrada correctament!\n" + BLANC );
                            
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Anular." + BLANC + "\n"  );

                        }
                    }
                          

                    break;
                    
                //Primer/Darrer
                case 7:

                    boolean tornarPrimerDarrer = false;
                    while(!tornarPrimerDarrer){

                        System.out.println( VERD + "\nVoleu veure el primer o darrer cognom de la llista?\n" + BLANC );
                        System.out.println( VERD + "Primer/Darrer\n" + BLANC );
                        resposta = entrada.next();
                    
                        if(resposta.compareToIgnoreCase("primer") == 0){
                                
                            System.out.println( VIOLETA + "\n" + agenda[0] + BLANC );
                            tornarPrimerDarrer = true;
                            
                        }else if(resposta.compareToIgnoreCase("darrer") == 0) {
                                
                            System.out.println( VIOLETA + "\n" + agenda[nAlumnes - 1 ] + BLANC );
                            tornarPrimerDarrer = true;

                        }else {

                            System.out.println( VERD + "\nIntrodueix primer o darrer, perfavor!\n" + BLANC );
                            
                        }
                    }
                    
                    
                    break;

                //Imprimir
                case 8:

                    if(nAlumnes <= 0){

                        System.out.println( VERD + "\nNo hi han alumnes per mostrar\n" + BLANC );

                    }else{

                        System.out.println( VERD + "\nAquests són els alumnes actuals:\n" + BLANC );

                        for(int x = 0 ; x < nAlumnes ; x++){

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
