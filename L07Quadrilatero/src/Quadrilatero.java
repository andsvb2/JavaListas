
public class Quadrilatero {
	
	private int altura;
	private int comprimento;
	
	public Quadrilatero(int alt, int com) {
		altura = alt;
		comprimento = com;
	}
	
	public Quadrilatero(int lado) {
		altura = comprimento = lado;
	}
	
	public boolean equals(Quadrilatero q) {
		return (q.altura == this.altura && q.comprimento == this.comprimento);
	}
	
	public boolean isQuadrado() {
		return (altura == comprimento);
	}
	
	public int getArea() {
		return altura * comprimento;
	}
	
	public int getPerimetro() {
		return 2 * (altura + comprimento);
	}
}
