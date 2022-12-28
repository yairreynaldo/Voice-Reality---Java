
public class ComparadorInstrumentos extends ComparadorParticipante {

	public ComparadorInstrumentos() {
		// TODO Auto-generated constructor stub
	}

	public ComparadorInstrumentos(ComparadorParticipante siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(ElementoAbs p1, ElementoAbs p2) {
		// TODO Auto-generated method stub
		return p1.cantInstrumentos()-p2.cantInstrumentos();
	}

}
