package estacionMetereologica;

public class EstacionMetereologica {

	int dias;
	int temperatura;
	int humedad;
	
	
	public EstacionMetereologica(int dias) {
		
		this.dias = dias;
		
	}

	public int getDias() {
		
		return dias;
	}

	public int getTemperatura() {
		for(int numero = 0; numero <= dias; numero++) {
			temperatura = (int) (Math.random()*4);
		}
		return temperatura;
	}

	public int getHumedad() {
		
		return humedad;
	}

	@Override
	public String toString() {
		return "EstacionMetereologica [dias=" + dias + ", temperatura=" + temperatura + ", humedad=" + humedad
				 + "]";
	}
	
	public int ordenarTemperatura() {
		
		return dias;
	}

	public void ordenarHumedad() {
		
		
	}
}
