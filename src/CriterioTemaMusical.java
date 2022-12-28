
public class CriterioTemaMusical extends Criterio {

	private TemaMusical tema;

	
	public CriterioTemaMusical(TemaMusical tema) {
		super();
		this.tema = tema;
	}


	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		return tema.partApto(p);
	}

}
