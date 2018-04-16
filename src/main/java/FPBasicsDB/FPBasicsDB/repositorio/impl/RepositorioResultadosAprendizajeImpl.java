package FPBasicsDB.FPBasicsDB.repositorio.impl;

import java.util.List;

import FPBasicsDB.FPBasicsDB.mapper.ResultadosAprendizajeMapper;
import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioResultadosAprendizaje;

public class RepositorioResultadosAprendizajeImpl implements RepositorioResultadosAprendizaje {
	private ResultadosAprendizajeMapper mapper;
	
	public void RepositorioTablarResultadosAprendizaje(ResultadosAprendizajeMapper mapper) {
		this.mapper=mapper;
	}
	
	@Override
	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadosAprendizaje() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultado(Integer idResultado) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdResultados(idResultado);
	}
	
	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdModulo(
			Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);
	}
	
	@Override
	public void modificarResgistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.mapper.modificarRegistroDeLaTablaResultadosAprendizaje(registro);		
	}
}
