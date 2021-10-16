package requerimiento2_JesusRodriguez;

	
public class Email {
	

	private String id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String cuerpo;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestinatario() {
		return destinatario;
	}

	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	@Override
	public String toString() {
		return " con la ID: " + id + ", al destinatario=" + destinatario + ", desde el remitente= " + remitente + ", con el asunto= " + asunto
				+ ", en el mensaje dice= " + cuerpo + "]";
	}
}
