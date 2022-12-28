
public class CriterioNOT extends Criterio {

	private Criterio c1;
	
	
	public CriterioNOT(Criterio c1) {
		super();
		this.c1 = c1;
	}


	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		// TODO Auto-generated method stub
		return !c1.criterioBusqueda(p);
	}

}
