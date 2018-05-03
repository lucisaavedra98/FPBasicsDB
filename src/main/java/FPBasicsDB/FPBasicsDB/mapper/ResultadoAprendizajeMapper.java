package FPBasicsDB.FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;

public interface ResultadoAprendizajeMapper {
	
	int modificarRegistroDeLaTablaResultadosAprendizaje(@Param("resultadoAprendizaje") TablaResultadosAprendizaje registro);


	List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(@Param("idModulo") Integer idModulo);
	
	List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(@Param("idModulo") Integer idModulo, @Param("idResultado") Integer idResultado);
		
}
