package FPBasicsDB.FPBasicsDB.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import FPBasicsDB.FPBasicsDB.modelo.TablaActividadesFormativas;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioActividadesFormativas;
import FPBasicsDB.FPBasicsDB.servicio.ServicioActividadesFormativas;

public class ServicioActividadesFormativasImpl implements ServicioActividadesFormativas {
	
	
	RepositorioActividadesFormativas repositorioActividadesFormativas;
	
	@Autowired
	public ServicioActividadesFormativasImpl (RepositorioActividadesFormativas repositorioActividadesFormativas) {
		this.repositorioActividadesFormativas = repositorioActividadesFormativas;
	}

	@Override
	public List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas() {
		return this.repositorioActividadesFormativas.consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividad(Integer idActividad) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividad(idActividad);
	}
	
	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresa(String empresa) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorEmpresa(empresa);
	}
	
	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdBloque(Integer idBloque) {
		return this.repositorioActividadesFormativas.consultarRegistrosDeLaTablaActividadesFormativasPorIdBloque(idBloque);
	}

	@Override
	public void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro) {
		this.repositorioActividadesFormativas.modificarResgistroDeLaTablaActividadesFormativas(registro);
	}
}