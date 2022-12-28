import java.util.ArrayList;
import java.util.Collections;

public class Coach {

	private String nombre;
	private ArrayList<ElementoAbs> participantes;
	
	public Coach(String nombre) {
		this.nombre = nombre;
		participantes = new ArrayList<ElementoAbs>();
	}
	
	public void addParticipante(ElementoAbs parti) {
		participantes.add(parti);
	}
	
	public double promEdad() {
		double suma = 0;
		for(ElementoAbs p : participantes) {
			suma = suma + p.getEdad();
		}
		
		return suma/participantes.size();
	}
	
	public ArrayList<String> getInstrumentos(){
		ArrayList<String> inst = new ArrayList<String>();
		for (int i = 0; i < participantes.size(); i++) {
			ArrayList<String> aux = participantes.get(i).getInstrumentos();
			
			for (int j = 0; j < aux.size(); j++) {
				if(! inst.contains(aux.get(j))){
					inst.add(aux.get(j));
				}
			}
		}
		return inst;
	}
	
	public ArrayList<String> getIdiomas(){
		ArrayList<String> idio = new ArrayList<String>();
		for (int i = 0; i < participantes.size(); i++) {
			ArrayList<String> aux = participantes.get(i).getIdiomas();
			
			for (int j = 0; j < aux.size(); j++) {
				if(! idio.contains(aux.get(j))){
					idio.add(aux.get(j));
				}
			}
		}
		return idio;
	}
	
	public ArrayList<String> getGenePref(){
		ArrayList<String> gene = new ArrayList<String>();
		for (int i = 0; i < participantes.size(); i++) {
			ArrayList<String> aux = participantes.get(i).getGenePref();
			
			for (int j = 0; j < aux.size(); j++) {
				if(! gene.contains(aux.get(j))){
					gene.add(aux.get(j));
				}
			}
		}
		Collections.sort(gene);
		return gene;
	}
	
	public ArrayList<ElementoAbs> buscarParticipantes(Criterio c){
		ArrayList<ElementoAbs> result = new ArrayList<ElementoAbs>();
		for(ElementoAbs p : participantes) {
				result.addAll(p.buscar(c));
		}
		
		return result;
	}
	
	public ArrayList<ElementoAbs> getListaOrdenada(ComparadorParticipante c){
		ArrayList<ElementoAbs> result = this.participantes;
		Collections.sort(result, c);
		return result;
	}
}
