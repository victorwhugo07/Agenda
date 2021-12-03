package br.edu.ifba.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifba.basicas.Telefone;

public class TelefoneDao {
	
	EntityManager em = GetEntityManager.getConnectionJpa();

	public void adicionaTelefone(Telefone telefone) {
		
		
		
	}
	
	public Telefone procurarTelefoneId(int id) {
		
		return null;
		
	}
	
	public List<Telefone> listarTelefone(){
		
		return null;
		
	}
	
	public void atualizarTelefone(Telefone telefone) {
		
		
		
	}
	
	public void removerTelefone(Telefone telefone) {
		
		
		
	}
	
	public List<Telefone> procurarTelefoneNumero(String telefone){
		
		
		
		return null;
		
	}

}
