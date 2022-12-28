import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grupo extends ElementoAbs {

	private String nombre;
	private ArrayList<ElementoAbs> elementos;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		elementos = new ArrayList<ElementoAbs>();
	}
	
	public int getCantParticipantes() {
		int suma = 0;
		for(ElementoAbs e : elementos) {
			suma = suma + e.getCantParticipantes();
		}
		return suma;
	}
	
	public double getEdad() {
		double suma = 0;
		for(ElementoAbs e : elementos) {
			suma = suma + e.getEdad();
		}
		return suma / this.getCantParticipantes();
	}
	
	public ArrayList<String> getGenePref(){
		ArrayList<String> generosPreferencia = new ArrayList<String>();
		if(!elementos.isEmpty()) {
			generosPreferencia = elementos.get(0).getGenePref();
			for (ElementoAbs e : elementos) {
				generosPreferencia.retainAll(e.getGenePref());
			}
		}
		return generosPreferencia;
	}
	
	public ArrayList<String> getIdiomas(){
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < elementos.size(); i++) {
			ArrayList<String> aux = elementos.get(i).getIdiomas();
			
			for (int j = 0; j < aux.size(); j++) {
				if(! result.contains(aux.get(j))){
					result.add(aux.get(j));
				}
			}
		}
		return result;
	}
	
	public ArrayList<String> getInstrumentos(){
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < elementos.size(); i++) {
			ArrayList<String> aux = elementos.get(i).getInstrumentos();
			
			for (int j = 0; j < aux.size(); j++) {
				if(! result.contains(aux.get(j))){
					result.add(aux.get(j));
				}
			}
		}
		return result;
	}
	
	
	public ArrayList<ElementoAbs> buscar(Criterio c){
		ArrayList<ElementoAbs> result = new ArrayList<ElementoAbs>();
		if(c.criterioBusqueda(this)) {
			result.add(this);
		}
		else {
			for(int i=0; i<elementos.size(); i++) {
				result.addAll(elementos.get(i).buscar(c));
			}
		}
		return result;
	}
	
}
