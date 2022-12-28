
public class ComparadorEdad extends ComparadorParticipante {

	public ComparadorEdad() {
		// TODO Auto-generated constructor stub
	}

	public ComparadorEdad(ComparadorParticipante siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(ElementoAbs p1, ElementoAbs p2) {
		return (int) (p1.getEdad() - p2.getEdad());
	}

}
