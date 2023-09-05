package Ado;

import java.util.Scanner;

public class TesteContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetorContatos = new Vetor(10);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Pesquisar Contato");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato a ser adicionado: ");
                    String nomeAdicionar = scanner.nextLine();
                    vetorContatos.adicionarContato(nomeAdicionar);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    vetorContatos.removerContato(nomeRemover);
                    break;
                case 3:
                    vetorContatos.listarContatos();
                    break;
                case 4:
                    System.out.print("Digite o nome do contato a ser pesquisado: ");
                    String nomePesquisar = scanner.nextLine();
                    vetorContatos.pesquisarContato(nomePesquisar);
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
