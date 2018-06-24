package cr.ac.ucenfotec.entities;

public class AreaFuncional {
	private int id;
	private Tarea TareaAsociada;
	private String nombre;
	
	public AreaFuncional() {
		
	}
	
	public AreaFuncional(int id, int tareaAsociada, String nombre) {
		super();
		this.id = id;
		this.TareaAsociada.setId(tareaAsociada);
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tarea getTareaAsociada() {
		return TareaAsociada;
	}

	public void setTareaAsociada(int tareaAsociada) {
		TareaAsociada.setId(tareaAsociada);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "AreaFuncional [id=" + id + ", TareaAsociada=" + TareaAsociada + ", nombre=" + nombre + "]";
	}

}
