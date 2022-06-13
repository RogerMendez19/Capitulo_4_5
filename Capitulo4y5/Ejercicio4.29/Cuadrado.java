import java.util.Scanner;
public class Cuadrado
{
    private String mensaje;
    Scanner entrada = new Scanner(System.in);

    public Cuadrado(String cadena)
    {
        mensaje = cadena;
    }

    public void Recibe()
    {
        int lado;
        System.out.print("Introduzca un numero entre 1 y 20: ");
        lado = entrada.nextInt();

        Imprime(lado);
    }
    public void Imprime(int x)
    {
        int contHorizontal=1;
        int contVertical=2;

        while (contHorizontal++ <=x)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        contHorizontal = 1;

        while(contVertical++ < x)
        {
            while (x >= contHorizontal)
             {
            if((1 == contHorizontal) || (x== contHorizontal))
            System.out.print("*");
            else
            System.out.print(" ");

            contHorizontal++;
            }
        System.out.print("\n");
        contHorizontal=1;
        }
        contHorizontal=1;
        while(contHorizontal++ <= x)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}