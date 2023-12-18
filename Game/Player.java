public enum Player {
    White, Black;
    public static void main(String[] args) {
        System.out.println(Player.White);

    }
    
    public String toString(){
        if(this==Player.White){
            return "W";
        }else{
            return "B";
        }
    }

}
