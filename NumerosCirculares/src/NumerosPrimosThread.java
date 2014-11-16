
public class NumerosPrimosThread extends Thread {

	public void run()
	{
	   
		for (int i=10;i<=1000000;i++) //Obtiene los n�meros del 10 al 1000000
		{
			if(FuncionesComunes.esPrimo(i)) //Verifica si el n�mero es primo
			{
				NumerosPrimos.agregar(i); //Lo agrega a la lista de n�meros primos
			}
	}
  }
}
