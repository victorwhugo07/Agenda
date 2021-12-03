package br.edu.ifba.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifba.basicas.Categoria;

public class CategoriaDao {
	
	EntityManager em = GetEntityManager.getConnectionJpa();
	
	public void adiciona(Categoria categoria) {
		

		
	}
	
	public Categoria procurarCategoriaId(int id) {
		
		return null;
		
	}
	
	public List<Categoria> listarCategorias(){
		
		return null;
		
	}
	
	public void atualizarCategoria(Categoria c) {
		
	
	}
	
	public void removerCategoriaId(Categoria c) {
		

		
	}
	
	public List<Categoria> procurarCategoriaNome(String nome) {
		
		
		
		return null;
		
	}
	
	

}
