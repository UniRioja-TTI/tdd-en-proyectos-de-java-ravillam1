package proyectoPunto4;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa a un repositorio
 */
public class Repositorio {
	
	private DB db;

	/*
	 * Constructor de la clase Repositorio
	 */
	public Repositorio(DB db) {
		this.db = db;
	}
	/*
	 * Busca un ToDo por id
	 * @param id id del ToDo a encontrar
	 * @return ToDo buscado
	 */
	public ToDo encontrarToDo(String id) {
		return db.readTodo(id);
	}

	/*
	 * Marca un ToDo como finalizado
	 * @param id id del ToDo a marcar
	 */
	public void marcarCompletadoToDo(String id) {
		ToDo todo = db.readTodo(id);
		if (todo == null) {
			throw new IllegalArgumentException("No existe ningún ToDo con id: " + id);
		}
		todo.setCompletado(true);
		db.updateTodo(todo);
	}

	/*
	 * Almacena un ToDo
	 * @param t ToDo a guardar
	 */
	public void guardarToDo(ToDo t) {
		db.createTodo(t);
	}

	/*
	 * Almacena un email
	 * @param email email a guardar
	 */
	public void guardarEmail(String email) {
		db.saveEmail(email);
	}
	
	/*
	 * Obtiene los ToDos vencidos
	 * @return lista de ToDos vencidos
	 */
	public List<ToDo> obtenerTodosVencidos() {
		Date hoy = new Date(System.currentTimeMillis());
		
		List<ToDo> vencidos = new ArrayList<>();
		List<ToDo> todos = db.getAllTodos();
		for (int i = 0; i < todos.size(); i++) {
	        ToDo t = todos.get(i);
	        if (!t.isCompletado() 
	                && t.getFecha_limite() != null 
	                && t.getFecha_limite().before(hoy)) {
	            
	            vencidos.add(t);
	        }
	    }
		return vencidos;
	}

	/*
	 * Obtiene los ToDos sin completar
	 * @return lista de ToDos sin completar
	 */
	public List<ToDo> obtenerSinCompletar() {
	    List<ToDo> todos = db.getAllTodos();
	    List<ToDo> sinCompletar = new ArrayList<>();

	    for (int i = 0; i < todos.size(); i++) {
	        ToDo t = todos.get(i);
	        if (!t.isCompletado()) {
	            sinCompletar.add(t);
	        }
	    }

	    return sinCompletar;
	}

	/*
	 * Obtiene los emails guardados
	 * @return lista de emails almacenados
	 */
	public List<String> obtenerEmails() {
		return db.getEmails();
	}
}
