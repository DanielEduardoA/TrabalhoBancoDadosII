package br.edu.univas.passageiro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_reserva", nullable = false)
    private Date dataReserva;
    
    @Column(name = "hora_reserva", nullable = false)
    private long horaReserva;

    @ManyToOne
    @JoinColumn(name="passageiro_fk")
    private Passageiro passageiro;
}
