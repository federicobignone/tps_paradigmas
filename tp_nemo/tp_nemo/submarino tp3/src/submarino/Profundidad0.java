package submarino;

import java.util.List;

public class Profundidad0 extends NivelDeProfundidad {

	@Override
	public List<NivelDeProfundidad> Bajar(List<NivelDeProfundidad> profundidades) {
		profundidades.add( new ProfundidadIgualA1() );
		return profundidades;
	}

	@Override
	public List<NivelDeProfundidad> Subir(List<NivelDeProfundidad> profundidades) {
		return profundidades;
	}

	@Override
	public void LanzarIcbm() {}

}
