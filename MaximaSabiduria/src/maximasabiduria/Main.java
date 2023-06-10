package maximasabiduria;

//punto 2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        sumaMayor(arr);

    }

    static void sumaMayor(int[] arr) {
        int n = arr.length;
        int level = 0;
        int suma = 0;
        int sumaMayor = 0;

        while ((1 << level) - 1 < n) {
            int start = (1 << level) - 1;
            int end = Math.min((1 << (level + 1)) - 1, n);

            for (int i = start; i < end; i++) {
                suma += arr[i];
            }
            
            if (suma > sumaMayor) {
                sumaMayor = suma;
            }
            
            suma = 0;
            
            level++;
        }
        
        System.out.print(sumaMayor);
    }

}
