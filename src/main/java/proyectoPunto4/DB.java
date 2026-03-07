package proyectoPunto4;

public interface DB {
	public void createTodo(ToDo t);
	public ToDo readTodo(String id);
	public void updateTodo(ToDo t);
	public void deleteTodo(ToDo t);
}
