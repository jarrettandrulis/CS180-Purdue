import java.io.File;

/**
 * Created by jandruli on 11/29/16.
 */
public class Recursion {
    public static int determinant(int[][] matrix)
    {
        if(matrix.length == 1)
        {
            return matrix[0][0];
        }
        else
        {
            int d = 0;

            for(int i = 0; i < matrix.length; i++)
            {
                int[][] A;
                A = copyArrayMinusSection(matrix,i);
                    if(i%2==0)
                    d+=matrix[0][i]*determinant(A);
                else
                    d-=matrix[0][i]*determinant(A);

            }
            return d;
        }

    }
    public static int[][] copyArrayMinusSection(int[][] arr, int remove)
    {
        int r = arr.length;
        int c = arr[0].length;
        int arr2[][] = new int[r-1][c-1];
        int x = 0;
        for( int i = 1; i < r; i++)
        {
            int y = 0;
            for( int j = 0; j < c; j++)
            {
                if ( j == remove)
                    continue;
                arr2[x][y] = arr[i][j];
                y++;
            }
            x++;
        }
        return arr2;
    }
    public static int filecount(File f) {
        if(f.isFile())
            return 1;
        else if(f.isDirectory())
        {
            int numFiles=0;
            for(int i = 0; i < f.listFiles().length; i++)
            {
                numFiles+=filecount(f.listFiles()[i]);
            }
            return numFiles;
        }
        return 0;
    }
}
