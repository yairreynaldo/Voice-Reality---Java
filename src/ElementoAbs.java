import java.util.ArrayList;

public abstract class ElementoAbs {

	public abstract int getCantParticipantes(); 
	
	public abstract double getEdad();
	
	public abstract ArrayList<String> getGenePref();
	
	public int cantGeneros() {
		return this.getGenePref().size();
	}
	
	public abstract ArrayList<String> getIdiomas();
	
	public int cantIdiomas() {
		return this.getIdiomas().size();
	}
	
	public abstract ArrayList<String> getInstrumentos();
	
	public int cantInstrumentos() {
		return this.getInstrumentos().size();
	}
	
	public abstract ArrayList<ElementoAbs> buscar(Criterio c);
}
