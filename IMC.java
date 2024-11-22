import java.util.Scanner;

public class IMC {
static float kilos; 
static float altura;
static float imc;
	public static void main(String[] args) {
	Scanner entradaTeclado = new Scanner(System.in); //Se hace una instancia del escaner
		
		System.out.println("Introduzca un peso entre 30 kilos y 300 kilos");
			kilos = entradaTeclado.nextFloat(); //El usuario escribe los kilos
		System.out.println("Introduzca una altura entre 1,30 metros y 2,00 metros");
			altura = entradaTeclado.nextFloat(); //El usuario escribe los la altura
		/*El bucle do while se ejecuta mientras el usuario ponga los kilos menor que 30 o mayor que 300 ya que sería erroneo y la altura menor de 1,30 metros o 
		mayor de 2,00 metros ya que tambien seria erroneo. Si se pone correcto o los kilos o la altura, este valor ya no se vuelve a pedir, se pediria solo 
		el que fuese erroneo las veces necesarias hasta que sea correcto*/
		do {
		if (kilos > 300f || kilos < 30f) {
		System.out.println("Introduzca un peso correcto, entre 30 kilos y 300 kilos");
		kilos = entradaTeclado.nextFloat();
		}
		if (altura > 2.00f || altura < 1.30f) {
		System.out.println("Introduzca una altura correcta, entre 1,30 metros y 2,00 metros");
		altura = entradaTeclado.nextFloat();
		}	
		}while ((kilos > 300f || kilos < 30f) || (altura < 1.30f || altura > 2.00f));
	System.out.println("Peso = " + kilos +" kilos " + "y" +" Altura = " + altura + " metros"); //Se imprime el peso y la altura
	
	
	imc = kilos/(altura*altura); //La formula para sacar el imc
	System.out.println("Su IMC es de"+ " " + imc); //Se imprime el IMC
	entradaTeclado.close(); //Se cierra la instancia del escaner
	
	
	//Dependiendo del valor obtenido en el imc, se ejecuta una de las condiciones y se imprime el resultado
	 
	if (imc < 18.5f) {
		System.out.println("Tienes bajo peso");
	}else if (imc >= 18.5f && imc <= 24.9f) {
		System.out.println("Tienes un peso normal");
	}else if (imc >= 25.0f && imc <= 29.9f) {
		System.out.println("Tienes sobrepeso");
	}else if (imc >= 30f) { 
		System.out.println("Tienes obesidad");
	}
	
	
	
	}
	
}

