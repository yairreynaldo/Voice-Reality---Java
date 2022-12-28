import java.util.ArrayList;

public class TemaMusical {

	private String titulo;
	private String idioma;
	private ArrayList<String> genero;
	private ArrayList<String> instrumentosNecesarios;
	
	public TemaMusical(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		genero = new ArrayList<String>();
		instrumentosNecesarios = new ArrayList<String>();
	}
	
	public void addGene(String g) {
		if(! genero.contains(g)) {
			genero.add(g);
		}
	}
	
	public ArrayList<String> getGenero() {
		return new ArrayList<String>(genero);
	}

	public void addInst(String i) {
		if(! instrumentosNecesarios.contains(i)) {
			instrumentosNecesarios.add(i);
		}
	}
	public ArrayList<String> getInstrumentosNecesarios() {
		return new ArrayList<String>(instrumentosNecesarios);
	}

	public boolean partApto(ElementoAbs e) {
		for(String g : e.getGenePref()) {
			if(genero.contains(g)) {
				for(String i : e.getIdiomas()) {
					if(i.equals(idioma)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
}
