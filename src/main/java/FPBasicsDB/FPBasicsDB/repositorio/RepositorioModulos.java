package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;

public interface RepositorioModulos {
	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarResgistroDeLaTablaModulos(TablaModulos registro);
}
