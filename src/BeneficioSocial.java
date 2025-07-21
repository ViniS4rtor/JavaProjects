
import java.util.Scanner; // Importar scanner
import javax.swing.JOptionPane;

public class BeneficioSocial {

  public static void main(String[] args) {
    // Ler entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Variáveis
    float rendaPessoa;
    float dependentesPessoa;

    // Executando o Código

    while (true) {
      dependentesPessoa = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de dependentes: "));

      rendaPessoa = Integer.parseInt(JOptionPane.showInputDialog("Insira sua renda mensal: "));

      if (rendaPessoa <= 1500.00) {
        JOptionPane.showMessageDialog(null, "Classe Baixa - tem direito ao benefício.");

      } else if (rendaPessoa <= 3500.00 && dependentesPessoa > 3) {
        JOptionPane.showMessageDialog(null, "Classe Baixa - tem direito ao benefício.");

      } else if (rendaPessoa <= 3500.00 && dependentesPessoa <= 3) {
        JOptionPane.showMessageDialog(null, "Classe média baixa - análise de elegibilidade");
      }

      else if (rendaPessoa <= 7500.00 && dependentesPessoa > 3) {
        JOptionPane.showMessageDialog(null, "Classe média baixa - análise de elegibilidade");

      } else if (rendaPessoa <= 7500.00 && dependentesPessoa <= 3) {
        JOptionPane.showMessageDialog(null, "Classe Média - Sem direito ao benefício.");

      } else if (rendaPessoa > 7500.00 && dependentesPessoa > 3) {
        JOptionPane.showMessageDialog(null, "Classe Média - Sem direito ao benefício.");

      } else {
        JOptionPane.showMessageDialog(null, "Classe Alta - Sem direito ao benefício");

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja rever os benefícios?", "Continuar",
            JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.NO_OPTION) {
          break; // Sai do Loop e encerra o código

        }
        // Fechar o scanner
        scanner.close();
      }
    }
  }
}
