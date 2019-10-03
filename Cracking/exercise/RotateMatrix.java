/*
    Rotate a square matrix by 90 degrees
    1 2 3       3 6 9
    4 5 6   ->  2 5 8
    7 8 9       1 4 7
*/


public class RotateMatrix {
    public static int[][] rotate(int[][] mat) {
        int dim = mat.length;
        int[][] res = new int[dim][dim];
        for(int i=0; i<dim; i++) {
            for(int j=0; j<dim; j++) {
                res[i][j] = mat[j][dim-1-i];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return res;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(test);
    }
}