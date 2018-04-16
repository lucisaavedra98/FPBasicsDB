package FPBasicsDB.FPBasicsDB.modelo;

public class TablaFormadores {

	private final String idFormador;
	private final String nombre;
	private final String apellidos;
	private final Integer telefono;
	private final String email;

	public TablaFormadores(String idformado, String nombre, String apellidos, Integer telefono, String email) {
		super();
		this.idFormador = idformado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
	}

	public String getIdformado() {
		return idFormador;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return idFormador.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaFormadores) {
			return idFormador.equals(((TablaFormadores) obj).getIdformado());
		}
		return false;
	}
}