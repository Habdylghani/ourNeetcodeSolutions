package matrixExp;

public class MatrixExp1 {
    static void multiply(int a[][], int b[][]) {
        int m[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    m[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                a[i][j] = m[i][j];
            }
        }
    }

    // power of matrix
    static int[][] power(int F[][], int n) {
        int M[][] = F;
        if (n == 3)
            return M;
     
        power(F, n / 2);
     
        multiply(F, F);
     
        if (n%2 != 0)
            multiply(F, M);

        /*
         * int M[][] = { { 1, 1, 1 }, { 1, 0, 0 },
                { 0, 1, 0 } };
        for (int i = 1; i <= n; i++) {
            multiply(F, M);
        }
         */
        
        return F;
    }

    static int findNthTerm(int F[][],int n) {
        //int F[][] = { { 1, 1, 1 }, { 1, 0, 0 },{ 0, 1, 0 } };
        power(F, n - 2);
        return F[0][0] + F[0][1]+F[0][2];
    }

    public static void main(String[] args) {
        int n = 5;
        int F[][] = { { 1, 1, 1 }, { 1, 0, 0 },{ 0, 1, 0 } };

        System.out.println("F(5) is "+ findNthTerm(F,n));
    }
}
