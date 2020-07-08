package br.edu.univas.passageiro.service;

import java.util.List;

import br.edu.univas.passageiro.HibernateUtil;
import br.edu.univas.passageiro.dao.ReservaDAO;
import br.edu.univas.passageiro.model.Reserva;

public class ReservaService {

    private ReservaDAO dao;

    public ReservaService() {
        this.dao = new ReservaDAO(HibernateUtil.getEntityManager());
    }
    
    public void save(Reserva reserva) {
        dao.save(reserva);
    }

    public void update(Reserva reserva) {
        dao.update(reserva);
    }

    public void delete(Reserva reserva) {
        dao.delete(reserva);
    }

    public Reserva getById(long id) {
        return dao.getById(id);
    }

    public List<Reserva> getAll() {
        return dao.getAll();
    }

}
