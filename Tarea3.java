package tarea01;

public class Tarea3 {
	private static int number  = 8;
	public static void main(String[] args) {
		Thread exec = new Thread(new fact(5));
		exec.start();		
	}
}


	class fact extends Thread {
		 private double number;
			public fact(double number) {
				this.number = number;
			}
		public void run() {
			System.out.println(this.number + " El factorial es = " + factorial(this.number));
	}
	
		
	public double factorial(double n) {
		double resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

}
