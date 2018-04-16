package FPBasicsDB.FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;

public interface ResultadosAprendizajeMapper {

	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdModulo(@Param("idModulo") Integer idModulo);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultado(@Param("idResultado") Integer idResultado);
	
	TablaResultadosAprendizaje consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultadoEIdModulo(@Param("idResultado") Integer idResultado, @Param("idResultado") Integer idModulo);
	
	List<Integer> obtenerModulos();
	
	List<Integer> obtenerIdResultados();

	int modificarRegistroDeLaTablaResultadosAprendizaje(@Param("resultadoAprendizaje") TablaResultadosAprendizaje registro);

	
}
