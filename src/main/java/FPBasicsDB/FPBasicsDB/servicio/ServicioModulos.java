package FPBasicsDB.FPBasicsDB.servicio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaModulos;

public interface ServicioModulos {
	
	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	TablaModulos consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);
}
