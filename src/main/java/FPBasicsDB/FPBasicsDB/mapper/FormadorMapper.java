package FPBasicsDB.FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.FPBasicsDB.modelo.TablaFormadores;

public interface FormadorMapper {

	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();

	public TablaFormadores consultarRegistrosDeLaTablaFormadoresPorIdFormador(@Param("codigo")Integer idFormador) ;

	public int modificarRegistroDeLaTablaFormadores(@Param("formador")TablaFormadores registro);

	
}
