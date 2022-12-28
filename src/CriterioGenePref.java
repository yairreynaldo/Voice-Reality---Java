
public class CriterioGenePref extends Criterio {

	private String genePref;
	
	
	public CriterioGenePref(String genePref) {
		super();
		this.genePref = genePref;
	}

	
	
	public void setGenePref(String genePref) {
		this.genePref = genePref;
	}



	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		if(p.getGenePref().contains(genePref)) {
			return true;
		}
		else {
			return false;
		}
	}

}
