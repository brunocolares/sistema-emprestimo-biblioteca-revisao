package model.entities;

import java.util.Date;

public class Emprestimo {
	
	private Usuario usuario;
	private Livro livro;
	private Date dataEmprestimo;
	private Date dataPrevistaDevolucao;
	
	public Emprestimo() {
		
	}
	
	public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo, Date dataPrevistaDevolucao) {
		this.usuario = usuario;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public Date getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}
	
	public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
}
