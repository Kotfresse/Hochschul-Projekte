/**
 * @author Tri Nguyen
 **/
public class Matrix {
    public double[][] matrix;
    private int m,n;
    
    public Matrix(int m, int n) {
        this.matrix = new double[m][n];
        this.m=m;
        this.n=n;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=0.0;
            }
        }
    }
    public String toString() {
        String s="";
        for(int i=0; i<m; i++){
            s+="\n";
            for(int j=0; j<n; j++){
             s+=matrix[i][j]+" ";
            }
            
        }
        return s;
    }
    public int getM() {
        return m;
    }
    public int getN() {
        return n;
    }
    public void setValue(int i, int j, double value) {
        this.matrix[i-1][j-1]=value;
    }
    public double getValue(int i, int j) {
        return matrix[i-1][j-1];

    }
    public Matrix add(Matrix other){
        if(m!=other.getM() || n!=other.getN()){
            System.out.println("Matrizen sind nicht gleich groß");
            return null;
        }
        Matrix result = new Matrix(m,n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                result.setValue(i+1,j+1,(matrix[i][j]+other.getValue(i+1,j+1)));
            }
        }
        return result;
    }
    public Matrix multiply(Matrix other){
        if(this.n!=other.getM()){
            System.out.println("Matrizen sind nicht multiplizierbar");
            return null;
        }else{
            Matrix result = new Matrix(this.m,other.getN());
            for(int i=0; i<this.m; i++){
                for(int j=0; j<other.getN(); j++){
                    double sum=0;
                    for(int k=0; k<this.n; k++){
                        sum+=this.getValue(i+1,k+1)*other.getValue(k+1,j+1);
                    }
                    result.setValue(i+1,j+1,sum);
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {
        /*
         * 
         double[][] a = {{1,2,3},{4,5,6},{7,8,9}};
         double[][] b = {{1,2,3},{4,5,6},{7,8,9}};
         Matrix matrix = new Matrix(3, 3);
         Matrix matrix2 = new Matrix(3, 3);
         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 matrix.setValue(i+1, j+1, a[i][j]);
                 matrix2.setValue(i+1, j+1, b[i][j]);
                }
            }
            matrix.toString();
            MyIO.writeln("");
            matrix2.toString();
            matrix=matrix.multiply(matrix2);
            MyIO.writeln("");
            matrix.toString();
            */
            Matrix matrix = new Matrix(5, 5);
            matrix.setValue(1, 2, 1.0);
            matrix.setValue(2, 3, 1.0);
            matrix.setValue(3, 4, 1.0);
            matrix.setValue(4, 5, 1.0);
            matrix.setValue(5, 1, -1.0);
            matrix.setValue(5, 2, 1.0);
            matrix.setValue(5, 3, -1.0);
            matrix.setValue(5, 5, 2.0);
            System.out.println(matrix);;
            MyIO.writeln("");
            Matrix result= new Matrix(5, 5);
            result= matrix.multiply(matrix);
            for(int m=0; m<18; m++){
                result= result.multiply(matrix);
                MyIO.writeln(result.toString());
                MyIO.writeln("");
            }
        }
    }
