package FPBasicsDB.FPBasicsDB.repositorio.impl;

import java.util.List;

import FPBasicsDB.FPBasicsDB.mapper.ActividadFormativaMapper;
import FPBasicsDB.FPBasicsDB.modelo.TablaActividadesFormativas;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioActividadesFormativas;

public class RepositorioActividadesFormativasImpl implements RepositorioActividadesFormativas{
	private ActividadFormativaMapper mapper;
	
	public void RepositorioTablarResultadosAprendizaje(ActividadFormativaMapper mapper) {
		this.mapper=mapper;
	}

	@Override
	public List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(
			Integer idActividad, String Empresa, Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(
				 idActividad, Empresa, idBloque);
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(
			String Empresa, Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque(Empresa, idBloque);
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(
			Integer idFormador) {
		return this.mapper.consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores(
				idFormador);
	}

	@Override
	public void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro) {
		this.mapper.modificarRegistroDeLaTablaActividadesFormativas(registro);
	}
	
	
}
