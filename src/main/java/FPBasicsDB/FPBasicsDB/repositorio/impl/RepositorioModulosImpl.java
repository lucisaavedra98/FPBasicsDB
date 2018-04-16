package FPBasicsDB.FPBasicsDB.repositorio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import FPBasicsDB.FPBasicsDB.mapper.ModuloMapper;
import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioModulos;

public class RepositorioModulosImpl implements RepositorioModulos {

	private ModuloMapper mapper;

	@Autowired
	public RepositorioModulosImpl(ModuloMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaModulos();
	}

	@Override
	public TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}

	@Override
	public void modificarResgistroDeLaTablaModulos(TablaModulos registro) {
		this.mapper.modificarRegistroDeLaTablaModulos(registro);
	}
}
