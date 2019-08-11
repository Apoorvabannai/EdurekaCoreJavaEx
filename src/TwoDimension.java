public class TwoDimension {

  public static void main(String[] args) {
    int f[] [] = {{2,3,4,}, {9,8,7},{6,7,8}};// declaring two dimensional array first element
    int g[] [] = {{2,9,0},{1,2,3},{6,1,0}}; // declaring second element
    System.out.println(" The length of matrix is "+ f.length);
    System.out.println("The First Matrix is :");
    for(int i =0; i<3; i++){
      for( int j=0; j<f[i].length;j++) {
        System.out.print(f[i] [j]+" ");
      }
      System.out.println(" ");
    }

    System.out.println("The Second  Matrix is :");
    for(int i =0; i<3; i++){
      for( int j=0; j<g[i].length;j++) {
        System.out.print(g[i] [j]+" ");
      }
      System.out.println( " ");
    }

    //addition of two matrix
    System.out.println(" The sum of two matrix is ");
    int c[][] = new int [3][3];
    for( int i=0; i<3;i++){
      for(int j=0; j<c[i].length;j++){
        c[i][j] = f[i][j]+g[i][j];
        System.out.print( c[i][j]+" ");
      }
      System.out.println(" ");
    }

  }
}