package FPBasicsDB.FPBasicsDB.servicio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;

public interface ServicioBloques {
	
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorEmpresa(String empresa);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquesPorIdBloque(Integer idBloque);	
	
	void modificarRegistroDeLaTablaBloques(TablaBloques registro);
}