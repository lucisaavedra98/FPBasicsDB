package FPBasicsDB.FPBasicsDB.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import FPBasicsDB.FPBasicsDB.servicio.ServicioFormadores;
import FPBasicsDB.FPBasicsDB.modelo.TablaFormadores;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioFormadores;

public class ServicioFormadoresImpl implements ServicioFormadores {
	
	RepositorioFormadores repositorioTablaFormadores;
	
	@Autowired
	public ServicioFormadoresImpl (RepositorioFormadores repositorioTablaFormadores) {
		this.repositorioTablaFormadores = repositorioTablaFormadores;
	}


	public List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores() {
		return this.repositorioTablaFormadores.consultarTodosLosRegistrosDeLaTablaFormadores();
	}

	public TablaFormadores consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador) {
		return this.repositorioTablaFormadores.consultarRegistrosDeLaTablaBloquesPorIdFormador(idFormador);
	}

	public void modificarRegistroDeLaTablaFormadores(TablaFormadores registro) {
		this.repositorioTablaFormadores.modificarResgistroDeLaTablaFormadores(registro);;
	}

}
