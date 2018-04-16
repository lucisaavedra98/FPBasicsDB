package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;

public interface RepositorioBloques {
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorEmpresa(String empresa);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorIdBloque (Integer idBloque);

	void modificarResgistroDeLaTablaBloques(TablaBloques registro);
}
