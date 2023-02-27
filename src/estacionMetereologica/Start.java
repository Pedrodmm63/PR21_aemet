package estacionMetereologica;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EstacionMetereologica aemet = new EstacionMetereologica(30);
		System.out.println(aemet);
		
		aemet.ordenarTemperatura();
		aemet.ordenarHumedad();
	}

}
