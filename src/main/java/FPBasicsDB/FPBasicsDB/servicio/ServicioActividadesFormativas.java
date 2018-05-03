package FPBasicsDB.FPBasicsDB.servicio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaActividadesFormativas;

public interface ServicioActividadesFormativas {
	
	List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloque(Integer idActividad, String Empresa,Integer idBloque);
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresaEIdBloque( String Empresa,Integer idBloque);
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividadEmpresaEIdBloqueViaFormadores( Integer idFormador);

	void modificarRegistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro);
}