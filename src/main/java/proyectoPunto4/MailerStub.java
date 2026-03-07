package proyectoPunto4;

public class MailerStub implements Mailer{
	public boolean enviarCorreo(String direccion, String mensaje) {
		System.out.println("Dirección: "+direccion+" - Mensaje: "+mensaje);
		return true;
	}
}
