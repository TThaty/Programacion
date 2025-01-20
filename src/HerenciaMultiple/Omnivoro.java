package HerenciaMultiple;

import java.util.Objects;

public class Omnivoro implements Herbivoro, Carnivoro {

	private String id;
	private String nombre;
	
	public Omnivoro (String id, String nombre) {
		
	}
	
	public Omnivoro () {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Omnivoro other = (Omnivoro) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Omnivoro [id=" + id + ", nombre=" + nombre + "]";
	}

	@Override
	public void darDeComer() {
		Herbivoro.super.darDeComer();
		Carnivoro.super.darDeComer();
	}
}
