/**
 * @author Tri Nguyen
 **/
public class Schnecke{
    public static void main(String[] args) {
        
        
        schnecke(Integer.parseInt(args[0]), "Tri Nguyen");
    }

    public static void schnecke(int n, String name){
        String[][] feld = new String[n][n];
        name= name.replace(" ", "_");
        int p= name.length();
        String[] nameArray = new String[p+1];
        for(int i=0; i<p; i++){
            nameArray[i]=name.substring(i,i+1);
        }
        nameArray[p]=" " ;
        p++;
        int z=0;
        for(int i=0; i<p;i++){
            System.out.print(nameArray[i]+"");
        }
        System.out.println();
        
        int e=0;
        int y= n-1;
        int x = 0;
        int dist=n;
        System.out.println(e+" "+dist);
        System.out.println(y+" "+x);
        for(int i=0; i<dist;i++){
            if(z%p==0)z=0;
                    feld[y][x]=nameArray[z];
                    z++;
            x++;
        }
        x--;
        e++;
        dist=n-1;
        while(dist >=1){
            if(e%4==0){
                for(int i=0; i<dist;i++){
                    x++;
                    if(z%p==0)z=0;
                    feld[y][x]=nameArray[z];
                    z++;
                }
            }else
            if(e%4==1){
                for(int i=0; i<dist;i++){
                    y--;
                    if(z%p==0)z=0;
                    feld[y][x]=nameArray[z];
                    z++;
                }
            }else
            if(e%4==2){
                for(int i=0; i<dist;i++){
                    x--;
                    if(z%p==0)z=0;
                    feld[y][x]=nameArray[z];
                    z++;
                }
            }else
            if(e%4==3){
                for(int i=0; i<dist;i++){
                    y++;
                    if(z%p==0)z=0;
                    feld[y][x]=nameArray[z];
                    z++;
                }
            }
            e++;
            if(dist==1){
                dist--;
            }
            if((e-1)%2==0){
                dist-=2;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(feld[i][j]==null){
                    feld[i][j]=" ";
                }
                System.out.print(feld[i][j]);
            }
            System.out.println();
        
        
        }
    }
}
