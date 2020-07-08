package br.edu.univas.passageiro.view;

import java.util.Date;

import br.edu.univas.passageiro.model.Passageiro;
import br.edu.univas.passageiro.service.PassageiroService;

public class PassageiroView {
    PassageiroService passageiroService = new PassageiroService();
    
    public void criarPassageiro() {
        Passageiro passageiro = new Passageiro();
        passageiro.setNome("Daniela");
        passageiro.setCpf("09162503693");
        passageiro.setCidade("Pouso Alegre");
        passageiro.setBairro("Foch");
        passageiro.setEstado("MG");
        passageiro.setEmail("danielaedvana@gmail.com");
        passageiro.setNumero(58);
        passageiro.setCep("37540000");
        passageiro.setDataNascimento(new Date());
        passageiroService.save(passageiro);
    }

}
