
public class CriterioInstrumento extends Criterio {

	private String instrumento;
	
	
	public CriterioInstrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}


	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		if(p.getInstrumentos().contains(instrumento)) {
			return true;
		}
		else {
			return false;
		}
	}

}
