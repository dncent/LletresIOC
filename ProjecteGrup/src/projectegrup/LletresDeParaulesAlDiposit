package lletresdeparaulesaldiposit;


public class LletresDeParaulesAlDiposit {

    public static void main(String[] args) {

        LletresDeParaulesAlDiposit programa=new LletresDeParaulesAlDiposit();
        programa.inici();
        
    
    }
    
    
    public void inici(){
        
        char[][] lletres={   {'A','B','A','D','E','S','S','A','I','D'},
                            {'O','L','P','L','O','R','A','R','I','N'},
                            {'C','L','O','U','R','E','B','A','T','A'}};
        
        String paraules1[]={"ABADESSA", "IDOL"};
        String paraules2[]={"ABADESSA", "IDOLM"};
        String paraules3[]={"ABADESSA", "IDOL","CASA","MASA"};
        String paraules4[]={"ABADESSA", "IDOL", "PLORAR", "INCLOURE", "BATA"};
        
        System.out.println(lletresDeParaulesAlDiposit(lletres, paraules1)); //Be
        System.out.println(lletresDeParaulesAlDiposit(lletres, paraules2)); //Malament
        System.out.println(lletresDeParaulesAlDiposit(lletres, paraules3)); //Malament
        System.out.println(lletresDeParaulesAlDiposit(lletres, paraules4)); //Be
        
    }
    /**
     * Compara que cada caracter existeix dins el diposit
     * @param diposit
     * @param paraules
     * @return 
     */
    public boolean lletresDeParaulesAlDiposit(char[][] diposit, String[] paraules){
        
        char[] caracters = obtenirTotsCaracters(paraules);
        
        char[][] dipositCopia = copiaMatriu(diposit);
        
        boolean exit=true;
        for(int i=0;i<caracters.length && exit;i++){
            exit=llevaLlletra(dipositCopia,caracters[i]);
        }
        
        return exit;
        
    }
    
    /**
     * Copiam la matriu per no borrar la matriu en general i no ens quedem sense paraula
     * @param original
     * @return 
     */
    public char[][] copiaMatriu(char[][] original){
        
        char[][] copia=new char[original.length][original[0].length];
        
        for(int i=0;i<original.length;i++){
            for(int j=0;j<original[0].length;j++){
                copia[i][j]=original[i][j];
            }
        }
        return copia;
        
    }
    /**
     * Cerca una lletra i la primera que trobi la elimina
     * per exemple si jo pos la A, que nomes elimini la primera A i no totes
     * @param diposit
     * @param caracter
     * @return 
     */
     public boolean llevaLlletra(char diposit[][],char caracter){
        
        boolean trobat=false;
        for(int i=0;i<diposit.length && !trobat;i++){
            for(int j=0;j<diposit[0].length && !trobat;j++){
                if(diposit[i][j]==caracter){
                    diposit[i][j]=' ';
                    trobat=true;
                }
            }
        }
        
        return trobat;
        
    }
     /**
      * 
     * Obte tots el caracters de les paraules validades
     * @param paraules
     * @return 
     */
     
     public char[] obtenirTotsCaracters(String[] paraules){
        
        char[] lletresAQuitar=new char[llongitudParaules(paraules)];
        int index_lletra=0;
        
        String paraula="";
        for(int i=0;i<paraules.length;i++){
            paraula=paraules[i];
            
            for(int j=0;j<paraula.length();j++, index_lletra++){
                lletresAQuitar[index_lletra]=paraula.charAt(j);
            }
        }
        
        return lletresAQuitar;
        
    }
    /**
     *Conta el numero de caracters de les paraules validades
     * @param paraules
     * @return 
     */
    public int llongitudParaules(String[] paraules){
        
        int contador=0;
        
        for(int i=0;i<paraules.length;i++){
            contador+=paraules[i].length();
        }
        
        return contador;
    }
    
    
    
}

