import java.util.Scanner; // Importar scanner
import javax.swing.JOptionPane;

public class CalculoIMC {
    public static void main (String[] args) {
    // Ler entrada do usuário
                Scanner scanner = new Scanner(System.in);
           
           
           
           // Variáveis


              double peso;
                double altura;
                double imc;
                String classificacao;

                // Executando o Código

                peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso: "));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura: "));
                imc = peso / (altura * altura);

                if (imc < 18.5) {
                    classificacao = "Abaixo do Peso";
                } else if (imc < 25) {
                    classificacao = "Peso Normal";
                } else if (imc < 30) {
                    classificacao = "Sobrepeso";
                } else if (imc < 35) {
                    classificacao = "Obesidade Grau 1";
                } else if (imc < 40) {
                    classificacao = "Obesidade Grau 2";
                } else {
                    classificacao = "Obesidade Grau 3";
                }

                JOptionPane.showMessageDialog(null, "IMC: " + imc + "\nClassificação: " + classificacao);
            

                // Fechar o scanner
                scanner.close();
           
           
           
          }
  }