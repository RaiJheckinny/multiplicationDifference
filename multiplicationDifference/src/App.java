import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.print("\nDigite o valot de B: ");
		b = sc.nextInt();
		
		System.out.print("\nDigite o valor de C: ");
		c = sc.nextInt();
		
		System.out.print("\nDigite o valor de D: ");
		d = sc.nextInt();
		
		diferenca = a*b-c*d;
		
		System.out.printf("%nA diferença das multiplicações A:%d * B:%d e C:%d * D:%d = %d", a, b, c, d, diferenca);
    }
}
