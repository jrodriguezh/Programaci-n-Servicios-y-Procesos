package e2.Emails;
	//Creamos la clase email con todos sus getters y setters
public class Email {
	private int id;
	private String destino;
	private String remite;
	private String cuerpo;
	private String asunto;
	private String Email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getRemite() {
		return remite;
	}
	public void setRemite(String remite) {
		this.remite = remite;
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
		return "Emails [id=" + id + ", asunto=" + asunto + ", destino=" + destino + ", remite=" + remite + ", cuerpo=" + cuerpo + "]";
	}

}
