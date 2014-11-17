import static java.lang.Math.*;  
public class FuncionesComunes {

    //Verifica si un n�mero es primo
	public static boolean esPrimo(int numero)
	{
		int j=0, div=0,raiz=0;
		String num=Integer.toString(numero);
		
		if (numero!=0 & numero!=1) //Verifica que el n�mero sea distinto de 0 y 1 que no son considerados n�meros primos
		{
			if (num.length()>1) //Verifica que el n�mero tenga m�s de dos d�gitos sino no tiene n�meros circulares
			{
				div=0; // variable que determina la cantidad de divisores que tiene el n�mero
				raiz=(int)sqrt(numero); //Obtiene la ra�z del n�mero
				
				for (j=1;j<=raiz;j++) 
				{ 
				   if (numero%j==0) // Si el resto es 0 suma 1 a la variable div
				   div++;
				}
				if (div<=1)
				{
					return true; //Si la cant de divisores es menor o igual a 1 es un n�mero primo
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
