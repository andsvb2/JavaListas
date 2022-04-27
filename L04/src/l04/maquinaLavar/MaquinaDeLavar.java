package l04.maquinaLavar;

public class MaquinaDeLavar {

	public int lavar(Roupa[] cesto) {
		
		boolean colorida = false;
		boolean branca = false;
		int tempoBranca = 0, tempoColorida = 0, tempoP = 0, tempoM = 0, tempoG = 0, tempoSujas = 0;
		
		for (Roupa i: cesto) {
			
			switch (i.getCor()) {
			case BRANCA: 
				branca = true;
				tempoBranca += 1;
				break;
			case COLORIDA:
				colorida = true;
				tempoColorida += 2;
				break;
			}
			
			switch (i.getEstado()) {
			case SUJA:
				tempoSujas += 3;
				break;
			case LIMPA:
			default:
				break;
			}
			
			switch (i.getTamanho()) {
			case P:
				tempoP += 3;
				break;
			case M:
				tempoM += 5;
				break;
			case G:
				tempoG += 8;
				break;
			}
		}
		
		if (colorida == true && branca == true) {
			return -1;
		} else {
			for(Roupa i: cesto) {
				i.setEstado(Estado.LIMPA);
			}
			return tempoBranca + tempoColorida + tempoSujas + tempoP + tempoM + tempoG;
		}
	}
}
