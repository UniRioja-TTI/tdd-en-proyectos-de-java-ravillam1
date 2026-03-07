package proyectoPunto4;

import java.sql.Date;
import java.util.List;

public class Servicio {
	public void crearTodo(String nombre, Date fecha_limite) {
		boolean res=comprobarToDosSinCompletar();
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	public void agregarDireccionCorreoAAgenda(String direccion) {
		boolean res=comprobarToDosSinCompletar();
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	public void marcarTareaFinalizada(String id) {
		boolean res=comprobarToDosSinCompletar();
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	public List<ToDo> consultarToDosSinCompletar(String direccion) {
		boolean res=comprobarToDosSinCompletar();
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
	private boolean comprobarToDosSinCompletar() {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}
}
