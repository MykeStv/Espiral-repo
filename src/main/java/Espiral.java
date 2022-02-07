import java.util.Arrays;
import java.util.Scanner;

public class Espiral {
    // Declara una matriz entera
    private int[][] matriz;

    //CONSTRUCTOR: Permite ingresar los valores iniciales
    public Espiral(){
        // Scanner permite al usuario ingresar datos
        Scanner sc = new Scanner(System.in);

        // Pide el tamaño de la matriz en valores enteros
        System.out.println("Tamaño de la matriz");
        System.out.println("Filas: ");
        int row = sc.nextInt();
        System.out.println("Columnas: ");
        int column = sc.nextInt();

        // Inicializa la matriz segun el tamaño decidido
        matriz = new int[row][column];
    }

    //Metodo que muestra la matriz
    public void showMatriz() {
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j< matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metodo llenar matriz de izq a derecha
    public void llenarIzquieraDerecha() {
        //valor que irá llenando la matriz
        int valorAux = 1;


        for (int i = 0; i < matriz.length; i++) {

            //Si la matriz tiene un valor asignado.. sigue a la siguiente fila
            if (matriz[i][0] != 0) {
                continue;
            }

            for (int j = 0; j< matriz[i].length; j++) {
                matriz[i][j] = valorAux;
                valorAux++;
            }

        }
    }


    public static void main(String[] args) {

        Espiral matrizEspiral = new Espiral();
        matrizEspiral.showMatriz();

        matrizEspiral.llenarIzquieraDerecha();
        matrizEspiral.showMatriz();



    }

}
