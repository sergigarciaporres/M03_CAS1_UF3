import java.util.*; 
public class Main{

	private static String string;

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Sortida menú
        boolean sortir = false;
        boolean finalitzar = false;
        boolean trobat = false;
        String resposta;
        int posicio;
        //Nombre de la opció elegida
        int opcio;
        // Compta el número d'alumnes que tenim a agenda
        int nAlumnes = 0;
        final int MIDA = 50;
        String[] agenda = new String [MIDA];     

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

                
                case 1:
                //Inserir

                    finalitzar = false;
                    trobat = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();
                        trobat = false; 

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){
                        
                            if(nAlumnes == MIDA){

                                System.out.println( VERD + "\nLa llista està plena, si introdueixes una posició i cognom és perdrà el últim cognom de la llista.\n" + BLANC );
                                System.out.println( VERD + "\nVoleu inserir igualment alumnes al llistat?.\n" + BLANC );
                                System.out.println( VERD + "\nSi/No\n" + BLANC );

                                if(resposta.compareToIgnoreCase("no") == 0){

                                    System.out.println( "\n" + VERD +"Has sortit correctament del menú Inserir." + BLANC + "\n"  );
                                    trobat = true;
                                    finalitzar = true;

                                }

                                

                            }else{

                                System.out.println( VERD + "\nIntrodueix la posició\n" + BLANC );
                                posicio = entrada.nextInt();
                                System.out.println( VERD + "\nIntrodueix el cognom\n" + BLANC );
                                resposta = entrada.next();

                                if(posicio > nAlumnes){

                                    agenda[nAlumnes] = resposta;
                                    nAlumnes ++;

                                    System.out.println( VERD + "\nAquesta es la llista actualitzada:\n" + BLANC );

                                    for(int x = 0 ; x < nAlumnes ; x++){
                                    
                                        System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
            
                                    }

                                }else if( agenda[posicio - 1] != "")  {

                                    System.out.println( VIOLETA + "\nAquesta posició conté un cognom, \nsi l'introduiu el cognom existent \npassarà a la posició següent.\n" + BLANC );
                                    System.out.println( VIOLETA + "\nVoleu inserir-ho igualment?.\n" + BLANC );
                                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                                    
                                    while(!trobat){

                                        String si = entrada.next();
                                    
                                        if(si.compareToIgnoreCase("si") == 0){

                                            
                                            
                                           
                                            for ( int x = nAlumnes; x > posicio; x-- ){
                
                                                agenda[ x + 1 ] = agenda[ x ];

                                            }              
                                                
                                            nAlumnes ++;

                                            agenda[posicio - 1] = resposta;                                          

                                            System.out.println( VERD + "\nAquesta es la llista actualitzada:\n" + BLANC );

                                            for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                                System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
                
                                            }
                                            
                                            trobat = true;

                                        }else if(si.compareToIgnoreCase("no") == 0){

                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                                            trobat = true;
                                            finalitzar = true;
                                        
                                        }else{

                                            System.out.println( VERD + "\nIntrodueix Si o No, sisplau!\n" + BLANC );

                                        }
                                    
                                    }
                                }

                            }
                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                            trobat = true;
                            finalitzar = true;
                        
                        }
                    }
                
                    break;

                
                case 2:
                //Localitzar
                    finalitzar = false;
                    trobat = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();
                        trobat = false; 

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){
                        
                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                finalitzar = true;

                            }else {
        
                                while(!trobat){
                                
                                    System.out.println( VERD + "\nEntra un cognom de la llista:\n" + BLANC );
                                    String cognom = entrada.next();
                                    
                                    for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                        if(agenda[x].equals(cognom)){
                                       
                                            System.out.println( VIOLETA + "\n El cognom " + BLANC + cognom + VIOLETA + " està a la posició: " + BLANC + (x + 1) );
                                            trobat = true;
                                            break;
                                            
                                        }
                                       
                                    }
                                    
            
                                    if(!trobat){
            
                                        System.out.println( VIOLETA + "\nL'element " + BLANC + cognom + VIOLETA + " no està a la llista, voleu introduir una altra cognom?" + BLANC );
                                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                                        resposta = entrada.next();

                                        if(resposta.compareToIgnoreCase("no") == 0){
            
                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                                            trobat = true;
                                            finalitzar = true;
            
                                        }
                                    }
                                }
                            }
                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                            trobat = true;
                            finalitzar = true;
                        
                        }
                    }
                    break;

                
                case 3:
                //Recuperar

                finalitzar = false;
                trobat = false;
                
                while(!finalitzar){

                    //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                    System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                    resposta = entrada.next();
                    trobat = false;

                    //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                    if(resposta.compareToIgnoreCase("si") == 0){

                        if(nAlumnes <= 0){

                            System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                            trobat = true;

                        }else{

                            while(!trobat){
                
                                System.out.println( VERD + "\nEntra una posició de la llista:\n" + BLANC );
                                posicio = entrada.nextInt();
                                
                                if(posicio <= 0){
                                    
                                    System.out.println( BLANC + posicio + VIOLETA + " no és una dada correcta" + BLANC );
                                    System.out.println( VIOLETA + "\nVoleu introduir una altra posicio?" + BLANC );
                                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                                    resposta = entrada.next();
                    
                                    if(resposta.compareToIgnoreCase("no") == 0){
                                        
                                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                                        trobat = true; 
                    
                                    }
                                }else if(posicio > nAlumnes){

                                    System.out.println( "\n" + VIOLETA +"La posició que as introduït no pertany a cap cognom!" + BLANC + "\n"  );
                                    trobat = true;

                                
                                }else{

                                    posicio--;
                    
                                    System.out.println( VIOLETA + "\n4A la posicio " + BLANC + ( posicio + 1 ) + VIOLETA + " esta el següent cognom: " + BLANC + agenda[posicio]);
                                    trobat = true;
                                    
                                }
                            }
                        }
                    //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                    }else if(resposta.compareToIgnoreCase("no") == 0){

                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Suprimir." + BLANC + "\n"  );
                        finalitzar = true;
                        
                    }
                }
                break;

                
                case 4:
                //Suprimir posició

                    finalitzar = false;
                    trobat = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                trobat = true;
                                finalitzar = true;
        
                            }else{
        
                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                                
                                for(int x = 0 ; x < nAlumnes ; x++){
                                
                                    System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
        
                                 }
        
                                while(!trobat){
        
                                    System.out.println( VERD + "\nEscriu la posició de la llista que voleu eliminar:\n" + BLANC );
                                    posicio = entrada.nextInt();
        
                                    if( posicio > nAlumnes ){
        
                                        System.out.println( VERD + "\nLa posició introduïda no pertany a cap cognom, voleu introduir una altra posició?\n" + BLANC );
                                        System.out.println( VERD + "Si/No\n" + BLANC );
                                        resposta = entrada.next();
                                
                                        if(resposta.compareToIgnoreCase("si") == 0){
                                        
                                                                                          
                                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                                for(int x = 0 ; x < nAlumnes ; x++){

                                                System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                                                }
                                            
                                         
                                        }else if(resposta.compareToIgnoreCase("no") == 0){
        
                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú suprimir." + BLANC + "\n"  );
                                            trobat = true;
                                            finalitzar = true;
        
                                        }
        
                                    }else{
                                        
                                        System.out.println( "\n" + VERD +"Esteu Segurs que voleu suprimir aquesta posició?" + BLANC + "\n"  );
                                        System.out.println( VERD + "Si/No\n" + BLANC );
                                        resposta = entrada.next();
                                
                                        if(resposta.compareToIgnoreCase("si") == 0){

                                            System.out.println( "\n" + VIOLETA +"S'ha eliminat correctament de la posició " + BLANC + posicio + VIOLETA + " el cognom: " + BLANC + agenda[ posicio - 1] + "\n"  );
                                    
                                            for ( int x = posicio -1; x < nAlumnes; x++ ){
                
                                                agenda[ x ] = agenda[ x +1 ];
                
                                            }              
                                            nAlumnes --;

                                            if(nAlumnes > 0){

                                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                                for(int x = 0 ; x < nAlumnes ; x++){

                                                    System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
                                                    
                                                }
                                                break;
                                            }else{

                                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                                trobat = true;
                                                finalitzar = true;

                                            }

                                            
                                        
                                        }else if(resposta.compareToIgnoreCase("no") == 0){
        
                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú suprimir." + BLANC + "\n"  );
                                            trobat = true;
                                            finalitzar = true;
        
                                        }else {

                                            System.out.println( "\n" + ROIG +"Error, introdueix si o no, gràcies" + BLANC + "\n"  );
                                            
                                            break;

                                        }
                                    }
                                }                        
                            } 
                        
                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal        
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Suprimir." + BLANC + "\n"  );
                            finalitzar = true;
                            break;
                        }
                    }
                    break;

                
                case 5:
                //Suprimir nombre

                    finalitzar = false;
                    trobat = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();
                        trobat = false;

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                trobat = true;
                                finalitzar = true;
        
                            }else{
        
                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                                for(int x = 0 ; x < nAlumnes ; x++){
                                System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
        
                                }
        
                                while(!trobat){
        
                                    System.out.println( VERD + "\nEscriu el cognom de la llista que voleu eliminar:\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                        if(agenda[x].equals(resposta)){
                                       
                                            System.out.println("\n" + VIOLETA +"S'ha eliminat correctament el cognom "  + BLANC + resposta + VIOLETA + " de la posició " + BLANC + ( x + 1 ) + "\n");
                                            
                                            for ( int i = x; i < nAlumnes; i++ ){
        
                                                agenda[ i ] = agenda[ i + 1 ];
                                                
                                                }
            
                                                nAlumnes --;
                                                trobat = true;

                                            if(nAlumnes > 0){

                                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                                for(int i = 0 ; i < nAlumnes ; i++){

                                                    System.out.println( VIOLETA + (i + 1) + "." + agenda[i] + BLANC );
                                                    
                                                }
                                                break;

                                            }else{

                                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                                trobat = true;
                                                finalitzar = true;

                                            }    
    
                                            
                                        }
                                       
                                    }
                                    
            
                                    if(!trobat){
            
                                        System.out.println(VIOLETA + "\nEl cognom " + BLANC + resposta + VIOLETA + " no està a la llista, voleu introduir una altre cognom?" + BLANC);
                                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                                        resposta = entrada.next();

                                        if(resposta.compareToIgnoreCase("si") == 0){
                                            
                                            trobat = false;

                                        }else if(resposta.compareToIgnoreCase("no") == 0){
            
                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Suprimir Dada." + BLANC + "\n"  );
                                            trobat = true;
                                            finalitzar = true;
            
                                        }
                
                                    }
                                    
                                }                        
                            }

                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                            trobat = true;
                            finalitzar = true;
                        }
                    }                   
                    break;

                
                case 6:
                //Anular

                    finalitzar = false;
                    
                    while(!finalitzar){
                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                finalitzar = true;

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
                                    finalitzar = true;
                                
                                    
                                }else if(resposta.compareToIgnoreCase("no") == 0){

                                    System.out.println( "\n" + VERD +"Has sortit correctament del menú Anular." + BLANC + "\n"  );
                                    finalitzar = true;

                                }
                            }

                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal        
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Suprimir." + BLANC + "\n"  );
                        finalitzar = true;
                        
                        
                        }  
                    }
                    break;
                    
                
                case 7:
                //Primer/Darrer
                
                    trobat = false;
                    finalitzar = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();
                        trobat = false;

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                finalitzar = true;
                            }else{

                                while(!trobat){

                                    System.out.println( VERD + "\nVoleu veure el primer o darrer cognom de la llista?\n" + BLANC );
                                    System.out.println( VERD + "Primer/Darrer\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    if(resposta.compareToIgnoreCase("primer") == 0){
                                            
                                        System.out.println( VIOLETA + "\n" + agenda[0] + BLANC );
                                        trobat = true;
                                        
                                        
                                        
                                    }else if(resposta.compareToIgnoreCase("darrer") == 0) {
                                            
                                        System.out.println( VIOLETA + "\n" + agenda[nAlumnes - 1 ] + BLANC );
                                        
                                        trobat = true;
                                        
                                        
            
                                    }else {
            
                                        System.out.println( ROIG + "\nIntrodueix primer o darrer, perfavor!\n" + BLANC );
                                        
                                    }
                                }

                            }
                            
                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal 
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                            finalitzar = true;

                        }
                    }
                    break;

                
                case 8:
                //Imprimir

                    finalitzar = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next(); 

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                finalitzar = true;
        
                            }else{
        
                                System.out.println( VERD + "\nAquests són els alumnes actuals:\n" + BLANC );
        
                                for(int x = 0 ; x < nAlumnes ; x++){
        
                                    System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
        
                                }
                            }
        
                            System.out.println("");
                            finalitzar = true;

                        
                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal 
                        }else if(resposta.compareToIgnoreCase("no") == 0){

                            System.out.println( "\n" + VERD +"Has sortit correctament del menú Recuperar." + BLANC + "\n"  );
                            finalitzar = true;
                            break;
                        }
                    }
                    break;

                
                case 9:
                //Ordenar

                    System.out.println("9");

                    break;
                
                case 10:               
                //Sortir

                    //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                    System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                    resposta = entrada.next();

                    //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                    if(resposta.compareToIgnoreCase("si") == 0){

                        System.out.println( VERD + "\nHeu sortit del menú correctament!\n" + BLANC );
                        sortir = true;                           

                    //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal 
                    }else if(resposta.compareToIgnoreCase("no") == 0){

                    System.out.println( "\n" + VERD +"Has sortit correctament del menú Sortir." + BLANC + "\n"  );
              
                    }
                    break;
                    
                
                 default:
                 //Error

                    System.out.println( ROIG + "\nERROR! Selecciona un nombre entre 1 i 10. Gràcies =D\n" + BLANC );

            }
        }
    }
}
