package FPBasicsDB.FPBasicsDB.repositorio.impl;

import java.util.List;

import FPBasicsDB.FPBasicsDB.mapper.ResultadoAprendizajeMapper;
import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioResultadosAprendizaje;

public class RepositorioResultadosAprendizajeImpl implements RepositorioResultadosAprendizaje {
	private ResultadoAprendizajeMapper mapper;
	
	public void RepositorioTablarResultadosAprendizaje(ResultadoAprendizajeMapper mapper) {
		this.mapper=mapper;
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(
			Integer idModulo,Integer idResultado) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(idModulo,idResultado);
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(
			Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);

	}

	@Override
	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.mapper.modificarRegistroDeLaTablaResultadosAprendizaje(registro);
		
	}
	
}