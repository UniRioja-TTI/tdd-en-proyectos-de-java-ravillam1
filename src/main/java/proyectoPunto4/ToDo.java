package proyectoPunto4;

import java.io.Serializable;
import java.sql.Date;

/**
 * Clase que representa tareas
 */
public class ToDo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String descripcion;
	private Date fecha_limite;
	private boolean completado;
	
	/*
	 * Constructor vacío de la clase ToDo
	 */
	public ToDo() {}
	/*
	 * Constructor con parámetros de la clase ToDo
	 */
	public ToDo(int id, String nombre, String descripcion, Date fecha_limite, boolean completado) {
		this.id=id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_limite = fecha_limite;
		this.completado = completado;
	}
	/*
	 * @return id actual
	 */
	public int getId() {
		return id;
	}
	/*
	 * Establece el id
	 * 
	 * @param id id del ToDo
	 */
	public void setId(int id) {
		this.id = id;
	}
	/*
	 * @return nombre actual
	 */
	public String getNombre() {
		return nombre;
	}
	/*
	 * Establece el nombre
	 * 
	 * @param nombre nombre del ToDo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * @return descripcion actual
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/*
	 * Establece la descripcion
	 * 
	 * @param descripcion descripcion del ToDo
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/*
	 * @return fecha limite actual
	 */
	public Date getFecha_limite() {
		return fecha_limite;
	}
	/*
	 * Establece la fecha limite
	 * 
	 * @param fecha_limite fecha limite del ToDo
	 */
	public void setFecha_limite(Date fecha_limite) {
		this.fecha_limite = fecha_limite;
	}
	/*
	 * @return completado actual
	 */
	public boolean isCompletado() {
		return completado;
	}
	/*
	 * Establece el completado
	 * 
	 * @param completado completado del ToDo
	 */
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
}
