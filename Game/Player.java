public enum Player {
    White, Black;
    double score;
    public static void main(String[] args) {
        System.out.println(Player.White);

    }
    public double score(){
        return score;
    }
    public void addScore(double score){
        this.score+=score;
    }
    public String toString(){
        if(this==Player.White){
            return "W";
        }else{
            return "B";
        }
    }

}
