package FPBasicsDB.FPBasicsDB.servicio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaActividadesFormativas;

public interface ServicioActividadesFormativas {
	
	List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividad(Integer idactividad);
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresa(String empresa);
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdBloque(Integer idBloque);
	
	void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro);
}