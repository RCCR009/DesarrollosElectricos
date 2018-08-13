package cr.ac.ucenfotec.entities;

public class Usuario {
	private String id;
	private AreaFuncional areaAsociada;
	private String clave;
	private String nombre;
	private String apellido;
	
	public Usuario() {
		
	}

	public Usuario(String id, AreaFuncional areaAsociada, String clave, String nombre, String apellido) {
		super();
		this.id = id;
		this.areaAsociada = areaAsociada;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public AreaFuncional getAreaAsociada() {
		return areaAsociada;
	}

	public void setAreaAsociada(AreaFuncional areaAsociada) {
		this.areaAsociada = areaAsociada;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", areaAsociada=" + areaAsociada + ", clave=" + clave + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
	
	public static class UsuarioBuilder{
		private String nestedId;
		private AreaFuncional nestedAreaAsociada;
		private String nestedClave;
		private String nestedNombre;
		private String nestedApellido;
		
		public UsuarioBuilder(final String newId, final String newClave, final AreaFuncional newArea, final String newNombre) {
			this.nestedId = newId;
			this.nestedClave = newClave;
			this.nestedAreaAsociada = newArea;
			this.nestedNombre = newNombre;		
		}

		public UsuarioBuilder NestedId(String nestedId) {
			this.nestedId = nestedId;
			return this;
		}

		public UsuarioBuilder NestedAreaAsociada(AreaFuncional nestedAreaAsociada) {
			this.nestedAreaAsociada = nestedAreaAsociada;
			return this;
		}

		public UsuarioBuilder NestedClave(String nestedClave) {
			this.nestedClave = nestedClave;
			return this;
		}

		public UsuarioBuilder NestedNombre(String nestedNombre) {
			this.nestedNombre = nestedNombre;
			return this;
		}

		public UsuarioBuilder setNestedApellido(String nestedApellido) {
			this.nestedApellido = nestedApellido;
			return this;
		}
		
		public Usuario CreateUsuario() {
			return new Usuario(nestedId,nestedAreaAsociada,nestedClave,nestedNombre,nestedApellido);
		}
			
	}

}
