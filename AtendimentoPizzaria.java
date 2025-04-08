// Código para o atendimento de uma pizzaria
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoPizzaria {
  
  public static void main (String[] args) {
    while (true) {
       // Exibir menu de quantia de sabores
        String menu = "Escolha a quantia de sabores:\n" +
                        "1. Pizza Mini - 1 sabor\n" +
                        "2. Pizza Média - 2 sabores\n" +
                        "3. Pizza Grande - 3 sabores\n" +
                        "4. Pizza Gigante - 4 sabores\n" +
                        "5. Sair";
        String escolha = JOptionPane.showInputDialog(menu); // Exibe o menu e obtém a escolha do usuário

        // Verificar se o usuário escolheu sair
        if (escolha.equals("5")) {
            break; // Sai do loop e encerra o programa
        }
        
        // Declaração de variáveis
        int qtdSabores = 0;
        // Realizar a operação escolhida
        switch(escolha) {
            case "1":
                qtdSabores = 1;
                break;
            case "2":
                qtdSabores = 2;
                break;
            case "3":
                qtdSabores = 3;
                break;
            case "4":
                qtdSabores = 4;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!"); // Exibe mensagem de operação inválida
                continue; // Volta ao início do loop
        }

        // Lista para armazenar os sabores escolhidos
        List<String> saboresEscolhidos = new ArrayList<>();

        // Exibir menu de sabores
        String menuSabores = "Escolha os sabores desejados:\n" +
                                "1. Calabresa\n" +
                                "2. 4 Queijos\n" +
                                "3. Frango com Catupiry\n" +
                                "4. Portuguesa\n" +
                                "5. 5 Queijos\n" +
                                "6. Costela com Cheddar\n" +
                                "7. Sair";

        for (int i = 0; i < qtdSabores; i++) {
            String saborEscolhido = JOptionPane.showInputDialog(menuSabores); // Exibe o menu de sabores e obtém a escolha do usuário
            if (saborEscolhido.equals("7")) {
                break; // Sai do loop e encerra a escolha de sabores
            }
            // Mapear o número do sabor para o nome do sabor
            String nomeSabor = "";
            switch(saborEscolhido) {
                case "1":
                    nomeSabor = "Calabresa";
                    break;
                case "2":
                    nomeSabor = "4 Queijos";
                    break;
                case "3":
                    nomeSabor = "Frango com Catupiry";
                    break;
                case "4":
                    nomeSabor = "Portuguesa";
                    break;
                case "5":
                    nomeSabor = "5 Queijos";
                    break;
                case "6":
                    nomeSabor = "Costela com Cheddar";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não encontrada!"); // Exibe mensagem de operação inválida
                    i--; // Decrementa o contador para permitir uma nova escolha
                    continue; // Volta ao início do loop
            }
            // Adiciona o sabor escolhido à lista
            saboresEscolhidos.add(nomeSabor);
        }

        // Exibir os sabores escolhidos
        StringBuilder sabores = new StringBuilder("Sabores escolhidos:\n");
        for (String sabor : saboresEscolhidos) {
            sabores.append(sabor).append("\n");
        }
        JOptionPane.showMessageDialog(null, sabores.toString());
        

        // Perguntar ao usuário se deseja pizza doce
        int respostaPizzaDoce = JOptionPane.showConfirmDialog(null, "Deseja adicionar pizza doce?", "Pizza Doce", JOptionPane.YES_NO_OPTION);
        if (respostaPizzaDoce == JOptionPane.YES_OPTION) {
            // Exibir menu de quantia de sabores para pizza doce
            String menuPizzaDoce = "Escolha a quantia de pizzas doce:\n" +
                                    "1. Uma pizza doce\n" +
                                    "2. Duas pizzas doce\n" +
                                    "3. Três pizzas doce\n" +
                                    "4. Quatro pizzas doce\n" +
                                    "5. Não desejo pizza doce";
            String escolhaPizzaDoce = JOptionPane.showInputDialog(menuPizzaDoce); // Exibe o menu e obtém a escolha do usuário

            // Verificar se o usuário escolheu não desejar pizza doce
            if (escolhaPizzaDoce.equals("5")) {
                break; // Sai do loop e encerra o programa
            }

            // Declaração de variáveis para pizza doce
            int qtdSaboresPizzaDoce = 0;
            
            // Realizar a operação escolhida para pizza doce
            switch(escolhaPizzaDoce) {
                case "1":
                    qtdSaboresPizzaDoce = 1;
                    break;
                case "2":
                    qtdSaboresPizzaDoce = 2;
                    break;
                case "3":
                    qtdSaboresPizzaDoce = 3;
                    break;
                case "4":
                    qtdSaboresPizzaDoce = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não encontrada!"); // Exibe mensagem de operação inválida
                    continue; // Volta ao início do loop
            }
            
            // Lista para armazenar os sabores escolhidos para pizza doce
            List<String> saboresPizzaDoceEscolhidos = new ArrayList<>();
            
            // Exibir menu de sabores para pizza doce
            String menuSaboresPizzaDoce = "Escolha os sabores desejados para pizza doce:\n" +
                                            "1. Chocolate\n" +
                                            "2. Morango\n" +
                                            "3. Charge\n" +
                                            "4. Romeu e Julieta\n" +
                                            "5. Prestígio\n" +
                                            "6. Sair";
            for (int i = 0; i < qtdSaboresPizzaDoce; i++) {
             String saborPizzaDoceEscolhido = JOptionPane.showInputDialog(menuSaboresPizzaDoce); // Exibe o menu de sabores e obtém a escolha do usuário

            if (saborPizzaDoceEscolhido.equals("6")) {
        break; // Sai do loop e encerra a escolha de sabores
    }
             // Mapear o número do sabor para o nome do sabor
              String nomeSaborPizzaDoce = "";
         switch (saborPizzaDoceEscolhido) {
        case "1":
            nomeSaborPizzaDoce = "Chocolate";
            break;
        case "2":
            nomeSaborPizzaDoce = "Morango";
            break;
        case "3":
            nomeSaborPizzaDoce = "Charge";
            break;
        case "4":
            nomeSaborPizzaDoce = "Romeu e Julieta";
            break;
        case "5":
            nomeSaborPizzaDoce = "Prestígio";
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção não encontrada!"); // Exibe mensagem de operação inválida
            i--; // Decrementa o contador para permitir uma nova escolha
            continue; // Volta ao início do loop
    }
    // Adiciona o sabor escolhido à lista de sabores para pizza doce
    saboresPizzaDoceEscolhidos.add(nomeSaborPizzaDoce);
}

            // Exibir os sabores escolhidos para pizza doce após o loop
            StringBuilder saboresPizzaDoce = new StringBuilder("Sabores escolhidos para pizza doce:\n");
            for (String sabor : saboresPizzaDoceEscolhidos) {
                saboresPizzaDoce.append(sabor).append("\n");
}
            JOptionPane.showMessageDialog(null, saboresPizzaDoce.toString());


        // Perguntar se o usuário deseja sair ou pedir outra pizza
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer outro pedido?", "Continuar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.NO_OPTION) {
            break; // Sai do loop e encerra o programa
        }
    }
        else {
        // Perguntar se o usuário deseja sair ou pedir outra pizza
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer outro pedido?", "Continuar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.NO_OPTION) {
            break; // Sai do loop e encerra o programa
        }
    }

  }
}
}
