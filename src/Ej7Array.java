import java.util.Scanner;
public class Ej7Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Introduce tu numero de identidad sin letra:");
        numeros = input.nextInt();
        System.out.println(numeros + "" + letras[numeros % 23]);
    }
}
