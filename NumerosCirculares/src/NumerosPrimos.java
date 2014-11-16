import java.util.List;
import java.util.ArrayList;


public abstract class NumerosPrimos {

	public static List<Integer> listaNumerosPrimos=new ArrayList<Integer>(); //Lista de números primos
	
	//Agrega un número a la lista de números primos
	public synchronized static void agregar(int numeroPrimo)
	{
		listaNumerosPrimos.add(numeroPrimo);
	}
	
	//Elimina un número de la lista de números primos
	public synchronized static void eliminar (int posicion)
	{
		listaNumerosPrimos.remove(posicion);
	}
}
