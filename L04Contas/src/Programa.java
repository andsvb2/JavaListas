
public class Programa {

	public static void main(String[] args) {
		
		int x = 10;
		int y = x % 4;
		int z;
		for(z = 1 ; x > y ; y *= 2)
			z = x++ +z;
		int w = x + y + z;
		System.out.println(w);
	}
}
