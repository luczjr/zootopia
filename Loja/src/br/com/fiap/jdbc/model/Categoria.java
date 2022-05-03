package br.com.fiap.jdbc.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private int idCategoria;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();
	public Categoria() {
			
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
		public void adicionar(Produto produto) {
			produtos.add(produto);		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		produtos = produtos;
	}
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nome=" + nome + ", produtos=" + produtos + "]";
	}
	
	
}
