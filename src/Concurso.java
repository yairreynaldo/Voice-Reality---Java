import java.util.ArrayList;

public class Concurso {

	private String nombre;
	private ArrayList<ElementoAbs> elementos;
	private ArrayList<Coach> jurados;
	
	public Concurso(String nombre) {
		this.nombre = nombre;
		elementos = new ArrayList<ElementoAbs>();
		jurados = new ArrayList<Coach>();
	}
	
	public void addElementos(ElementoAbs e) {
		elementos.add(e);
	}
	
	public void addJurado(Coach c) {
		jurados.add(c);
	}
	
	public int batalla(ElementoAbs p1, ElementoAbs p2, ComparadorParticipante c) {
		int res = c.compare(p1, p2);
		if(res > 0) {
			return 1;
		}
		else if(res == 0) {
			return 0;
		}
			else {
			return -1;
		}
	}
}
