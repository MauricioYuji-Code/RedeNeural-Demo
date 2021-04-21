package Utils;

public class Matriz {

    private int rows;
    private int cols;
    private float[][] data;


    public Matriz(int rows, int cols) {

        this.rows = rows;
        this.cols = cols;
        this.data = new float[rows][cols];

        mapMatrizAleatorio(data);

    }

    public Matriz(float[][] matriz) {
        this.data = matriz;
    }

    //Popula matriz aleatorio
    public void mapMatrizAleatorio(float[][] matriz) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matriz[i][j] = (float) (Math.floor(Math.random() * 10));
            }
        }
        data = matriz;
        printMatriz(matriz, rows, cols);
    }

    public void mapMatrizRandomica() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = (float) (Math.floor(Math.random() * 10));
            }
        }
//        printMatriz(data, rows, cols);
    }

    public void mapMatrizEstatica(float[][] matriz) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
//                matriz[i][j] =
            }
        }
        printMatriz(matriz, rows, cols);
    }

    //Soma Matriz
    public static float[][] sumMatriz(Matriz matrizA, Matriz matrizB) {

        float[][] matrizResult = new float[matrizA.data.length][matrizB.data[0].length];
//        System.out.println(matrizA.data.length + "tamanho da matriz");
//        System.out.println(matrizB.data[0].length + "tamanho da matriz");

        for (int i = 0; i < matrizA.data.length; i++) {
            for (int j = 0; j < matrizA.data[0].length; j++) {
                matrizResult[i][j] = matrizA.data[i][j] + matrizB.data[i][j];
//                System.out.println(matrizResult[i][j]);
            }
        }
        System.out.print("Resultado matriz soma: ");
        printMatriz(matrizResult, matrizA.data.length, matrizB.data[0].length);
        return matrizResult;
    }

    // Multiplica matriz
    public static float[][] multiplyMatriz(Matriz matrizA, Matriz matrizB) {
        float[][] matrizResult = new float[matrizA.data.length][matrizB.data[0].length];
        for (int rows = 0; rows < matrizA.data.length; rows++) {
            for (int cols = 0; cols < matrizB.data[0].length; cols++) {
                float acum = 0;
                for (int i = 0; i < matrizB.data.length; i++) {
                    acum = acum + matrizA.data[rows][i] * matrizB.data[i][cols];
                    matrizResult[rows][cols] = acum;
                }

            }
        }
        System.out.print("Resultado matriz multiplicação: ");
        printMatriz(matrizResult, matrizA.data.length, matrizB.data[0].length);
        return matrizResult;
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

    public static void printMatriz2(float[][] matriz) {
        System.out.println(" ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    //Getters e Setters
    public float[][] getData() {
        return data;
    }

}
