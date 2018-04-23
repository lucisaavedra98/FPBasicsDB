package FPBasicsDB.FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.FPBasicsDB.modelo.TablaFormadores;

public interface FormadorMapper {

	public int modificarRegistroDeLaTablaFormadores(@Param("formador")TablaFormadores registro);

	
	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public TablaFormadores consultarRegistrosDeLaTablaFormadoresPorIdFormador(@Param("idFormador")Integer idFormador) ;

	public List<TablaFormadores> consultarRegistrosDeLaTablaFormadoresPorIdFormadorViaActividadesFormativas(@Param("idActividad")Integer idActividad, @Param("idEmpresa") Integer idEmpresa, @Param("idBloque") Integer idBloque) ;


	
}
