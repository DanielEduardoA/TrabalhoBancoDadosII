package br.edu.univas.passageiro.service;

import java.util.List;

import br.edu.univas.passageiro.HibernateUtil;
import br.edu.univas.passageiro.dao.PassageiroDAO;
import br.edu.univas.passageiro.model.Passageiro;

public class PassageiroService {

    private PassageiroDAO dao;

    public PassageiroService() {
        this.dao = new PassageiroDAO(HibernateUtil.getEntityManager());
    }

    public void save(Passageiro passageiro) {
        dao.save(passageiro);
    }

    public void update(Passageiro passageiro) {
        dao.update(passageiro);
    }

    public void delete(Passageiro passageiro) {
        dao.delete(passageiro);
    }

    public Passageiro getById(long id) {
        return dao.getById(id);
    }

    public List<Passageiro> getAll() {
        return dao.getAll();
    }
}
