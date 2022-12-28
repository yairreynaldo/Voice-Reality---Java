import java.util.Comparator;

public abstract class ComparadorParticipante implements Comparator<ElementoAbs> {

	private ComparadorParticipante siguiente;
	
	public ComparadorParticipante() {
		// TODO Auto-generated constructor stub
	}

	public ComparadorParticipante(ComparadorParticipante siguiente) {
		this.siguiente = siguiente;
	}
	
	public abstract int comparar(ElementoAbs p1, ElementoAbs p2);
	
	public int compare(ElementoAbs p1, ElementoAbs p2) {
		int res = this.comparar(p1, p2);
		if(res==0) {
			if(siguiente!=null) {
				return siguiente.compare(p1, p2);
			}
			else {
				return 0;
			}
		}
		return res;
	}
	
	
	
}
