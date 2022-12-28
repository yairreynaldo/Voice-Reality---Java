
public class CriterioIdioma extends Criterio {

	private String idioma;
	
	
	public CriterioIdioma(String idioma) {
		super();
		this.idioma = idioma;
	}

	
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}



	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		if(p.getIdiomas().contains(idioma)){
			return true;
		}
		else {
			return false;
		}
	}

}
