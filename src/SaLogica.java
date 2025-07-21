import java.util.Scanner;

public class SaLogica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar o número de vendedores
        System.out.print("Digite o número de vendedores: ");
        int numVendedores = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        // Arrays para armazenar os nomes dos vendedores e suas vendas
        String[] vendedores = new String[numVendedores];
        double[][] vendas = new double[numVendedores][5]; // Matriz para vendas (vendedores x dias)
        double[] totalVendas = new double[numVendedores]; // Total de vendas semanais por vendedor

        // Array com os nomes dos dias úteis
        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        // Inserir os nomes dos vendedores e suas vendas
        for (int i = 0; i < numVendedores; i++) {
            System.out.print("Digite o nome do vendedor " + (i + 1) + ": ");
            vendedores[i] = sc.nextLine();

            System.out.println("Digite as vendas realizadas por " + vendedores[i] + " nos 5 dias úteis:");
            for (int j = 0; j < 5; j++) {
                System.out.print(diasDaSemana[j] + ": R$ ");
                vendas[i][j] = sc.nextDouble();
                totalVendas[i] += vendas[i][j]; // Soma as vendas para calcular o total semanal
            }
            sc.nextLine(); // Consumir a quebra de linha
        }

        // Relatório final
        System.out.println("\n============================================================");
        System.out.println(" RELATÓRIO DE VENDAS SEMANAIS");
        System.out.println("============================================================");
        System.out.printf("| %-16s | %-13s | %-13s | %-8s |\n", "Vendedor", "Total Vendido", "Classificação", "Bônus");
        System.out.println("+------------------------------------------------------------------------+");

        String melhorVendedor = "";
        double maiorVenda = 0;

        for (int i = 0; i < numVendedores; i++) {
            // Classificação e bonificação
            String classificacao;
            double bonificacao = 0;

            if (totalVendas[i] >= 5000) {
                classificacao = "Excelente";
                bonificacao = totalVendas[i] * 0.10;
            } else if (totalVendas[i] >= 3000) {
                classificacao = "Bom";
                bonificacao = totalVendas[i] * 0.05;
            } else {
                classificacao = "Regular";
            }

            // Identificar o melhor vendedor
            if (totalVendas[i] > maiorVenda) {
                maiorVenda = totalVendas[i];
                melhorVendedor = vendedores[i];
            }

            // Exibir informações do vendedor
            System.out.printf("| %-16s | R$ %10.2f | %-13s | R$ %8.2f |\n",
                    vendedores[i], totalVendas[i], classificacao, bonificacao);
        }

        System.out.println("+------------------------------------------------------------------------+");
        System.out.printf("MELHOR VENDEDOR DA SEMANA: %s (R$ %.2f)\n", melhorVendedor, maiorVenda);
        System.out.println("============================================================");

        sc.close();
    }
}