
public class ComparadorGenero extends ComparadorParticipante {

	public ComparadorGenero() {
		// TODO Auto-generated constructor stub
	}

	public ComparadorGenero(ComparadorParticipante siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(ElementoAbs p1, ElementoAbs p2) {
		// TODO Auto-generated method stub
		return p1.cantGeneros() - p2.cantGeneros();
	}

}
