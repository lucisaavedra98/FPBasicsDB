package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaFormadores;

public interface RepositorioFormadores {
	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) ;

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(Integer idActividad,  Integer idEmpresa, Integer idBloque) ;
	
	void modificarRegistroDeLaTablaFormadores(TablaFormadores registro);
}
