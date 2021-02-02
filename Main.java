import java.util.*; 
public class Main{

	private static String string;

	public static void main(String[] args) {

        //Clase per ingresar dades per teclat
        Scanner entrada = new Scanner(System.in);
        
        //Sortida menú
        boolean sortir = false;

        //Sortida dels diferents menus interns
        boolean finalitzar = false;

        //Ens servirà per especificar quan estem dins d'un case i ens deixa triar a l'hora d'executar una altratra variable que com per exeple localitzar
        boolean trobat = false;

        //Variable on és guarda les respostes de l'usuari
        String resposta;

        //Variable on és guarda la posicio introduida per l'usuari
        int posicio;

        //Nombre de la opció elegida
        int opcio;

        // Compta el número d'alumnes que tenim a agenda
        int nAlumnes = 0;

        //Mida de la llista
        final int MIDA = 50;

        //Array on es guarda les diferents cognoms
        String[] agenda = new String [MIDA];     

        //Tenim tots els tipus de colors i subratllats declarats que hem fet servir
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
          
            //Aqui el que fem és que la proxima entrada del teclat es guardar a la variable previament definida que en este cas es opció
            opcio = entrada.nextInt();
            
            //Opcions del menú, la sentència switch evalua una expressió i executarà el bloc de sentències que coincideixi amb el valor de l'expressió. El valor de l'expressió ha de ser numèric. En aquest cas és el que tenim guardat a opció
            switch(opcio){

                case 1:

                //Aquí tenim el primer cas que és Inserir

                    //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar 

                    finalitzar = false;

                    //Aqui li direm que la variable trobat que recordem que era un boolea sirà fals temps d'iniciar 

                    trobat = false;

                    //Aqui li direm que mentre no sigui diferent a la variable finalitzar no suritigue del while

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la

                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );

                        //Un com hem entrat dins de la sentencia while li direm que hi hagi una entrada de text que es guarde a la variable resposta

                        resposta = entrada.next();

                        //Ara aquí li direm que el boolea trobat continue sen fals, ja que si entra al següent if i decideix no sortir no és repetirà ja que és quedarà com a verdader i ho ignorarà

                        trobat = false; 

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){
                        
                            //Amb aquest if li direm que si el numero de alumnes es igual que la mida del array que execute el de dins

                            if(nAlumnes == MIDA){

                                System.out.println( VERD + "\nLa llista està plena, si introdueixes una posició i cognom és perdrà el últim cognom de la llista.\n" + BLANC );
                                System.out.println( VERD + "\nVoleu inserir igualment alumnes al llistat?.\n" + BLANC );
                                System.out.println( VERD + "\nSi/No\n" + BLANC );

                                //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                                if(resposta.compareToIgnoreCase("no") == 0){

                                    System.out.println( "\n" + VERD +"Has sortit correctament del menú Inserir." + BLANC + "\n"  );
                                    trobat = true;
                                    finalitzar = true;

                                }   

                            //Sino que execute això:

                            }else{

                                System.out.println( VERD + "\nIntrodueix la posició\n" + BLANC );

                                //Aqui guardarem a la variable posicio el que entre pel teclat que sira un numero

                                posicio = entrada.nextInt();

                                System.out.println( VERD + "\nIntrodueix el cognom\n" + BLANC );

                                //Aqui guardarem a la variable resposta el que entre pel teclat que siran caracters

                                resposta = entrada.next();

                                //Si posició és més gran que el número de alumnes executarà el que tingui dins

                                if(posicio > nAlumnes){

                                    //Aquí li diem que el cognom introduit a la variable resposta es guardi dins del array a la posicio del numero de alumnes que pugi
                                    agenda[nAlumnes] = resposta;

                                    //seguidament d'aixo incrementem la variable ja que s'ha ocupat la posicio

                                    nAlumnes ++;

                                    System.out.println( VERD + "\nAquesta es la llista actualitzada:\n" + BLANC );

                                    //Aquest for ens servirà per recorrer el array, i quan trobe que x es igual a nAlumnes no executarà el que té dins

                                    for(int x = 0 ; x < nAlumnes ; x++){
                                    
                                        //Amb això el que farem sira imprimir la llista del nostre array incrementan cada posicio que sabem que està plena

                                        System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
            
                                    }

                                //Amb aquesta condicio li direm que si la posicio que ha introduit es menor a 1 o igual a "" és mostre les seguents linies

                                }else if( agenda[posicio - 1] != "")  {

                                    System.out.println( VIOLETA + "\nAquesta posició conté un cognom, \nsi l'introduiu el cognom existent \npassarà a la posició següent.\n" + BLANC );
                                    System.out.println( VIOLETA + "\nVoleu inserir-ho igualment?.\n" + BLANC );
                                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                                    
                                    //Aqui li direm que mentre no sigui diferent a la variable trobat no suritigue del while

                                    while(!trobat){

                                        //Assignem una variable a un tipo de dada "sting" que sirà la entrada del teclat 

                                        String si = entrada.next();
                                        
                                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció

                                        if(si.compareToIgnoreCase("si") == 0){

                                            
                                            //Aquest for serveix per quan volem introduir un cognom en una posicio on ja hi ha un cognom, el cognom existen passa a la següent posició
                                           
                                            for ( int x = nAlumnes; x > posicio; x-- ){
                
                                                agenda[ x + 1 ] = agenda[ x ];

                                            }              
                                            
                                            //Aqui incrementem el nAlumnes 

                                            nAlumnes ++;

                                            agenda[posicio - 1] = resposta;                                          

                                            System.out.println( VERD + "\nAquesta es la llista actualitzada:\n" + BLANC );

                                            //Aquest for ens servirà per recorrer el array, i quan trobe que x es igual a nAlumnes no executarà el que té dins

                                            for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                                System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
                
                                            }
                                            
                                            //Aqui li direm que aquesta variable es true per sortir del while

                                            trobat = true;
                                        
                                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
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
                
                    //L'ús de la instrucció break permet que un cicle for o while sigui interromput i l'execució surt-te fora del bloc de codi.

                    break;
                
                case 2:

                //Aquí tenim el segon cas que és Localitzar

                    //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                    finalitzar = false;

                    //Aqui li direm que la variable trobat que recordem que era un boolea sirà fals temps d'iniciar

                    trobat = false;

                    //Aqui li direm que mentre no sigui diferent a la variable finalitzar no suritigue del while

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la

                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );

                        //Aqui guardarem a la variable resposta el que entre pel teclat que siran caracters

                        resposta = entrada.next();

                        //Ara aquí li direm que el boolea trobat continue sen fals, ja que si entra al següent if i decideix no sortir no és repetirà ja que és quedarà com a verdader i ho ignorarà

                        trobat = false; 

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){
                        
                            //Aqui compararem nAlumnes amb 0 i si es menor o igual a 0 que execute el codi de dins

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                finalitzar = true;

                            //sino que execute la següent sentencia

                            }else {
                                
                                //mentre while no sigui diferent a trobat que execute aquestes sentencies

                                while(!trobat){
                                
                                    System.out.println( VERD + "\nEntra un cognom de la llista:\n" + BLANC );
                                    String cognom = entrada.next();
                                    
                                    //Aqui recorrem el array

                                    for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                        //I li diem si la posició de l'agenda es igual al cognom que execute les següent linies 

                                        if(agenda[x].equals(cognom)){
                                       
                                            System.out.println( VIOLETA + "\n El cognom " + BLANC + cognom + VIOLETA + " està a la posició: " + BLANC + (x + 1) );
                                            trobat = true;
                                            break;
                                            
                                        }
                                       
                                    }
                                    
                                    //Ho farem servir en cas de si volem introduir unaltre cognom

                                    if(!trobat){
            
                                        System.out.println( VIOLETA + "\nL'element " + BLANC + cognom + VIOLETA + " ja està a la llista, voleu introduir una altra cognom?" + BLANC );
                                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                                        resposta = entrada.next();

                                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal

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

                //Aquí tenim el tercer cas que és Recuperar

                //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                finalitzar = false;

                //Aqui li direm que la variable trobat que recordem que era un boolea sirà fals temps d'iniciar

                trobat = false;
                
                //Aqui li direm que mentre no sigui diferent a la variable finalitzar no suritigue del while

                while(!finalitzar){

                    //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                    System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                    resposta = entrada.next();
                    trobat = false;

                    //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                    if(resposta.compareToIgnoreCase("si") == 0){

                        //Aqui informarem en cas de que si nAlumnes es menor o igual que 0 que informe que no pot recuperar
                        if(nAlumnes <= 0){

                            System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                            trobat = true;
                        
                        //si en cas contrari si que tenim alumnes que execute les següents sentencies
                        }else{

                            //mentre while no sigui diferent a trobat que execute aquestes sentencies

                            while(!trobat){
                
                                System.out.println( VERD + "\nEntra una posició de la llista:\n" + BLANC );
                                posicio = entrada.nextInt();
                                
                                //Aquest if l'hem posat en cas de que l'usuari introduixque una dada que sigui menor que 0 i li mostre error ja que no podra recuperar cap alumne
                                if(posicio <= 0){
                                    
                                    System.out.println( BLANC + posicio + VIOLETA + " no és una dada correcta" + BLANC );
                                    System.out.println( VIOLETA + "\nVoleu introduir una altra posicio?" + BLANC );
                                    System.out.println( VERD + "\nSi/No\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
                                    if(resposta.compareToIgnoreCase("no") == 0){
                                        
                                        System.out.println( "\n" + VERD +"Has sortit correctament del menú Localitzar." + BLANC + "\n"  );
                                        trobat = true; 
                    
                                    }

                                //Aquets en cas de que la posició introduida fos mes gran que el numero de alumnes se li mostre un missatge de que no pertany a cam cognom    
                                }else if(posicio > nAlumnes){

                                    System.out.println( "\n" + VIOLETA +"La posició que as introduït no pertany a cap cognom!" + BLANC + "\n"  );
                                    trobat = true;

                                //sino en cas contrari que mostre la posicio del cognom
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
                //Aquí tenim el quart cas que és suprimir posició

                //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                finalitzar = false;

                //Aqui li direm que la variable trobat que recordem que era un boolea sirà fals temps d'iniciar

                trobat = false;

                    //Aqui li direm que mentre no sigui diferent a la variable finalitzar no suritigue del while

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            //Aquest if ens servirà per especificar a l'usuari que la llista està buida ja que si nAlumnes es menor o igual que 0 no podrem suprimir cap alumne
                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                trobat = true;
                                finalitzar = true;
                            
                            //En cas de indroduïr bé la posició que li mostre els cognoms de la llista

                            }else{
        
                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                                
                                //Amb aquest for recorrerem l'array imprimin cada un d'ells fins arribar al numero de alumnes
                                for(int x = 0 ; x < nAlumnes ; x++){
                                
                                    System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
        
                                 }
                                
                                //mentre while no sigui diferent a trobat que execute aquestes sentencies

                                while(!trobat){
        
                                    System.out.println( VERD + "\nEscriu la posició de la llista que voleu eliminar:\n" + BLANC );
                                    posicio = entrada.nextInt();
                                    
                                    //amb aquets if ens servirà en cas de que la posició si es mes gran que nAlumnes ens mostre un missatge d'error
                                    if( posicio > nAlumnes ){
        
                                        System.out.println( VERD + "\nLa posició introduïda no pertany a cap cognom, voleu introduir una altra posició?\n" + BLANC );
                                        System.out.println( VERD + "Si/No\n" + BLANC );
                                        resposta = entrada.next();
                                        
                                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                                        if(resposta.compareToIgnoreCase("si") == 0){
                                        
                                                                                          
                                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                                //Tornem a recorrer l'array i mostrem la llista de les posicions amb el cognom

                                                for(int x = 0 ; x < nAlumnes ; x++){

                                                System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                                                }
                                            
                                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal  
                                        }else if(resposta.compareToIgnoreCase("no") == 0){
        
                                            System.out.println( "\n" + VERD +"Has sortit correctament del menú suprimir." + BLANC + "\n"  );
                                            trobat = true;
                                            finalitzar = true;
        
                                        }
                                    
                                    //aqui el que fem que en cas de que estigui be la posico introduida que ens mostre un missatge de si estem segurs de voler esborrar-la
                                    }else{
                                        
                                        System.out.println( "\n" + VERD +"Esteu Segurs que voleu suprimir aquesta posició?" + BLANC + "\n"  );
                                        System.out.println( VERD + "Si/No\n" + BLANC );
                                        resposta = entrada.next();
                                        
                                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                                        if(resposta.compareToIgnoreCase("si") == 0){

                                            System.out.println( "\n" + VIOLETA +"S'ha eliminat correctament de la posició " + BLANC + posicio + VIOLETA + " el cognom: " + BLANC + agenda[ posicio - 1] + "\n"  );
                                    
                                            //Aquest for fa que quan suprimixes un cognom el cognom que estava després passa a la posició del suprimit i així succesivament

                                            for ( int x = posicio -1; x < nAlumnes; x++ ){
                
                                                agenda[ x ] = agenda[ x +1 ];
                
                                            }  
                                            
                                            //Li restem 1 a nAlumnes ja que hem suprimit 1 cognom

                                            nAlumnes --;

                                            //amb aquets if li diem si nAlumnes es més gran que 0 ens mostre els cognoms

                                            if(nAlumnes > 0){

                                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                                //Recorrem l'array hi ho imprimim un per un fins arribar a nAlumnes
                                                for(int x = 0 ; x < nAlumnes ; x++){

                                                    System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
                                                    
                                                }
                                                break;

                                            //sino que mostre un missatge d'error

                                            }else{

                                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                                trobat = true;
                                                finalitzar = true;

                                            }

                                            
                                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
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
                //Aquí tenim el cinquè cas que és suprimir nombre

                //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                finalitzar = false;

                //Aqui li direm que la variable trobat que recordem que era un boolea sirà fals temps d'iniciar

                trobat = false;

                    //Aqui li direm que mentre no sigui diferent a la variable finalitzar no suritigue del while

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();
                        trobat = false;

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            //si nAlumnes es menor o igual a 0 que es mostre aquest missatge ja que no tindrem cognoms
                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                trobat = true;
                                finalitzar = true;
        
                            //Sino que mostre els cognoms
                            }else{
        
                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                //recorrem l'array i els imprimim

                                for(int x = 0 ; x < nAlumnes ; x++){
                                System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );
        
                                }
        
                                while(!trobat){
        
                                    System.out.println( VERD + "\nEscriu el cognom de la llista que voleu eliminar:\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    //recorrem l'array

                                    for(int x = 0 ; x < nAlumnes ; x++){
                                        
                                        //Amb aquest if aconseguirem que la variable resposta introduida sigui igual a la posicio de la agenda execute les següents sentències
                                        if(agenda[x].equals(resposta)){
                                       
                                            System.out.println("\n" + VIOLETA +"S'ha eliminat correctament el cognom "  + BLANC + resposta + VIOLETA + " de la posició " + BLANC + ( x + 1 ) + "\n");
                                            
                                            //recorrem una altra vegada la array però aquesta vegada iniciant de la posició x 

                                            for ( int i = x; i < nAlumnes; i++ ){
                                                
                                                //Amb això conseguirem que el que està a la posicio i pase a la següent i així fins arribar a nAlumnes
                                                agenda[ i ] = agenda[ i + 1 ];
                                                
                                                }
            
                                                nAlumnes --;
                                                trobat = true;

                                            //Per últim si nAlumnes és més gran que 0 que mostre com ha quedat la llista

                                            if(nAlumnes > 0){

                                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );

                                                for(int i = 0 ; i < nAlumnes ; i++){

                                                    System.out.println( VIOLETA + (i + 1) + "." + agenda[i] + BLANC );
                                                    
                                                }
                                                break;

                                            // si en cas contrari es igual o menor que indiqui el següent missatge

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

                                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                                        if(resposta.compareToIgnoreCase("si") == 0){
                                            
                                            trobat = false;

                                        //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal
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

                //Aquí tenim el sisè cas que és anular

                //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                finalitzar = false;
     
                    while(!finalitzar){
                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next();

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            //si nAlumnes es menor o igual que mostri el següent misstage

                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );

                                //Aqui ens sortirà del while

                                finalitzar = true;

                            }else{

                                System.out.println( VERD + "\nAquests són els cognoms actuals:\n" + BLANC );
                            
                                //recorrem l'array per a que es mostre a la pantalla

                                for(int x = 0 ; x < nAlumnes ; x++){
                            
                                    System.out.println( VIOLETA + (x + 1) + "." + agenda[x] + BLANC );

                                }
                            
                                System.out.println( VERD + "\nEstàs segur de voler borrar tota l'agenda?\n" + BLANC );
                                System.out.println( VERD + "Si/No\n" + BLANC );
                                resposta = entrada.next();
                                
                                //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                                if(resposta.compareToIgnoreCase("si") == 0){
                                    
                                    //aqui reiniciem els cognoms a 0

                                    nAlumnes = 0;
                                    System.out.println( VERD + "\nLa llista ha estat esborrada correctament!\n" + BLANC );
                                    finalitzar = true;
                                
                                //Si es dona una resposta negativa(no/NO/No) surt de la funció i torna al menú principal    
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

                //Aquí tenim el setè cas que és primer / darrer
                
                //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                finalitzar = false;

                //Aqui li direm que la variable trobat que recordem que era un boolea sirà fals temps d'iniciar

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

                            //si la llista no està buida que execute el següent while

                            }else{

                                while(!trobat){

                                    System.out.println( VERD + "\nVoleu veure el primer o darrer cognom de la llista?\n" + BLANC );
                                    System.out.println( VERD + "Primer/Darrer\n" + BLANC );
                                    resposta = entrada.next();
                                    
                                    //Amb aquest mètode compara dues cadenes lexicogràficament, ignorant les diferències entre majúscules i minúscules. en cas de que entre primer execute això
                                    if(resposta.compareToIgnoreCase("primer") == 0){
                                            
                                        System.out.println( VIOLETA + "\n" + agenda[0] + BLANC );
                                        trobat = true;
                                        
                                        
                                    //en cas de que entre darrer que execute la següent sentencia.
                                    }else if(resposta.compareToIgnoreCase("darrer") == 0) {
                                            
                                        System.out.println( VIOLETA + "\n" + agenda[nAlumnes - 1 ] + BLANC );
                                        
                                        trobat = true;
                                        
                                    //En cas de que no és compleixin que mostre un missatge d'error

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

                //Aquí tenim el vuitè cas que és imprimir la array completa

                //Aqui li direm que la variable finalitzar que recordem que era un boolea sirà fals temps d'iniciar

                finalitzar = false;

                    while(!finalitzar){

                        //Dona opcio de sortir de la funció sense haver d'utilitzar-la
                        System.out.println( VERD + "\nVols continuar amb aquesta operació?" + BLANC );
                        System.out.println( VERD + "\nSi/No\n" + BLANC );
                        resposta = entrada.next(); 

                        //Si es dona una resposta afirmativa(si/SI/Si) es fa la funció
                        if(resposta.compareToIgnoreCase("si") == 0){

                            //mirarem que nAlumnes sigui mes menut o igual que 0 i si és així que execute aquestes linies de codi
                            if(nAlumnes <= 0){

                                System.out.println( VERD + "\nLa llista està buida.\n" + BLANC );
                                finalitzar = true;
        
                            //en cas contrari que execute les següents linies
                            }else{
        
                                System.out.println( VERD + "\nAquests són els alumnes actuals:\n" + BLANC );
        
                                //Recorrem l'array
                                for(int x = 0 ; x < nAlumnes ; x++){
                                    
                                    //imprimim la posició amb cada cognom
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

                //Aquí tenim el novè cas que és ordenar

                    System.out.println( VERD + "Aquest menu no està funcional:(" + BLANC );

                    break;
                
                case 10:       

                //Aquí tenim el desè cas que és sortir

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
