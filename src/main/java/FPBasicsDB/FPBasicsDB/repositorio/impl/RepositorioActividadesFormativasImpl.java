package FPBasicsDB.FPBasicsDB.repositorio.impl;

import java.util.List;

import FPBasicsDB.FPBasicsDB.mapper.ResultadosAprendizajeMapper;
import FPBasicsDB.FPBasicsDB.modelo.TablaActividadesFormativas;
import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioActividadesFormativas;

public class RepositorioActividadesFormativasImpl implements RepositorioActividadesFormativas{
	private ActividadFormativaMapper mapper;
	
	public void RepositorioTablarResultadosAprendizaje(ActividadFormativaMapper mapper) {
		this.mapper=mapper;
	}
	
	@Override
	public List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividad(
			Integer idActividad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresa(String empresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdBloque(
			Integer idBloque) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarResgistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro) {
		// TODO Auto-generated method stub
	}
}
