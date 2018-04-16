package FPBasicsDB.FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.FPBasicsDB.modelo.TablaActividadesFormativas;
import FPBasicsDB.FPBasicsDB.modelo.TablaBloques;

public interface RepositorioActividadesFormativas {
	List<TablaActividadesFormativas> consultarTodosLosRegistrosDeLaTablaActividadesFormativas();
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdActividad(Integer idActividad);
	
	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorEmpresa(String empresa);

	List<TablaActividadesFormativas> consultarRegistrosDeLaTablaActividadesFormativasPorIdBloque(Integer idBloque);
	
	void modificarResgistroDeLaTablaActividadesFormativas(TablaActividadesFormativas registro);
}
