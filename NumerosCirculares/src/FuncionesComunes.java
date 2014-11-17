import static java.lang.Math.*;  
public class FuncionesComunes {

    //Verifica si un número es primo
	public static boolean esPrimo(int numero)
	{
		int j=0, div=0,raiz=0;
		String num=Integer.toString(numero);
		
		if (numero!=0 & numero!=1) //Verifica que el número sea distinto de 0 y 1 que no son considerados números primos
		{
			if (num.length()>1) //Verifica que el número tenga más de dos dígitos sino no tiene números circulares
			{
				div=0; // variable que determina la cantidad de divisores que tiene el número
				raiz=(int)sqrt(numero); //Obtiene la raíz del número
				
				for (j=1;j<=raiz;j++) 
				{ 
				   if (numero%j==0) // Si el resto es 0 suma 1 a la variable div
				   div++;
				}
				if (div<=1)
				{
					return true; //Si la cant de divisores es menor o igual a 1 es un número primo
				}
				else
				{
					return false;
				}
			}
			else {return false;}
		}
		else {return false;}
			
	}
}
