public class Patron
{ 
private String cadena;
private int numero;

public Patron ( int x)
    { 
    numero = x;
    } 

     public void Imprime()
    {
    System.out.println("\nSE IMPRIME A CONTINUACION UN TABLERO DE DAMAS: \n");



int contadorHorizontal = 1;
int contadorVertical = 1;
int TAMANO = 8;

while ( contadorVertical <= TAMANO )
{ 
    contadorHorizontal = 1;
    while (contadorHorizontal <= TAMANO)
    { 
    if( 0 == contadorVertical % 2 )
    System.out.print("* ");
    else
    System.out.print(" *");

    contadorHorizontal++;
    } 

    System.out.print("\n");
    contadorVertical++;
        } 
    }
} 