
public class ComparadorIdioma extends ComparadorParticipante {

	public ComparadorIdioma() {
		// TODO Auto-generated constructor stub
	}

	public ComparadorIdioma(ComparadorParticipante siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(ElementoAbs p1, ElementoAbs p2) {
		return p1.cantIdiomas() - p2.cantIdiomas();
	}

}
