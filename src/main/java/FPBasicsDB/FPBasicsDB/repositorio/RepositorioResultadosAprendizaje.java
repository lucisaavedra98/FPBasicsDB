package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;

public interface RepositorioResultadosAprendizaje {
	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadosAprendizaje ();
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultado (Integer idResultado);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdModulo (Integer idResultado);
	
	void modificarResgistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro);
}
