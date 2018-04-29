package listaconvidados.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="convidados")
public class Convidado {
	@Id @Column(name="convidadoid")
	private Integer convidadoId;
	@Column(name="nome")
	private String nomeConvidado;
	@Column(name="email")
	private String emailConvidado;
	public Convidado() {
	}
	public Convidado(Integer Id, String nome, String email) {
		convidadoId = Id;
		nomeConvidado = nome;
		emailConvidado = email;
	}

	public Integer getConvidadoId() {
		return convidadoId;
	}

	public void setConvidadoId(Integer convidadoId) {
		this.convidadoId = convidadoId;
	}

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public String getEmailConvidado() {
		return emailConvidado;
	}

	public void setEmailConvidado(String emailConvidado) {
		this.emailConvidado = emailConvidado;
	}
	
	
	
}
