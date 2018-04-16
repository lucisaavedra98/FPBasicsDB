package FPBasicsDB.FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;

public interface ModuloMapper {

	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();

	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(@Param("codigo")Integer idModulo) ;

	public int modificarRegistroDeLaTablaModulos(@Param("modulo")TablaModulos registro);	
}
