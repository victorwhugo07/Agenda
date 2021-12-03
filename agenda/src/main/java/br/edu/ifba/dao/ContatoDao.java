package br.edu.ifba.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifba.basicas.Contato;

public class ContatoDao {
	
	EntityManager em = GetEntityManager.getConnectionJpa();
	
	public void adicionaContato(Contato contato) {
		
	
		
	}
	
	public Contato procurarContatoId(int id) {
		
		return null;
		
	}
	
	public List<Contato> listarContato(){
		
		return null;
	}
	
	public void atualizarContato(Contato c) {
		
	
		
	}
	
	public void removerContato(Contato c) {
		
	
		
	}
	
	public List<Contato> procurarContatoNome(String nome) {
		
		
		
		return null;
		
	}
	
	
	
	

}
