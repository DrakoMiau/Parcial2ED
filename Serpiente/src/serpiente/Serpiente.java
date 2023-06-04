package serpiente;

import java.util.Scanner;

public class Serpiente {

    public static void main(String[] args) {
        //primero se hace el ingreso de nuestros datos en un String
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] calorias = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            calorias[i] = Integer.parseInt(input[i]);
        }
//        //Ingreso de nuestra cantidad minima de calorias
        int cMin = scan.nextInt();
        // arreglo de prueba
        //int[] miArreglo = {1, 2, 3, 7, 6, 5, 4, 9, 8, 7, 6};
        sobrevive(calorias, cMin);

    }

    static void sobrevive(int[] arr, int min) {
        int n = arr.length;
        int level = 0;
        boolean printReverse = false;
        boolean par = true;
        int suma = 0;

        while ((1 << level) - 1 < n) {
            int start = (1 << level) - 1;
            int end = Math.min((1 << (level + 1)) - 1, n);

            for (int i = start; i < end; i++) {
                if (printReverse) {
                    if (par) {
                        suma += arr[end - 1 - (i - start)];
                    } 
                } else {
                    if (par) {
                        suma += arr[i];
                    }
                }
                par = !par;
            }

            level++;
            printReverse = !printReverse;
            
            
        }
        if (suma >= min) {
            System.out.print("Sobrevive");
        } else {
            System.out.print("Muere");
        }
    }
}

