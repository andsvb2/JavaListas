
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
		System.out.println("Letra a: " + x);
	}
	
	public static void b() {
		Operacoes op = new Operacoes();
		System.out.println(op.dobro("ba"));;
	}
	
	public static void c() {
		Operacoes op = new Operacoes();
		int x[] = {1, 3, 6, 9};
		op.dobro(x);
		for(int i : x) {
			System.out.println(i);
		}
	}
	
	public static void d() {
		Operacoes op = new Operacoes();
		int x = 2;
		int y = 3;
		System.out.println(op.dobro(x)+op.dobro(y));
	}
	
	public static void e() {
		
	}
	
	public static void f() {
		
	}
	
	public static void g() {
		
	}
}
