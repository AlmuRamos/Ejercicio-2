import java.util.Scanner;

public class EjercicioPrueba
{

	public static void main(String[] args)
	{
		/*Escribe un programa java que declare una variable C de tipo entero y as�gnale un
valor. A continuaci�n muestra un mensaje indicando si el valor de C es positivo o
negativo, si es par o impar, si es m�ltiplo de 5, si es m�ltiplo de 10 y si es mayor o
menor que 100. Consideraremos el 0 como positivo. Utiliza el operador condicional
( ? : ) dentro del println para resolverlo.
Si por ejemplo C = 55 la salida ser�
55 es positivo
55 es impar
55 es m�ltiplo de 5
55 no es m�ltiplo de 10
55 es menor que 100*/
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Intruduzca un n�mero: ");
		int C = lector.nextInt();
		
		System.out.println("El n�mero es: " + 
		(C>=0 ? "positivo" : "negativo")+", "+ 
		(C%2==0 ? "par" : "impar")+ "," + 
		(C%5==0 ? "es m�ltipo de 5": "no es m�ltiplo de 5") +"," +
		(C%10==0 ? "es m�ltiplo de 10": "no es m�ltiplo de 10") +"," +
		(C >=100 ? "es mayor que 100" : "es menor que 100"));

		lector.close();
		
	}

}
