package FPBasicsDB.FPBasicsDB.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import FPBasicsDB.FPBasicsDB.modelo.TablaResultadosAprendizaje;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioResultadosAprendizaje;
import FPBasicsDB.FPBasicsDB.servicio.ServicioResultadosAprendizaje;

public class ServicioResultadosAprendizajeImpl implements ServicioResultadosAprendizaje {

	RepositorioResultadosAprendizaje repositorioTablaResultadosAprendizaje;

	@Autowired
	public ServicioResultadosAprendizajeImpl(RepositorioResultadosAprendizaje repositorioResultadosAprendizaje) {
		this.repositorioTablaResultadosAprendizaje = repositorioTablaResultadosAprendizaje;
	}

	public List<TablaResultadosAprendizaje> consultarTodosLosRegistrosDeLaTablaResultadosAprendizaje() {
		return this.repositorioTablaResultadosAprendizaje.consultarTodosLosRegistrosDeLaTablaResultadosAprendizaje();
	}

	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdModulo(
			Integer idModulo) {
		return this.repositorioTablaResultadosAprendizaje
				.consultarRegistrosDeLaTablaResultadosAprendizajePorIdModulo(idModulo);
	}

	public List<TablaResultadosAprendizaje> consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultadoAprendizaje(
			Integer idResultado) {
		return this.repositorioTablaResultadosAprendizaje
				.consultarRegistrosDeLaTablaResultadosAprendizajePorIdResultado(idResultado);
	}

	public void modificarRegistroDeLaTablaResultadosAprendizaje(TablaResultadosAprendizaje registro) {
		this.repositorioTablaResultadosAprendizaje.modificarResgistroDeLaTablaResultadosAprendizaje(registro);
	}

}