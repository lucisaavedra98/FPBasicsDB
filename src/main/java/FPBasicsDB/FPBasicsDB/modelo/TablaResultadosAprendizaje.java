package FPBasicsDB.FPBasicsDB.modelo;

public class TablaResultadosAprendizaje {
	private final Integer idResultado;
	private final Integer idModulo;
	private final String descripcion;

	public TablaResultadosAprendizaje(Integer idResultados, Integer idModulo, String descripcion) {
		super();
		this.idResultado = idResultados;
		this.idModulo = idModulo;
		this.descripcion = descripcion;
	}

	public Integer getIdResultados() {
		return idResultado;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int hashCode() {
		return idResultado.hashCode() + idModulo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaResultadosAprendizaje) {
			return idResultado.equals(((TablaResultadosAprendizaje) obj).getIdResultados())
					&& idModulo.equals(((TablaResultadosAprendizaje) obj).getIdModulo());
		}
		return false;
	}
}