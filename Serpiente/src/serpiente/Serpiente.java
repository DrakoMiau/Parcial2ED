package serpiente;

//punto 1

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
        sobrevive(calorias, cMin);

    }

    static void sobrevive(int[] arr, int min) {
        int n = arr.length;
        int level = 0;
        boolean reverse = false;
        boolean par = true;
        int suma = 0;
        //Se hace un corrimiento del bit 1 a la izquierda dependiendo del nivel en el que se encuentre
        //Para poder referirse a las posiciones del arreglo en ese nivel
        while ((1 << level) - 1 < n) {
            int start = (1 << level) - 1;
            int end = Math.min((1 << (level + 1)) - 1, n);

            for (int i = start; i < end; i++) {
                if (reverse) {
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
            reverse = !reverse;
            
            
        }
        if (suma >= min) {
            System.out.print("Sobrevive");
        } else {
            System.out.print("Muere");
        }
    }
}

