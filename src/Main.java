import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado;
		System.out.print("Introduce primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo número: ");
		numero2 = sc.nextInt();
		resultado = producto(numero1, numero2);
		System.out.println("Producto: " + resultado);
		resultado = dividir(numero1, numero2);
		System.out.println("Dividir: " + resultado);
	}

	public static int producto(int a, int b) {
		int c;
		c = a * b;
		return c;
	}

	public static int dividir(int a, int b) {
		int c;
		c = a / b;
		return c;
	}

}
