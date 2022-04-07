package Pr01;

public class ClaseInteger1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creación de un objeto Integer usando el segundo constructor
		int num1 = 125;

		//Creación de un objeto Integer usando el primer constructor
		int num2 = 20; 	

		// Obtención del entero que almacena cada objeto Integer.
		//Si no se hace esto las lineas siguientes causarían error
		// de compilación

		int n1 = num1;
		int n2 = num2;
		System.out.println("suma de "+n1+" y "+n2+" vale: "+(n1+n2));
		if(n1+n2>130)
			n1++;
		else
			n1--;
		System.out.println(n1);
	}

}
