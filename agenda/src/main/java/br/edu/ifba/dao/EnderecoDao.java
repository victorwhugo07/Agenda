package br.edu.ifba.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifba.basicas.Endereco;

public class EnderecoDao {
	
	EntityManager em = GetEntityManager.getConnectionJpa();

	public void adicionaEndereco(Endereco endereco) {
		
	
		
	}
	
	public Endereco procurarEnderecoId(int id) {
		
		return null;
		
	}
	
	public List<Endereco> listarEndereco(){
		
		return null;
		
	}
	
	public void atualizarEndereco(Endereco endereco) {
		
		
		
		
	}
	
	public void removerEndereco(Endereco endereco) {
		
	
		
	}
	
	public List<Endereco> procurarNomeRua(String rua){
		
		
		return null;
	}

}
