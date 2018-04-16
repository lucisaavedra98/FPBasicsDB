package FPBasicsDB.FPBasicsDB.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import FPBasicsDB.FPBasicsDB.servicio.ServicioBloques;
import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.FPBasicsDB.repositorio.RepositorioBloques;

public class ServicioBloquesImpl implements ServicioBloques {
	
	RepositorioBloques repositorioTablaBloques;
	
	@Autowired
	public ServicioBloquesImpl (RepositorioBloques repositorioTablaBloques) {
		this.repositorioTablaBloques = repositorioTablaBloques;
	}

	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		return this.repositorioTablaBloques.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	public List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorIdBloque(Integer idBloque) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquesPorIdBloque(idBloque);
	}

	public List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorEmpresa(String empresa) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquesPorEmpresa(empresa);
	}

	public void modificarRegistroDeLaTablaBloques(TablaBloques registro) {
		this.repositorioTablaBloques.modificarResgistroDeLaTablaBloques(registro);
	}

}