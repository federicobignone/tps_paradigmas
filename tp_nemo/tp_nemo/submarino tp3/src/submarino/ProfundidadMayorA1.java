package submarino;

import java.util.List;

public class ProfundidadMayorA1 extends NivelDeProfundidad {
	
	private static String errorMessage = "El submarino explotó!!";

	@Override
	public List<NivelDeProfundidad> Bajar(List<NivelDeProfundidad> profundidades) {
		profundidades.add( new ProfundidadMayorA1() );
		return profundidades;
	}

	@Override
	public List<NivelDeProfundidad> Subir(List<NivelDeProfundidad> profundidades) {
		profundidades.remove( profundidades.size() - 1);
		return profundidades;
	}
	
	@Override
	public void LanzarIcbm() {
		throw new Error( errorMessage );
		
	}

}
