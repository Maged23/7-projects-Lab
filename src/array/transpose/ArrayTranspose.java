package array.transpose;
import java.util.Scanner;

public class ArrayTranspose {

    static int[][] trans;
    public static void main(String[] args) {
        
        int x=0,row, col,i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows");
                row = input.nextInt(); 
                System.out.println("Enter the number columns");
                col = input.nextInt();
                int mat[][] = new int[row][col];               
                System.out.println("Enter the elements of matrix "); 
                for ( i= 0 ; i < row ; i++ )
                {  
                for ( j= 0 ; j < col ;j++ )
                mat[i][j] = input.nextInt();                 
                System.out.println();
                }
                transpose(mat);
                display(trans);
        
              
    }
    
    public static void transpose(int [][]matrix)
    {
    int row=matrix.length;
    int col=matrix[0].length;
    trans = new int[row][col];
    for(int i = 0; i < row; i++)
    {
            for (int j = 0; j < col; j++) 
            {
                trans[j][i] = matrix[i][j];
            }    
    }
    }
     public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int i=0;i<matrix.length;i++)
        {
        for(int j=0;j<matrix[0].length;j++)
        {
        System.out.print(matrix[i][j] + "    ");
        }
         System.out.println();
        }

    }
    
    
    
}

