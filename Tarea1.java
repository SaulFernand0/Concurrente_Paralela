package tarea01;

public class Tarea1 {
	
	public static void main(String[] args) {
		Thread H1 = new Thread(new Hilo1());
		Thread H2 = new Thread(new Hilo2());
		H1.start();
		H2.start();
		
		}
	
}
	

	class Hilo1 extends Thread {
		 public void run() {
				for(int i = 1; i <= 10 ; i++) {
					System.out.println(i);
				}
		}
}
	
		 
	class Hilo2 extends Thread {
		public void run() {
			 for(int i = 10 ; i >= 1 ; i--) {
					System.out.println(i);
				} 
		 }
 }
