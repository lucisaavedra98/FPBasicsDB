package FPBasicsDB.FPBasicsDB.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioResultadosAprendizaje;
import FPBasicsDB.FPBasicsDB.servicio.ServicioResultadosAprendizaje;

public class ServicioResultadosAprendizajeImpl implements ServicioResultadosAprendizaje {

	RepositorioResultadosAprendizaje repositorioTablaResultadosAprendizaje;

	@Override
	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje() {
		return this.repositorioTablaResultadosAprendizaje.consultarTodosLosRegistrosDeLaTablaResultadoAprendizaje();
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(
			Integer idModulo, Integer idResultado) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModuloYIdResultados(idModulo, idResultado);
	}

	@Override
	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(
			Integer idModulo) {
		return this.repositorioTablaResultadosAprendizaje.consultarRegistrosDeLaTablaResultadoAprendizajePorIdModulo(idModulo);
	}

	@Override
	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.repositorioTablaResultadosAprendizaje.modificarRegistroDeLaTablaResultadosAprendizaje(registro);
	}
	
}

