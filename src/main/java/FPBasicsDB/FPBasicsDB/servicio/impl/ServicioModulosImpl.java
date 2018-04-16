package FPBasicsDB.FPBasicsDB.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FPBasicsDB.FPBasicsDB.servicio.ServicioModulos;
import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioModulos;


@Service
public class ServicioModulosImpl implements ServicioModulos {
	
	RepositorioModulos repositorioTablaModulos;
	
	@Autowired
	public ServicioModulosImpl (RepositorioModulos repositorioModulos) {
		this.repositorioTablaModulos = repositorioTablaModulos;
	}

	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
		return this.repositorioTablaModulos.consultarTodosLosRegistrosDeLaTablaModulos();
	}

	
	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.repositorioTablaModulos.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}
	
	@Override
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		this.repositorioTablaModulos.modificarResgistroDeLaTablaModulos(registro);;		
	}

}