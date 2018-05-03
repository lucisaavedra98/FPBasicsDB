package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;

public interface RepositorioResultadosAprendizaje {
	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje ();
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados (Integer idModulo,Integer idResultado);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo (Integer idModulo);
	
	void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro);
}
