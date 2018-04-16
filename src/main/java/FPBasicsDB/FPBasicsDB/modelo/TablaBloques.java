package FPBasicsDB.FPBasicsDB.modelo;

public class TablaBloques {
	private final String empresa;
	private final Integer idBloque;
	private final Integer idModulo;
	private final Integer orden;
	private final String descripcion;
	private final Integer idFormadorResponsable;

	public TablaBloques(String empresa, Integer idBloque, Integer idModulo, Integer orden, String descripcion,
			Integer idFormadorResponsable) {
		super();
		this.empresa = empresa;
		this.idBloque = idBloque;
		this.idModulo = idModulo;
		this.orden = orden;
		this.descripcion = descripcion;
		this.idFormadorResponsable = idFormadorResponsable;
	}

	public String getEmpresa() {
		return empresa;
	}

	public Integer getIdBloque() {
		return idBloque;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public Integer getOrden() {
		return orden;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getIdFormadorResponsable() {
		return idFormadorResponsable;
	}

	@Override
	public int hashCode() {
		return empresa.hashCode() + empresa.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaBloques) {
			return empresa.equals(((TablaBloques) obj).getEmpresa()) && idBloque.equals(((TablaBloques) obj).getIdBloque());
		}
		return false;
	}
}