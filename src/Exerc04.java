
public class Exerc04 {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 12;
		
		if(a>10 || a+b == 20) {
			System.out.println("número válido.");
		}else if(a == b) {
			System.out.println("A é igual B.\nA e B são diferentes de 10.\nA é menor que 10.");
		}else {
			System.out.println("número não válido.");
		}
	}
}
