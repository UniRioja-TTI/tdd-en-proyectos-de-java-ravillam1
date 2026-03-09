package proyectoPunto4;
/**
 * Interfaz que representa al Mailer
 */
public interface Mailer {
	/*
	 * Envía un correo
	 * @param sireccion direccion a donde se envía
	 * @param mensaje mensaje del correo
	 */
	public boolean enviarCorreo(String sireccion, String mensaje);
}
