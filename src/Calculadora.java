import javax.swing.JOptionPane; // Importa a classe JOptionPane para exibir diálogos gráficos

public class Calculadora {
    public static void main(String[] args) {
        while (true) { // Loop infinito para manter a calculadora em execução até o usuário escolher sair
            // Exibir menu de operações
            String menu = "Escolha a operação:\n" +
                          "1. Adição (+)\n" +
                          "2. Subtração (-)\n" +
                          "3. Multiplicação (*)\n" +
                          "4. Divisão (/)\n" +
                          "5. Potência (^)\n" +
                          "6. Raiz Quadrada (√)\n" +
                          "7. Módulo (%)\n" +
                          "8. Sair";
            String escolha = JOptionPane.showInputDialog(menu); // Exibe o menu e obtém a escolha do usuário

            // Verificar se o usuário escolheu sair
            if (escolha.equals("8")) {
                break; // Sai do loop e encerra o programa
            }

            // Declaração de variáveis
            double num1 = 0, num2 = 0, resultado = 0;
            boolean isUnaryOperation = escolha.equals("6"); // Verifica se a operação é unária (raiz quadrada)

            // Obter entrada do usuário
            if (!isUnaryOperation) { // Se a operação não for unária
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: ").replace(',', '.')); // Obtém o primeiro número e substitui vírgula por ponto
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: ").replace(',', '.')); // Obtém o segundo número e substitui vírgula por ponto
            } else { // Se a operação for unária
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o número: ").replace(',', '.')); // Obtém o número e substitui vírgula por ponto
            }

            // Realizar a operação escolhida
            switch (escolha) {
                case "1":
                    resultado = num1 + num2; // Adição
                    break;
                case "2":
                    resultado = num1 - num2; // Subtração
                    break;
                case "3":
                    resultado = num1 * num2; // Multiplicação
                    break;
                case "4":
                    resultado = num1 / num2; // Divisão
                    break;
                case "5":
                    resultado = Math.pow(num1, num2); // Potência
                    break;
                case "6":
                    resultado = Math.sqrt(num1); // Raiz quadrada
                    break;
                case "7":
                    resultado = num1 % num2; // Módulo
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida!"); // Exibe mensagem de operação inválida
                    continue; // Volta ao início do loop
            }

            // Exibir o resultado
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado); // Exibe o resultado da operação
        }
    }
}