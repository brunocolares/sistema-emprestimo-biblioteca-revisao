package model.entities;

import java.util.Date;
import java.util.List;

public class Usuario {
	
	private String nomeCompleto;
	private String cpf;
	private Date dataNascimento;
	private List<Emprestimo> emprestimos;
	
	public Usuario() {
		
	}
	
	public Usuario(String nomeCompleto, String cpf, Date dataNascimento) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
