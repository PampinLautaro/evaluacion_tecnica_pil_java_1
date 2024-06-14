package segundo_cuestionrio;

import java.util.List;
import java.util.Objects;

public class Candidato implements Comparable<Candidato>{
	
	Long id;
	String nombre;
	String apellido;
	Integer anosExperiencia;
	Double pretensionSalarial;
	List<Tecnologias> tecnologias;
	
	public Candidato(Long id, String nombre, String apellido, Integer anosExperiencia, Double pretensionSalarial,
			List<Tecnologias> tecnologias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anosExperiencia = anosExperiencia;
		this.pretensionSalarial = pretensionSalarial;
		this.tecnologias = tecnologias;
	}
	
	public long getId() {
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
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getAnosExperiencia() {
		return anosExperiencia;
	}
	
	public void setAnosExperiencia(Integer anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	
	public Double getPretensionSalarial() {
		return pretensionSalarial;
	}
	
	public void setPretensionSalarial(Double pretensionSalarial) {
		this.pretensionSalarial = pretensionSalarial;
	}
	
	public List<Tecnologias> getTecnologias() {
		return tecnologias;
	}
	
	public void setList(List<Tecnologias> tecnologias) {
		this.tecnologias = tecnologias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anosExperiencia, apellido, id, tecnologias, nombre, pretensionSalarial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(anosExperiencia, other.anosExperiencia) && Objects.equals(apellido, other.apellido)
				&& id == other.id && Objects.equals(tecnologias, other.tecnologias) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pretensionSalarial, other.pretensionSalarial);
	}

	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", anosExperiencia="
				+ anosExperiencia + ", pretensionSalarial=" + pretensionSalarial + ", list=" + tecnologias + "]";
	}

	@Override
	public int compareTo(Candidato o) {
		return this.id.compareTo(o.id); 
	}
	
	public List<Tecnologias> ordenarTecnologias(){
		tecnologias.sort((t1, t2) -> t1.getNombre().compareTo(t2.getNombre()));
        return tecnologias;
	}
}
