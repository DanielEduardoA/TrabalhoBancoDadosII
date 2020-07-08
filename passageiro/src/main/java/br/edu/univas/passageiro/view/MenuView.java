package br.edu.univas.passageiro.view;

import java.util.Scanner;

public class MenuView {
    public int mostrarMenuOpcoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        System.out.println("-------------------------\n");
        System.out.println("1 - Inserir Passageiro");
        System.out.println("2 - Atualizar passageiro");
        System.out.println("3 - Apagar passageiro");
        System.out.println("4 - Listar todos os passageiros");
        System.out.println("5 - Pesquisar passageiro pelo nome");
        System.out.println("6 - Pesquisar passageiro pelo cpf");
        System.out.println("20 - Quit");

        System.out.println("-------------------------\n");

        System.out.print("Digite a opção escolhida: ");
        return scanner.nextInt();
    }

    public void tratarOpcaoEscolhida(int opcao) {
        PassageiroView passageiroView = new PassageiroView();
        switch (opcao) {
            case 1:
                passageiroView.criarPassageiro();
                break;
            case 2:
                // Perform "encrypt number" case.
                break;
            case 3:
                // Perform "decrypt number" case.
                break;
            case 4:
                // Perform "quit" case.
                break;
            default:
                System.out.print("Opção inválida!");
        }
    }
}
