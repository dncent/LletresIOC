package projectegrup;

/**
 * La biblioteca d'interfíces ens permetrà formatar les sortides per consola mitjançant 
 * colors de font, fons de pantalla i símbols. Aquesta biblioteca dóna uns resultats
 * òptims amb el tamany de lletra de consola de 17.
 * 
 * Disposa de 6 colors de sortida per a:
 *      Presentació de l'aplicació - Negre sobre gris (30;47)
 *      Títol de la finestra en la que estem treballant - negre sobre cyan (30;46)
 *      Opcions de menú - blau sobre verd (34;42)
 *      Missatges de petició de dades - blau sobre cyan (34;46)
 *      Informació d'errors (com poden ser dades mal introduïdes) - blau sobre vermell (34;41)
 *      Resultats o respostes - blau sobre blanc (34;40)
 * 
 * Els separadors que farà servir seran:
 *      ─── (char)175
 *      ═══ (char)9552
 *      ███ (char)9608
 *      ░░░ (char)9617
 *      ▒▒▒ (char)9618
 *      ▓▓▓ (char)9619
 * 
 * Per a cadascun dels formats haurà de traspassar els paràmetres necessaris per a 
 * omplir la consola, que es detallen a cada mètode.
 * 
 * @author David Nogueras i Cervera
 */

public class interficies {
    
    /**
     * El mètode presentaAplicació mostra un text a la consola, formatat a 75 columnes
     * amb lletra negra sobre fons gris.
     * @param textPresentacio És el text que es mostrarà
     */
    public static void presentaAplicacio(String textPresentacio){
        //Fa la línia superior
        for (int i=0;i<50;i++){
            System.out.print("\033[30;47m"+(char)9617);
        }
        System.out.println();
        
        //Mostra el text tallant-lo cada 75 caràcters
        int k=0;
        for (int i=0;i<textPresentacio.length();i++){
            System.out.print("\033[30;47m     ");
            for (int j=k;((j<(k+75))&&(j<textPresentacio.length()));j++){
                System.out.print("\033[30;47m"+textPresentacio.charAt(j));
                i=j;
            }
            System.out.print("     ");
            if (i==textPresentacio.length()-1){
                int j = i%75;
                for (;j<74;j++){
                    System.out.print("\033[30;47m ");
                }
            }
            
            //Completa la línia
            System.out.println();
            if (k+75<textPresentacio.length()){
                k=k+75;
            }
        }
        
        //Fa la línia del peu
        for (int i=0;i<50;i++){
            System.out.print("\033[30;47m"+(char)9617);
        }
        System.out.println();
    }
    
    /**
     * El mètode titolFinestra fa una capçalera de pantalla centrada amb la frase que rep
     * @param titolFinestra És la frase que es mostrarà centrada a la consola
     */
    public static void titolFinestra(String titolFinestra){
        
        //Línia de capçalera
        for (int i=0;i<50;i++){
            System.out.print("\033[30;46m"+(char)9552);
        }
        System.out.println();
        
        //Centra el text
        int j=(85-titolFinestra.length())/2;
        for (int i=0;i<j;i++){
            System.out.print("\033[30;46m ");
        }
        System.out.print("\033[30;46m"+titolFinestra);
        for (int i=0;i<j;i++){
            System.out.print("\033[30;46m ");
        }
        System.out.println();
        
        //Línia del peu
        for (int i=0;i<50;i++){
            System.out.print("\033[30;46m"+(char)9552);
        }
        System.out.println();
    }
    
    /**
     * El mètode menú construeix un menú a partir dels textots rebuts en un array 
     * i una frase demanant què s'ha de fer
     * @param opcionsMenu Array de tipus String[] amb les opcions del menú
     * @param frasePeticio String amb la frase que indica què ha de fer l'usuari
     */
    public static void menu (String[] opcionsMenu, String frasePeticio){
        int llarg = 85,acabaLinia=0;
        
        //línia de capçalera
        for (int i=0;i<llarg;i++){
            System.out.print("\033[34;42m"+(char)175);
        }
        
        //Distribució de les opcions de menú
        System.out.println();
        for (int i=0;i<opcionsMenu.length;i++){
            System.out.print("\033[34;42m "+opcionsMenu[i]);
            acabaLinia=llarg-opcionsMenu[i].length()-1;
            for (int j=0;j<acabaLinia;j++){
                System.out.print("\033[34;42m ");
            }
            System.out.println();
        }
        
        //Línia del peu
        for (int i=0;i<llarg;i++){
            System.out.print("\033[34;42m"+(char)175);
        }
        System.out.println();
        
        //Frase d'instrucions
        System.out.print("\033[34;42m "+frasePeticio);
        acabaLinia=llarg-frasePeticio.length()-1;
        for (int j=0;j<acabaLinia;j++){
            System.out.print("\033[34;42m ");
        }
        System.out.println();
    }
    
    /**
     * El mètode peticioDades mostra una instrucció a l'usuari
     * @param frasePeticio És la frase que es vol mostrar a l'usuari
     */
    public static void peticioDades(String frasePeticio){
        System.out.print("\033[34;46m "+frasePeticio);
        int i = frasePeticio.length()+1;
        for (;i<85;i++){
            System.out.print("\033[34;46m ");
        }
        System.out.println();
    }
    
    /**
     * El mètode missatgeError mostra una frase passada per paràmetre en color blau,
     * sobre fons vermell
     * @param missatge És el text que es vol mostrar
     */
    public static void missatgeError (String missatge){
        System.out.print("\033[34;41m "+missatge);
        int i = missatge.length()+1;
        for (;i<85;i++){
            System.out.print("\033[34;41m ");
        }
        System.out.println();
    }
    
    /**
     * El mètode resultats mostra una frase en blau sobre fons blanc
     * @param missatgeResposta És el missatge que volem mostrar
     */
    public static void resultats (String missatgeResposta){
        System.out.print("\033[34;40m "+missatgeResposta);
        int i = missatgeResposta.length()+1;
        for (;i<85;i++){
            System.out.print("\033[34;40m ");
        }
        System.out.println();
    }
}
