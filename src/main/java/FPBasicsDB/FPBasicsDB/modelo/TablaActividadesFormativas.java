package FPBasicsDB.FPBasicsDB.modelo;

public class TablaActividadesFormativas {

	private final Integer idActividad;
	private final String empresa;
	private final Integer idBloque;
	private final String descripcionActividad;
	private final Integer horasDedicadas;

	public TablaActividadesFormativas(Integer idactividad, String empresa, Integer idbloque,
			String descripcionActividad, Integer horasDedicadas) {
		super();
		this.idActividad = idactividad;
		this.empresa = empresa;
		this.idBloque = idbloque;
		this.descripcionActividad = descripcionActividad;
		this.horasDedicadas = horasDedicadas;
	}

	public Integer getIdactividad() {
		return idActividad;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Integer getIdbloque() {
		return idBloque;
	}

	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	public Integer getHorasDedicadas() {
		return horasDedicadas;
	}

	@Override
	public int hashCode() {
		return idActividad.hashCode() + empresa.hashCode() + idBloque.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaActividadesFormativas) {
			return idActividad.equals(((TablaActividadesFormativas) obj).getIdactividad())
					&& empresa.equals(((TablaActividadesFormativas) obj).getEmpresa())
					&& idBloque.equals(((TablaActividadesFormativas) obj).getIdbloque());
		}
		return false;
	}

}