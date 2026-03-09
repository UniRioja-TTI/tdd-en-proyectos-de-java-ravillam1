package proyectoPunto4;

import java.sql.Date;
import java.util.List;
/**
 * Clase que representa un servicio
 */
public class Servicio {
	private Repositorio repositorio;
	private Mailer mailer;
	private static int idCounter = 1;
	
	/*
	 * Constructor de la clase Servicio
	 */
	public Servicio(Repositorio repositorio, Mailer mailer) {
		this.repositorio = repositorio;
		this.mailer = mailer;
	}
	/*
	 * Crea un ToDo en el repositorio
	 * @param nombre nombre del ToDo a crear
	 * @param fecha_limite decha limite del ToDo a crear
	 */
	public void crearTodo(String nombre, Date fecha_limite) {
		ToDo todo = new ToDo(idCounter, nombre, "", fecha_limite, false);
		idCounter++;
		repositorio.guardarToDo(todo);
	}

	/*
	 * Agrega la dirección de correo
	 * @param direccion direccion a agregar
	 */
	public void agregarDireccionCorreoAAgenda(String direccion) {
		repositorio.guardarEmail(direccion);
	}
	/*
	 * Marca un ToDo como finalizado
	 * @param  id id del ToDo a marcar
	 */
	public void marcarTareaFinalizada(String id) {
		repositorio.marcarCompletadoToDo(id);
	}
	/*
	 * Obtiene los ToDos sin completar
	 * @return lista de ToDos sin completar
	 */
	public List<ToDo> consultarToDosSinCompletar() {
		return repositorio.obtenerSinCompletar();
	}

}
