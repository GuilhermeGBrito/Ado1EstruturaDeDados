package Ado;

public class Vetor {
    private String[] contatos;
    private int tamanho;

    public Vetor(int capacidade) {
        contatos = new String[capacidade];
        tamanho = 0;
    }

    public void adicionarContato(String nome) {
        if (tamanho < contatos.length) {
            contatos[tamanho] = nome;
            tamanho++;
            System.out.println("Contato adicionado com sucesso.");
        } else {
            System.out.println("Lista de contatos está cheia. Não é possível adicionar mais contatos.");
        }
    }

    public void removerContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equalsIgnoreCase(nome)) {
                for (int j = i; j < tamanho - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                tamanho--;
                System.out.println("Contato removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public void listarContatos() {
        if (tamanho == 0) {
            System.out.println("Lista de contatos vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println(contatos[i]);
            }
        }
    }

    public boolean pesquisarContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contatos[i]);
                return true;
            }
        }
        System.out.println("Contato não encontrado.");
        return false;
    }
}
