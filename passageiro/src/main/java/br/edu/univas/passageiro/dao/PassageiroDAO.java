package br.edu.univas.passageiro.dao;

import javax.persistence.EntityManager;

import br.edu.univas.passageiro.model.Passageiro;

public class PassageiroDAO extends GenericDAO<Passageiro, Long> {

    public PassageiroDAO(EntityManager entityManager) {
        super(entityManager);
    }
}
