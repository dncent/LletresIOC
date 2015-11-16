package projectegrup;

/**
 *
 * @author David
 */
public class A1_1CercaParaules {
   public static void main(String[] args) {
        A1_1CercaParaules prg = new A1_1CercaParaules();
        prg.prova();
    }
    
   //Aquest diccionari haurà d'anar a l'estructura de dades
    private void prova() {
          String[] diccionari = {
            "a","abadessa","abandonat","abarnegat","abat","abatussat","abissal","abnegat",
            "abrainat","abruptesa","abscissa","absolut","abstreure","acabar","acampar",
            "accent","acer","acerat","acid","aclamar","aclarir","aclarit","acrata",
            "acrobacia","adagi","adaptar","adeptes","adequar","adequat","adeu","adherir",
            "admetre","adonar","adormir","adscriure","adust","advers","advocat","afanar",
            "afany","afavorir","afavorit","afebleix","afeblit","afectat","afectiu","afectuos",
            "afegir","afer","afilar","afinar","afi","afligir","afligit","aflorar","afluent",
            "afluixar","agafar","agalla","agata","agencia","agrair","agrait","agrari","agre",
            "agregar","agror","aguila","ah","ahir","aigua","aiguat","aire","aixada","aixafar",
            "aixecar","aixeta","aixella","aixi","aixo","aixovar","ajeure","ajornar",
            "ajudar","ajupir","ajustar","ala","albada","albi","ale","alenar",
            "alevi","alga","algid","algu","alie","alla","alli","allo","alma","alpi",
            "altivesa","amagar","amanida","amanir","ambre","amorf","ample","ampliar",
            "anar","anca","angoixa","anis","ansa","apagar","apagat","apercebre",
            "apostata","arbre","aristòcrata","atreure","audiofon","autocrata",
            "baixa","bali","bandol","barata","barbar","barrera","bassal","bata",
            "benveure","benviure","bestraure","bobila","bossarrera","bravata","bufor",
            "cabre","caixa","calabre","calibre","canelobre","cantata","carabassal","carrera",
            "casal","caure","causa","celebre","censal","centaure","cercavila","circumscriure",
            "clamar","clar","cloure","codol","colossal","columnata","comensal","commoure",
            "complaure","concloure","condol","contramarc","contrapès","contreure",
            "convilatà","conviure","corbata","correra","coure","creure","cuixa","culata",
            "data","decaure","de","decebre","deixa","descloure","descriure","desfilar",
            "deslliurat","desviure","detreure","deure","distreure","egagropila","embeure",
            "emfasi","empes","entreploure","entreveure","errata","es","escandol","escarlata",
            "escata","escaure","espes","excloure","extasi","extreure","fe","febre","fetge",
            "fila","fluixa","fragata","frenopata","funebre","gaiata","gebre","glabre",
            "gramofon","heretgia","hipotesi","homofon","horabaixa","i","idol","incloure",
            "inscriure","jeure","licorera","lleure1","llibre","lliure","lúgubre","magnetofon",
            "malveure","manobre","marbre","membre","microfon","minotaure","moure","nombre",
            "o","olla","onda","onada","or","orca","orfebre","pagar","pagat","paper","paraula",
            "pebre","piga","plaure","plorar","ploure","pobre","postdata","prescriure","preveure",
            "promoure","prorrompre","proscriure","public","pulcre","pupitre","que","queixa","readmetre",
            "recloure","regata","reixa","remoure","retreure","rivetaire","romandre","sabata","sabre",
            "safata","salubre","serenata","sobreviure","sostreure","subscriure","tabac","tabal","tacar", 
            "tacat","tacit","tacte","tactica","tactil","talar","tall","talla","tallar","talos", 
            "talp","tambe","tampo","tanca","tanc","tapar","tapat","tapia","tarda","tasca", 
            "tassa","taula","tauro","taxa","tebia","tecla","telefon","timbre","vaca","vacu", 
            "vaga","vago","vall","vampir","vandal","vanova","vapor","vaquer","variar", 
            "variat","vector","vedell","vegada","vei","veinal","veinat","vel","velada", 
            "veler","vell","vena","vencer","vençut","venda","vendre","venial","venjar", 
            "venjat","venosa","vent","ventar","ventre","verb","verd","veri","vers","veto", 
            "veu","viure","vorera"
        };
        
         String[] prova = obtenirParaulesALAtzar(diccionari, 30);
         
         for(int i=0; i<prova.length; i++){
             System.out.print(prova[i]);
             System.out.print(", ");
        }
    }
    
    private String[] obtenirParaulesALAtzar(String[] diccionari, int maximLletres){
        //Definim variables
        String[] paraulesTemporal = new String[maximLletres];
        int quantitatParaules=0, lletresObtingudes=0;
        int midaDiccionari = diccionari.length;
        String paraulaCercada;
        
        do{
            //Demana posició inicial aleatòria
            int posRecerca = nanoRandom(midaDiccionari);            
            boolean paraulaValida=false;
            
            //repeteix mentre la paraula no sigui vàlida, els motius poden ser 
            //que sigui massa llarga o que ja estigui triada
            do{
                paraulaCercada = diccionari[posRecerca];
                
                //Mira si tindrem massa lletres
                if((lletresObtingudes+paraulaCercada.length())<=maximLletres){
                    boolean paraulaExistent = false;
                    
                    //Comprova si ja l'hem triat
                    for (int i = 0;((i<quantitatParaules+1)&&(!paraulaExistent));i++){
                        if (paraulaCercada==paraulesTemporal[i]){
                            paraulaExistent=true;
                        }
                    }

                    //Si no existeix l'afegeix
                    if (!paraulaExistent){
                        paraulaValida=true;
                        quantitatParaules++;
                        lletresObtingudes+=paraulaCercada.length();
                    } 
                }else { 
                    //Si existeix mira la següent posició o si estem al final del diccionari,
                    //comença del principi
                    if (posRecerca==midaDiccionari-1){
                        posRecerca=0;
                    } else {
                        posRecerca++;
                    }
                }
            }while(!paraulaValida);  
            
            //afegeix la paraula a 'array temporal
            paraulesTemporal[quantitatParaules-1]=paraulaCercada;
        }while (lletresObtingudes < maximLletres);
        
        //Dimensiona l'array de paraules trobades i encarrega el traspas de paraules del temporal al definitiu
        String[] paraulesLocalitzades = new String[quantitatParaules];
        paraulesLocalitzades=passaParaules(paraulesTemporal,quantitatParaules);
        
        return paraulesLocalitzades;
    }
    
    private int nanoRandom(int limitValue){
        long nano = System.nanoTime(); //valor de la hora del sistema en nanosegons
        int ret = (int) (nano%limitValue); //encavir el valor dins del rang demanat
        if(ret<0){    //converti valors negatius en positius
            ret*=-1;
        }
        return ret;
    }
    
    private String[] passaParaules(String[] paraulesTemporal,int quantitatParaules){
        String[] paraulesLocalitzades = new String[quantitatParaules];
        for (int i=0; i<quantitatParaules;i++){
            paraulesLocalitzades[i]=paraulesTemporal[i];
        }
        return paraulesLocalitzades;
    }
}
