package br.edu.univas.passageiro;

import br.edu.univas.passageiro.view.MenuView;

public class Main {

    public static void main(String[] args) {
        MenuView menu = new MenuView();
        int opcao = menu.mostrarMenuOpcoes();
        menu.tratarOpcaoEscolhida(opcao);
    }
}
