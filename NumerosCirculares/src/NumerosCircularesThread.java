import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;

public class NumerosCircularesThread extends Thread{
	
	TextArea pantalla;
	
	//Constructor
	public NumerosCircularesThread(TextArea n)
	{
		pantalla=n;
	}
	
	public void run()
	{
		
		List<Integer> listaNumerosCirculares = new ArrayList<Integer>(); //Lista de números circulares
		while (this.isAlive()) // mientras el hilo este vivo
		{
		try{
			if (NumerosPrimos.listaNumerosPrimos.size()>0) //Verifica si la lista de números primos tiene al menos un número
			{
				
			listaNumerosCirculares = new ArrayList<Integer>(); //Crea la lista de números circulares
			String numeroEvaluar = NumerosPrimos.listaNumerosPrimos.get(0).toString(); //Asigna a la variable el primer número de la lista
			String numeroRotar=numeroEvaluar;
			
			//Se obtienen todos los números circulares del número primo
	        for(int i=0;i<=numeroRotar.length()-1;i++)
	        {
                numeroRotar=numeroRotar.charAt(numeroRotar.length()-1)+ numeroRotar.substring(0,numeroRotar.length()-1); //obtiene el último dígito del número + la subcadena del número menos el último dígito, formando el número circular           
	            listaNumerosCirculares.add(Integer.parseInt(numeroRotar.toString())); //Lo agrega a la lista de números circulares
	        }
			
			int primos = 1;
			
			//Verifica si los números circulares son primos
			for(int i=0; i<listaNumerosCirculares.size(); i++){
				if(!FuncionesComunes.esPrimo(listaNumerosCirculares.get(i))){
				     primos = 0; //Si alguno no es primo corta el proceso
				    break;
				   }
		    }
				
            //Si todos son primos arma una cadena con los números circulares separados por ","
			if(primos == 1){
				String primosCirculares = "";
				
				for(int a = 0;a < listaNumerosCirculares.size();a++){
					primosCirculares += listaNumerosCirculares.get(a);
					if(!(a == listaNumerosCirculares.size() - 1)){
						primosCirculares += ", ";
					}
				}
				
		    // Muestra el número primo y sus circulares primos
			pantalla.setText(pantalla.getText() + "\n "+"Número Primo: "  + numeroEvaluar + " - Circulares Primos:"  + primosCirculares);
			}
		    //Elimina el número seleccionado de la lista de números primos
			NumerosPrimos.eliminar(0);
			}
          		
		}
		catch(Exception e){}
	}
}

}
