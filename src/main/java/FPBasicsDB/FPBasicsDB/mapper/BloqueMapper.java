package FPBasicsDB.FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;

public interface BloqueMapper {
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	List<TablaBloques> consultarRegistrosDeLaTablaModulosPorIdBloques(@Param("idBloque") Integer idModulo);
	List<TablaBloques> consultarRegistrosDeLaTablaModulosPorEmpresa(@Param("empresa") String empresa);
	TablaBloques consultarRegistrosDeLaTablaModulosPorEmpresaEIdBloque(@Param("idBloque") Integer idResultado,@Param("empresa") Integer emmpresa);
	
	List<String> obtenerEmpresas();
	List<Integer> obtenerBloques();

	
	int modificarRegistroDeLaTablaBloques(@Param("bloque") TablaBloques registro);
}
