package lista.sem03.triangulos;

public class Triangulo {

	private int lado1, lado2, lado3;
	
	public int getLado1() {
		return lado1;
	}
	
	public int getLado2() {
		return lado2;
	}
	
	public int getLado3() {
		return lado3;
	}
		
	public void setLado1(int novoL1) {
		lado1 = novoL1;
	}
	
	public void setLado2(int novoL2) {
		lado2 = novoL2;
	}
	
	public void setLado3(int novoL3) {
		lado3 = novoL3;
	}
		
	public Tipo tipo() {
		if ((lado1 == lado2) && (lado2 == lado3)) {
			return Tipo.EQUILÁTERO;
		} else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) { 
			return Tipo.ISÓSCELES;
		} else {
			return Tipo.ESCALENO;
		}		
	}
}