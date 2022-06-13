import java.util.Scanner;

public class Palindromo {

    public void analizar() {
       
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un entero de 5 digitos: ");
        int entero = entrada.nextInt();

        while ((entero < 9999) || (entero > 100000)) {
            System.out.println("\nNo es un entero de 5 digitos");
            System.out.print("\nDeme el entero de 5 digitos: ");
            entero = entrada.nextInt();
        }

        if ((entero / 10000) == (entero % 10)) {

            entero = entero % 10000;
            entero = entero / 10;

            if ((entero / 100) == (entero % 10)) {
                System.out.printf("\n************* El entero %d es un palíndromo *************",entero);
            } else {
                System.out.printf("\n************* El entero %d no es un palíndromo *************",entero);
            }
        } else {
            System.out.printf("\n************* El entero %d es un palíndromo *************",entero);
        }
    }
}

