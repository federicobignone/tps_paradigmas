package submarino;

import java.util.List;


public abstract class NivelDeProfundidad {

	    public abstract List<NivelDeProfundidad> Bajar(List<NivelDeProfundidad> profundidades);
	    public abstract List<NivelDeProfundidad> Subir(List<NivelDeProfundidad> profundidades );
	    public abstract void LanzarIcbm();

}
