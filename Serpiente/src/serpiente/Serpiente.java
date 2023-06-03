
package serpiente;

import java.util.Scanner;

public class Serpiente {
    public static void main(String[] args) {
        //primero se hace el ingreso de nuestros datos en un String
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split(" ");
        int [] calorias = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            calorias[i] = Integer.parseInt(input[i]);
        }
        //Ingreso de nuestra cantidad minima de calorias
        int cMin = scan.nextInt();
        
    }
    
    static void sobrevive(int[] calorias, int cMin){

    }
}
