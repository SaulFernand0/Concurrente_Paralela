package tarea01;

public class Tarea4 {
	private static  String[] guepardos = {
			"guepardo1", "guepardo2", "guepardo3 ", "guepardo4"
			};
	
	public static void main(String[] args) {
		for(String guepardo : guepardos) {
			
			Thread exec = new Thread(new racer(guepardo));
			exec.start();
		}
		
	}
	
}

	
	class racer extends Thread{
		public String nombre;
		public racer(String nombre) {
			this.nombre = nombre;
	}
		int s = 0;
		public void run() {
		
			for(int i = 1 ; i<= 3; i++) {		
			
				System.out.println(this.nombre + " Está corriendo " + i + " Kilómetros " );		
			}	
			System.out.println(this.nombre + " Ha llegado a la meta" );
	}
		
}

