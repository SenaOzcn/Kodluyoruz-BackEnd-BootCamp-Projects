import java.util.Scanner;
 
class TransposeMatrix {
   public static void main(String args[]) {
      int m, n, i, j;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int matrix[][] = new int[m][n];
 
      System.out.println("Enter the elements of matrix");
 
      for ( i = 0 ; i < m ; i++ )
         for ( j = 0 ; j < n ; j++ )
            matrix[i][j] = in.nextInt();
 
      int transpose[][] = new int[n][m];
 
      for ( i = 0 ; i < m ; i++ ) {
         for ( j = 0 ; j < n ; j++ )               
            transpose[j][i] = matrix[i][j];         
 
      }
 
      System.out.println("Transpose of entered matrix:-");
 
      for ( i = 0 ; i < n ; i++ ) {
         for ( j = 0 ; j < m ; j++ )
               System.out.print(transpose[i][j]+"\t");
 
            System.out.print("\n");
      }
   }
}
