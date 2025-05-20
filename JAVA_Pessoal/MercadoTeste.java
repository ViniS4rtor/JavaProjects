import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MercadoTeste {
    public static void main(String[] args) {
        // Lista para armazenar os produtos escolhidos e suas quantidades
        List<String> produtosEscolhidos = new ArrayList<>();

        // Exibir menu de produtos
        String menu = "Lista de Produtos\n" +
                      "1. Arroz 1kg\n" +
                      "2. Feijão 1kg\n" +
                      "3. Macarrão 1kg\n" +
                      "4. Carne 1kg\n" +
                      "5. Frango 1kg\n" +
                      "6. Peixe 1kg\n" +
                      "7. Sair\n\n" +
                      "Digite os números dos produtos separados por vírgula (ex: 1,3,5):";
        String escolhas = JOptionPane.showInputDialog(menu);

        // Verificar se o usuário escolheu sair
        if (escolhas == null || escolhas.trim().equals("7")) {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado.");
            return;
        }

        // Dividir as escolhas por vírgula
        String[] escolhasArray = escolhas.split(",");
        for (String escolha : escolhasArray) {
            escolha = escolha.trim(); // Remover espaços em branco
            String produto = "";

            // Determinar o produto com base na escolha
            switch (escolha) {
                case "1":
                    produto = "Arroz 1kg";
                    break;
                case "2":
                    produto = "Feijão 1kg";
                    break;
                case "3":
                    produto = "Macarrão 1kg";
                    break;
                case "4":
                    produto = "Carne 1kg";
                    break;
                case "5":
                    produto = "Frango 1kg";
                    break;
                case "6":
                    produto = "Peixe 1kg";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida: " + escolha);
                    continue;
            }

            // Verificar se o produto já foi escolhido
            boolean jaEscolhido = false;
            for (String item : produtosEscolhidos) {
                if (item.startsWith(produto)) {
                    JOptionPane.showMessageDialog(null, "O produto " + produto + " já foi escolhido.");
                    jaEscolhido = true;
                    break;
                }
            }
            if (jaEscolhido) {
                continue;
            }

            // Solicitar a quantidade do produto escolhido
            String quantidadeStr = JOptionPane.showInputDialog("Digite a quantidade de " + produto + ":");
            int quantidade;
            try {
                quantidade = Integer.parseInt(quantidadeStr);
                if (quantidade <= 0) {
                    JOptionPane.showMessageDialog(null, "Quantidade inválida! Tente novamente.");
                    continue;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.");
                continue;
            }

            // Adicionar o produto e a quantidade à lista
            produtosEscolhidos.add(produto + " - Quantidade: " + quantidade);
        }

        // Exibir os produtos escolhidos ao final
        if (produtosEscolhidos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado.");
        } else {
            StringBuilder resumo = new StringBuilder("Produtos escolhidos:\n");
            for (String item : produtosEscolhidos) {
                resumo.append(item).append("\n");
            }
            JOptionPane.showMessageDialog(null, resumo.toString());
        }
    }
}