package br.edu.univas.passageiro.dao;

import javax.persistence.EntityManager;

import br.edu.univas.passageiro.model.Reserva;

public class ReservaDAO extends GenericDAO<Reserva, Long> {

    public ReservaDAO(EntityManager entityManager) {
        super(entityManager);
    }

}
