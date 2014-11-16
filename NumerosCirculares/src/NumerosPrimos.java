import java.util.List;
import java.util.ArrayList;


public abstract class NumerosPrimos {

	public static List<Integer> listaNumerosPrimos=new ArrayList<Integer>(); //Lista de n�meros primos
	
	//Agrega un n�mero a la lista de n�meros primos
	public synchronized static void agregar(int numeroPrimo)
	{
		listaNumerosPrimos.add(numeroPrimo);
	}
	
	//Elimina un n�mero de la lista de n�meros primos
	public synchronized static void eliminar (int posicion)
	{
		listaNumerosPrimos.remove(posicion);
	}
}
