/**
 * CS180 - Lab 07
 *
 * Matrix class , used to evaluate whether or not Matricies fit certain criteria such as symmetry
 *
 * @author Jarrett Andrulis, jandruli@purdue.edu, section B09
 *
 * @version 10/04/16
 */


public class Matrix {
    /**
     * isSymmetric method, checks to see if a matrix is symmetric
     */
    public Matrix()
    {

    }
    public boolean isSymmetric(int[][] matrix)
    {
        if(!isSquare(matrix)) return false;
        for(int i = 0; i <matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length;j++)
            {
                if(matrix[i][j]!=matrix[j][i])
                    return false;
            }

        }
        return true;
    }
    /**
     * isDiagonal method, checks to see if a matrix is diagonal, only the numbers along the diagonal can not equal 0
     */
    public boolean isDiagonal(int[][] matrix)
    {
        if(!isSquare(matrix)) return false;
        for(int i =0; i< matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length;j++)
            {
                if(j!=i && matrix[i][j] != 0) return false;
            }
        }
        return true;
    }
    /**
     * isIdentity method, checks to see if a matrix is an identity matrix, diagonal can only equal 1 and rest 0
     */
    public boolean isIdentity(int[][] matrix)
    {
        if(!isSquare(matrix)) return false;
        for(int i =0; i< matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length;j++)
            {
                if(j!=i && matrix[i][j] != 0) return false;
                if(j==i && matrix[i][j] != 1) return false;
            }
        }
        return true;
    }
    /**
     * isUpperTriangular method, checks to see if a matrix is equal to 0 below the diagonal
     */
    public boolean isUpperTriangular(int[][] matrix)
    {
        if(!isSquare(matrix)) return false;
        for(int i =0; i< matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length;j++)
            {
                if(i > j && matrix[i][j]!=0) return false;
            }
        }
        return true;
    }
    /**
     * isTridiagonal method, can only have values other than 0 on three middle diagonals
     */
    public boolean isTridiagonal(int[][] matrix)
    {
        if(!isSquare(matrix)) return false;
        for(int i =0; i< matrix.length; i++)
        {
            for(int j=0; j < matrix[i].length;j++)
            {
                if(Math.abs(i-j) > 1 && matrix[i][j]!=0) return false;
                if(Math.abs(i-j) <= 1 && matrix[i][j]==0) return false;
            }
        }
        return true;
    }
    /**
     * isSquare method, checks if matrix is square
     */
    private static boolean isSquare(int[][] matrix)
    {
        for(int i = 0; i <matrix.length; i++)
        {
            if(matrix.length!=matrix[i].length) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[][] mat1 = {{1,2,3},
                        {0,3,1},
                        {0,0,1}};
        Matrix matrixHelper = new Matrix();
        System.out.println("Symmetric: " + matrixHelper.isSymmetric(mat1));
        System.out.println("Diagonal: " + matrixHelper.isDiagonal(mat1));
        System.out.println("Identity: " + matrixHelper.isIdentity(mat1));
        System.out.println("Upper Triangular: " + matrixHelper.isUpperTriangular(mat1));
        System.out.println("Tridiagonal: " + matrixHelper.isTridiagonal(mat1));
    }
}