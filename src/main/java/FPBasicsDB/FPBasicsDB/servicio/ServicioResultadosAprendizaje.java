package FPBasicsDB.FPBasicsDB.servicio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;

public interface ServicioResultadosAprendizaje {

	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadosAprendizaje();

	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdModulo(Integer idModulo);

	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultadoAprendizaje(
			Integer idResultado);

	void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro);
}