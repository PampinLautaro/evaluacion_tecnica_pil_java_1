package segundo_cuestionrio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tecnologias {
	
	Long id;
	String nombre;
	
	List<Tecnologias> tecnologias = new ArrayList<>();
	
	
	public Tecnologias(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tecnologias other = (Tecnologias) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Tecnologias [id=" + id + ", nombre=" + nombre + "]";
	}
}
