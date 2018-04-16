package FPBasicsDB.FPBasicsDB.repositorio.impl;

import java.util.List;

import FPBasicsDB.FPBasicsDB.mapper.BloqueMapper;
import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioBloques;

public class RepositorioBloquesImpl implements RepositorioBloques {
	private BloqueMapper mapper;
	
	public void RepositorioTablaBloques(BloqueMapper mapper) {
		this.mapper=mapper;
	}
	
	@Override
	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		return this.mapper.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorEmpresa(String empresa) {
		return this.mapper.consultarRegistrosDeLaTablaModulosPorEmpresa(empresa);
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorIdBloque(Integer idBloque) {
		return this.mapper.consultarRegistrosDeLaTablaModulosPorIdBloques(idBloque);
	}
	
	@Override
	public void modificarResgistroDeLaTablaBloques(TablaBloques registro) {
		this.mapper.modificarRegistroDeLaTablaBloques(registro);
	}	
}
