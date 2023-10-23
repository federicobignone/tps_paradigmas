package submarino;

import java.util.List;

public class ProfundidadIgualA1 extends NivelDeProfundidad{

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
	public void LanzarIcbm() {}
}
