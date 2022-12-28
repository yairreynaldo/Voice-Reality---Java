
public class CriterioEdad extends Criterio {

	private int edad;
	
	
	public CriterioEdad(int edad) {
		super();
		this.edad = edad;
	}


	@Override
	public boolean criterioBusqueda(ElementoAbs p) {
		return p.getEdad() > edad;
	}

}
