
public class Programa {

	public static void main(String[] args) {

		a();
		b();
		c();
		d();
		e();
		f();
		g();
	}

	public static void a(){
		Operacoes op = new Operacoes();
		int x = 2;
		op.dobro(x);
		System.out.println("Letra a: ");
		System.out.println(x);
	}
	
	public static void b() {
		Operacoes op = new Operacoes();
		System.out.println("Letra b: ");
		System.out.println(op.dobro("ba"));;
	}
	
	public static void c() {
		Operacoes op = new Operacoes();
		int x[] = {1, 3, 6, 9};
		op.dobro(x);
		System.out.println("Letra c: ");
		for(int i : x) {
			System.out.println(i);
		}
	}
	
	public static void d() {
		Operacoes op = new Operacoes();
		int x = 2;
		int y = 3;
		System.out.println("Letra d: ");
		System.out.println(op.dobro(x)+op.dobro(y));
	}
	
	public static void e() {
		Operacoes op = new Operacoes();
		int y = 3;
		int z = op.dobro(y);
		System.out.println("Letra e: ");
		System.out.println(op.dobro(z) + y);
	}
	
	public static void f() {
		Operacoes op = new Operacoes();
		int y = 3;
		int z = op.dobro(y);
		System.out.println("Letra f: ");
		System.out.println(2 * op.dobro(z) + z + 3 * y);
		}
	
	public static void g() {
		
	}
}
