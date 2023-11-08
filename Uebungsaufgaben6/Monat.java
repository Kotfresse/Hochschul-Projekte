/**
 * @author Tri Nguyen
 **/

    enum Monat{
        JANUAR,FEBRUAR,MAERZ,APRIL,MAI,JUNI,JULI,AUGUST,SEPTEMBER,OKTOBER,NOVEMBER,DEZEMBER;
        private final int number;
        Monat(){
            this.number = ordinal()+1;
        }
        public static void main(String[] args) {
            /*
             * 
             String input = MyIO.promptAndRead("Bitte geben Sie einen Monat ein: ");
             Monat m = Monat.valueOf(input);
             int number = getNumber(m);
             MyIO.writeln(""+number+" "+m.ordinal()+"\n");
             
             */
            String[] character = {"JANUAR","FEBRUAR","MAERZ","APRIL","MAI","JUNI","JULI","AUGUST","SEPTEMBER","OKTOBER","NOVEMBER","DEZEMBER"};
            String[] liste = makeListe(character, true);
             for(int i = 0; i < liste.length; i++){
                 if(liste[i] != null)
                 MyIO.write(liste[i]+" ");
             }
             MyIO.writeln("");
            String[] list= makeListe(character, false);
            for(int i = 0; i < liste.length; i++){
                if(list[i] != null)
                MyIO.write(list[i]+" ");
            }
    
        }
        public int getNumber(){
            return number;
        }
        public static String[] makeListe(String[] character, boolean evodd){
            String[] liste = new String[12];
            if(evodd){
                for(int j=0; j < character.length; j++){
                    Monat m = Monat.valueOf(character[j]);
                    for(int i = 0; i < 12; i++){
                        if((m.getNumber()) % 2 != 0&&character[j].toLowerCase().contains("n")){
                            if(liste[i] == null){
                                liste[i] = character[j];    
                                break;
                            }
                        }
                    }
                }
            }
            else{
               for(int j=0; j < character.length; j++){
                    Monat m = Monat.valueOf(character[j]);
                    for(int i = 0; i < 12; i++){
    
                        if(m.getNumber() % 2 == 0&&character[j].toLowerCase().contains("i")){
                            if(liste[i] == null){
                                liste[i] = character[j];    
                                break;
                            }
                        }
                    }
                }
            }
            return liste;
        }
    };
