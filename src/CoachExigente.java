import java.util.ArrayList;

public class CoachExigente extends Coach {

	
	public CoachExigente(String nombre) {
		super(nombre);
	}

	private Criterio estrategia;

	public Criterio getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(Criterio estrategia) {
		this.estrategia = estrategia;
	}
	
	public void addParticipante(ElementoAbs p) {
		if(estrategia.criterioBusqueda(p)) {
			super.addParticipante(p);;
		}
	}
}
