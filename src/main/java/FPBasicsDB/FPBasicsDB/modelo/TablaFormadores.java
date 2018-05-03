package FPBasicsDB.FPBasicsDB.modelo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
		final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
		
			hashCodeBuilder.append(idFormador);
			hashCodeBuilder.append(nombre);
			hashCodeBuilder.append(apellidos);
			hashCodeBuilder.append(telefono);
			hashCodeBuilder.append(email);
		
		return hashCodeBuilder.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TablaFormadores) {
			
			final TablaFormadores param = (TablaFormadores)obj;
			final EqualsBuilder equalsBuilder = new EqualsBuilder();
			
			equalsBuilder.append(this.idFormador, param.idFormador);
			equalsBuilder.append(this.nombre, param.nombre);
			equalsBuilder.append(this.apellidos, param.apellidos);
			equalsBuilder.append(this.telefono, param.telefono);
			equalsBuilder.append(this.email, param.email);
			
			return equalsBuilder.isEquals();
			
		}
		return false;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}