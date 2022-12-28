import java.util.ArrayList;

public class TemaFinal extends TemaMusical {

	
	public TemaFinal(String titulo, String idioma) {
		super(titulo, idioma);		
		}

	public boolean partApto(ElementoAbs e) {
		for(String inst : e.getInstrumentos()) {
			if(super.getInstrumentosNecesarios().contains(inst) && super.partApto(e)) {
				return true;
			}
		}
		return false;
	}
}
