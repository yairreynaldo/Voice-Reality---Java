
public class CriterioAND extends Criterio {

	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioAND(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		// TODO Auto-generated method stub
		return c1.criterioBusqueda(p) && c2.criterioBusqueda(p);
	}

}
