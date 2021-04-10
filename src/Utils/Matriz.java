package Utils;

public class Matriz {

    private int rows;
    private int cols;
    private float[][] data;


    public Matriz(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;
        this.data = new float[rows][cols];

        mapMatriz(data);

    }

    //Popula matriz
    public void mapMatriz(float[][] matriz) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = (float) (Math.floor(Math.random() * 10));
            }
        }
        printMatriz(matriz, rows, cols);
    }

    //Soma Matriz
    public static void sumMatriz(Matriz matrizA, Matriz matrizB) {

        float[][] matrizResult = new float[matrizA.rows][matrizB.cols];
//        System.out.println(matrizA.data.length + "tamanho da matriz");
//        System.out.println(matrizB.data[0].length + "tamanho da matriz");
        for (int i = 0; i < matrizA.data.length; i++) {
            for (int j = 0; j < matrizA.data.length; j++) {
                matrizResult[i][j] = matrizA.data[i][j] + matrizB.data[i][j];
            }
        }
        printMatriz(matrizResult, matrizA.rows, matrizB.cols);
    }

    // Multiplica matriz Todo
    public static void multiplyMatriz(Matriz matrizA, Matriz matrizB) {
        float[][] matrizResult = new float[matrizA.data.length][matrizB.data[0].length];

        for (int rows = 0; rows < matrizA.data.length; rows++) {
            for (int cols = 0; cols < matrizB.data[0].length; cols++) {
                float acum = 0;
                for (int i = 0 ; i < matrizB.data.length ; i++){
                        acum = acum + matrizA.data[rows][i] * matrizB.data[i][cols];
                        matrizResult[rows][cols] = acum;
                }

            }
        }
        printMatriz(matrizResult, matrizA.data.length, matrizB.data[0].length);
    }


    //Imprime Matriz
    public static void printMatriz(float[][] matriz, int rows, int cols) {
        System.out.println(" ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


}
