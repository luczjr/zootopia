package br.com.fiap.jdbc.model;

public class Produto {
	
	private	int idProduto;
	private	String nome;
	private	String descricao;
	private	int idCategoria;
	
	public Produto(int idProduto, String nome, String descricao) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
	}
	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", descricao=" + descricao + ", idCategoria="
				+ idCategoria + "]";
	}
	
	}
	
		
		




