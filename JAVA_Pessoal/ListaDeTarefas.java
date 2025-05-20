import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> tarefas = new ArrayList<>(); // Lista para armazenar as tarefas

        String menu = "\nEscolha uma opção: \n" +
                "1. Adicionar tarefa\n" +
                "2. Remover tarefa\n" +
                "3. Listar tarefas\n" +
                "4. Sair\n" +
                "Digite o número da opção desejada: ";

        // Loop para executar as operações até que o usuário escolha sair
        while (true) {
            System.out.print(menu); // Exibe o menu de opções
            String escolha = sc.nextLine(); // Lê a opção escolhida pelo usuário

            switch (escolha) {
                case "1":
                    System.out.print("\nDigite a tarefa a ser adicionada: ");
                    String tarefaAdicionar = sc.nextLine(); // Lê a tarefa a ser adicionada
                    tarefas.add(tarefaAdicionar); // Adiciona a tarefa à lista
                    break;
                case "2":
                    System.out.print("\nDigite o índice da tarefa a ser removida: ");
                    int indiceRemover = sc.nextInt() -1; // Lê o índice da tarefa a ser removida
                    sc.nextLine(); // Consome a quebra de linha pendente
                    if (indiceRemover >= 0 && indiceRemover < tarefas.size()) {
                        tarefas.remove(indiceRemover); // Remove a tarefa do índice especificado
                    } else {
                        System.out.println("\nÍndice inválido!"); // Exibe mensagem de erro se o índice for inválido
                    }
                    break;
                case "3":
                    System.out.println("\nLista de tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ": " + tarefas.get(i)); // Exibe a lista de tarefas
                    }
                    break;
                case "4":
                    System.out.println("\nSaindo..."); // Exibe mensagem de saída
                    sc.close(); // Fecha o scanner
                    return; // Encerra o programa
                default:
                    System.out.println("\nOpção inválida!"); // Exibe mensagem de erro se a opção for inválida
                    break;
            }
        }
    }
}