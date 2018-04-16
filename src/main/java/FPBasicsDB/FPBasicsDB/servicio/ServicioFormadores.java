package FPBasicsDB.FPBasicsDB.servicio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaFormadores;

public interface ServicioFormadores {
	
	List<TablaFormadores> consultarTodosLosRegistrosDeLaTablaFormadores();
	
	TablaFormadores consultarRegistrosDeLaTablaFormadoresPorIdFormador(Integer idFormador);
	
	void modificarRegistroDeLaTablaFormadores(TablaFormadores registro);
}