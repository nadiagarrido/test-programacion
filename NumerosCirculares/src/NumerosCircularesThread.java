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
		
		List<Integer> listaNumerosCirculares = new ArrayList<Integer>(); //Lista de n�meros circulares
		while (this.isAlive()) // mientras el hilo este vivo
		{
		try{
			if (NumerosPrimos.listaNumerosPrimos.size()>0) //Verifica si la lista de n�meros primos tiene al menos un n�mero
			{
				
			listaNumerosCirculares = new ArrayList<Integer>(); //Crea la lista de n�meros circulares
			String numeroEvaluar = NumerosPrimos.listaNumerosPrimos.get(0).toString(); //Asigna a la variable el primer n�mero de la lista
			String numeroRotar=numeroEvaluar;
			
			//Se obtienen todos los n�meros circulares del n�mero primo
	        for(int i=0;i<=numeroRotar.length()-1;i++)
	        {
                numeroRotar=numeroRotar.charAt(numeroRotar.length()-1)+ numeroRotar.substring(0,numeroRotar.length()-1); //obtiene el �ltimo d�gito del n�mero + la subcadena del n�mero menos el �ltimo d�gito, formando el n�mero circular           
	            listaNumerosCirculares.add(Integer.parseInt(numeroRotar.toString())); //Lo agrega a la lista de n�meros circulares
	        }
			
			int primos = 1;
			
			//Verifica si los n�meros circulares son primos
			for(int i=0; i<listaNumerosCirculares.size(); i++){
				if(!FuncionesComunes.esPrimo(listaNumerosCirculares.get(i))){
				     primos = 0; //Si alguno no es primo corta el proceso
				    break;
				   }
		    }
				
            //Si todos son primos arma una cadena con los n�meros circulares separados por ","
			if(primos == 1){
				String primosCirculares = "";
				
				for(int a = 0;a < listaNumerosCirculares.size();a++){
					primosCirculares += listaNumerosCirculares.get(a);
					if(!(a == listaNumerosCirculares.size() - 1)){
						primosCirculares += ", ";
					}
				}
				
		    // Muestra el n�mero primo y sus circulares primos
			pantalla.setText(pantalla.getText() + "\n "+"N�mero Primo: "  + numeroEvaluar + " - Circulares Primos:"  + primosCirculares);
			}
		    //Elimina el n�mero seleccionado de la lista de n�meros primos
			NumerosPrimos.eliminar(0);
			}
          		
		}
		catch(Exception e){}
	}
}

}
