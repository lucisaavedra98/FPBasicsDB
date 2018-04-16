package FPBasicsDB.FPBasicsDB.modelo;

public class TablaModulos {
	private final Integer idModulo;
	private final String nombre;
	private final Integer duracion;
	private final String curso;

	public TablaModulos(Integer idModulo, String nombre, Integer duracion, String curso) {
		super();
		this.idModulo = idModulo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.curso = curso;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public int hashCode() {
		return idModulo.hashCode() + idModulo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaModulos) {
			return idModulo.equals(((TablaModulos) obj).getIdModulo());
		}
		return false;
	}
}