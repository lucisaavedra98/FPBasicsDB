package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.FPBasicsDB.modelo.TablaFormadores;

public interface RepositorioFormadores {
	List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();
	
	TablaFormadores consultarRegistrosDeLaTablaBloquesPorIdFormador (Integer idFormador);

	void modificarResgistroDeLaTablaFormadores(TablaFormadores registro);
}
