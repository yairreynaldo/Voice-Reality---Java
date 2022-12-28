import java.util.ArrayList;

public class Participante extends ElementoAbs {

	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> genePref;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	
	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		genePref = new ArrayList<String>();
		idiomas = new ArrayList<String>();
		instrumentos = new ArrayList<String>();
	}

	public void addGenePref(String gene) {
		if(! genePref.contains(gene)) {
			genePref.add(gene);
		}
	}
	public void addIdioma(String idio) {
		if(! idiomas.contains(idio)) {
			idiomas.add(idio);
		}
	}
	public void addInstrumento(String inst) {
		if(! instrumentos.contains(inst)) {
			instrumentos.add(inst);
		}
	}
	
	@Override
	public int getCantParticipantes() {
		return 1;
	}

	@Override
	public double getEdad() {
		return edad;
	}

	@Override
	public ArrayList<String> getGenePref() {
		return new ArrayList<String>(genePref);
	}
	
	@Override
	public ArrayList<String> getIdiomas() {
		return new ArrayList<String>(idiomas);
	}
	
	@Override
	public ArrayList<String> getInstrumentos() {
		return new ArrayList<String>(instrumentos);
	}
	
	@Override
	public ArrayList<ElementoAbs> buscar(Criterio c) {
		ArrayList<ElementoAbs> result = new ArrayList<ElementoAbs>();
		if(c.criterioBusqueda(this)) {
			result.add(this);
		}
		return result;
	}

}
