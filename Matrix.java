import java.util.*;
import java.io.*;

class Matrix
{

	
	
	public static void main(String [] args)throws Exception
	{
	BufferedReader bf=new BufferedReader(new InputStreamReader( System .in));
	System.out.println("Addition");
	System.out.println("Substraction");
	System.out.println("Multiplication");
	System.out.println("Inverse");
	System.out.println("Transpose");
	
	System.out.println("");
	System.out.println("Choose your Opertion = ");
	int ch=Integer.parseInt(bf.readLine());
	
	switch(ch)
	{
		case 1:
			add();
			break;
			
		case 2:
			sub();
			break;
			
		case 3:
			mul();
			break;
			
		case 4:
			inv();
			break;
			
		case 5:
			tran();
			break;
			
		default	:
			System.out.println("exit");
			break;
	}
	
	}
	
	//====================================ADDITION=========================================
	
	public static void add()
	{
		Scanner s=new Scanner(System .in);
		System.out.println("Enter number of rows ins matrix =");
		int rows = s.nextInt();
		
		System.out.println("Enter number of Columns ins matrix =");
		int columns = s.nextInt();
		
		int[][] matrix1= new int[rows][columns];
		int[][] matrix2= new int[rows][columns];
		
		System.out.println("Enter the element of first matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the element of second matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				matrix2[i][j]=s.nextInt();
			}
		}
		  int[][] result = new int[rows][columns];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                  }
           }
		
		//Display
		
		System.out.println("First matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.println(matrix1[i][j] + " ");
			}
		}
		System.out.println("Second matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.println(matrix2[i][j] + " ");
			}
		}
		
		//result
		
		System.out.println("Addition of matrix=");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.print(result[i][j] + " ");
			}
		}
	}
	
	//===============================SUBSTRACTION========================================
	
	public static void sub()
	{
		Scanner s=new Scanner(System .in);
		System.out.println("Enter number of rows ins matrix =");
		int rows = s.nextInt();
		
		System.out.println("Enter number of Columns ins matrix =");
		int columns = s.nextInt();
		
		int[][] matrix1= new int[rows][columns];
		int[][] matrix2= new int[rows][columns];
		
		System.out.println("Enter the element of first matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the element of second matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				matrix2[i][j]=s.nextInt();
			}
		}
		  int[][] result = new int[rows][columns];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        result[i][j] = matrix1[i][j] - matrix2[i][j];
                  }
           }
		
		//Display
		
		System.out.println("First matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
		}
		System.out.println("Second matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
		}
		
		//result
		
		System.out.println("Substraction of matrix=");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.print(result[i][j] + " ");
			}
		}
	}
	
	
	//============================MULTIPLICATION=========================================
	
	public static void mul()
	{
		Scanner s=new Scanner(System .in);
		System.out.println("Enter number of rows in  first matrix =");
		int rowsMatrix1 = s.nextInt();
		
		System.out.println("Enter number of Columns in first matrix  and rows in matrix2=");
		int columnsMatrix1RowsMatrix2 = s.nextInt();
		
		System.out.println("Enter number of Columns in second matrix =");
		int columnsMatrix2 = s.nextInt();
		
		int[][] matrix1= new int[rowsMatrix1][columnsMatrix1RowsMatrix2];
		int[][] matrix2= new int[columnsMatrix1RowsMatrix2][columnsMatrix2];
		
		System.out.println("Enter the element of first matrix =");
		for(int i=0; i < matrix1.length ; i++)
		{
			for(int j=0 ; j < matrix1[0].length ; j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the element of second matrix =");
		for(int i=0; i < matrix1.length ; i++)
		{
			for(int j=0 ; j < matrix2[0].length ; j++)
			{
				matrix2[i][j]=s.nextInt();
			}
		}
		 int[][] productMatrix  = new int[rowsMatrix1][columnsMatrix2];
		for (int i = 0; i < rowsMatrix1; i++)
		{
			for (int j = 0; j < columnsMatrix2; j++) 
			{
				for (int k = 0; k < columnsMatrix1RowsMatrix2; k++)
				{ //columns in matrix1= rows in matrix2
					productMatrix[i][j]= productMatrix[i][j] + matrix1[i][k] *matrix2[k][j];
				}
           }
   }
		
		//Display
		
		System.out.println("First matrix =");
		for(int i=0; i < rowsMatrix1 ; i++)
		{
			for(int j=0 ; j < columnsMatrix1RowsMatrix2 ; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
		}
		System.out.println("Second matrix =");
		for(int i=0; i < columnsMatrix1RowsMatrix2 ; i++)
		{
			for(int j=0 ; j < columnsMatrix2 ; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
		}
		
		//result
		
		System.out.println("Substraction of matrix=");
		for(int i=0; i < rowsMatrix1 ; i++)
		{
			for(int j=0 ; j < columnsMatrix2 ; j++)
			{
				System.out.print(productMatrix[i][j] + " ");
			}
		}
	}
	
	//===================================TRANSPOSE===========================================================
	public static void tran()
	{
		Scanner s=new Scanner(System .in);
		System.out.println("Enter number of rows ins matrix =");
		int rows = s.nextInt();
		
		System.out.println("Enter number of Columns ins matrix =");
		int columns = s.nextInt();
		
		int[][] matrix1= new int[rows][columns];
		
		
		System.out.println("Enter the element of first matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				matrix1[i][j]=s.nextInt();
			}
		}
		
		//calcultion
		  int transpose[][] = new int[columns][rows];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++)
                        transpose[j][i] = matrix1[i][j];
           }
		
		//Display
		
		System.out.println("First matrix =");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
		}
		//result
		
		System.out.println("Transpose of matrix=");
		for(int i=0; i < rows ; i++)
		{
			for(int j=0 ; j < columns ; j++)
			{
				System.out.print(transpose[i][j] + " ");
			}
		}
	}
	
	//============================INVERSE===============================================
	
	public static void inv()
	{
		 Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of square matrix: ");
        int n = input.nextInt();
        double a[][]= new double[n][n];
        System.out.println("Enter the elements of matrix: ");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = input.nextDouble();
 
        double d[][] = invert(a);
 
        System.out.println("The inverse is: ");
        for (int i=0; i<n; ++i) 
        {
            for (int j=0; j<n; ++j)
            {
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
        }
        input.close();
	}
	public static double[][] invert(double a[][]) 
    {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i) 
            b[i][i] = 1;
 
 // Transform the matrix into an upper triangle
        gaussian(a, index);
 
 // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k]
                    	    -= a[index[j]][i]*b[index[i]][k];
 
 // Perform backward substitutions
        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k) 
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }
	
	public static void gaussian(double a[][], int index[]) 
    {
        int n = index.length;
        double c[] = new double[n];
 
 // Initialize the index
        for (int i=0; i<n; ++i) 
            index[i] = i;
 
 // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }
 
 // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }
 
   // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i) 	
            {
                double pj = a[index[i]][j]/a[index[j]][j];
 
 // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;
 
 // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }
}
