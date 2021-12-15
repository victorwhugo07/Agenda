package br.edu.ifba.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.ifba.basicas.Endereco;

public class EnderecoDao {
	
	EntityManager em = GetEntityManager.getConnectionJpa();

	public void adicionaEndereco(Endereco endereco) {
		
		em.getTransaction().begin();
		em.persist(endereco);
		em.getTransaction().commit();
		
	}
	
	public Endereco procurarEnderecoId(int id) {
		
		return em.find(Endereco.class, id);
		
	}
	
	public List<Endereco> listarEndereco(){
		
		return em.createQuery("select e from Endereco e", Endereco.class).getResultList();
		
	}
	
	public void atualizarEndereco(Endereco endereco) {
		
		em.getTransaction().begin();
		em.merge(endereco);
		em.getTransaction().commit();
		
	}
	
	public void removerEndereco(Endereco endereco) {
		
		em.getTransaction().begin();
		em.remove(endereco);
		em.getTransaction().commit();
		
	}
	
	public List<Endereco> procurarNomeRua(String rua){
		
		TypedQuery<Endereco> query = em.createQuery("SELECT e FROM Endereco e WHERE t.rua = :r", Endereco.class);
	    return query.setParameter("r", rua).getResultList();

	}

}
