package proyectoPunto4;

import java.util.Map;

public class DBStub implements DB {

	private Map<Integer,ToDo> database;
	@Override
	public void createTodo(ToDo t) {
		throw new UnsupportedOperationException("Clase aún no implementada.");

	}

	@Override
	public ToDo readTodo(String id) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}

	@Override
	public void updateTodo(ToDo t) {
		throw new UnsupportedOperationException("Clase aún no implementada.");

	}

	@Override
	public void deleteTodo(ToDo t) {
		throw new UnsupportedOperationException("Clase aún no implementada.");
	}

}
