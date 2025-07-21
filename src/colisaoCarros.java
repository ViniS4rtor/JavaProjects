import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class colisaoCarros {
    public static void main(String[] args) {
        // Variáveis
        double massaPrimeiro, massaSegundo, velocidadePrimeiro, velocidadeSegundo, velocidadeFinal;
        double cineticaLiberada, cineticaInicial, cineticaFinal, deformacao, aceleracaoMediaMs, aceleracaoMediaKm,
                forcaG;

        // Criar um formatador para limitar a 2 casas decimais
        DecimalFormat df = new DecimalFormat("#.##");

        while (true) {

            // Entrada de dados
            massaPrimeiro = Double.parseDouble(JOptionPane.showInputDialog("Insira a massa em Kg do 1° carro: "));
            massaSegundo = Double.parseDouble(JOptionPane.showInputDialog("Insira a massa em Kg do 2° carro: "));
            velocidadePrimeiro = Double
                    .parseDouble(JOptionPane.showInputDialog("Insira a velocidade em Km/h do 1° carro: "));
            velocidadeSegundo = Double
                    .parseDouble(JOptionPane.showInputDialog("Insira a velocidade em Km/h do 2° carro: "));

            // Conversão de velocidade para m/s
            velocidadePrimeiro = velocidadePrimeiro * 1000 / 3600;
            velocidadeSegundo = velocidadeSegundo * 1000 / 3600;

            // Cálculo da velocidade final
            velocidadeFinal = (massaPrimeiro * velocidadePrimeiro + massaSegundo * velocidadeSegundo) /
                    (massaPrimeiro + massaSegundo);
            JOptionPane.showMessageDialog(null,
                    "A velocidade final após a colisão é de: " + df.format(velocidadeFinal) + " m/s");

            // Cálculo da energia cinética inicial
            cineticaInicial = 0.5 * massaPrimeiro * Math.pow(velocidadePrimeiro, 2) +
                    0.5 * massaSegundo * Math.pow(velocidadeSegundo, 2);
            JOptionPane.showMessageDialog(null,
                    "A energia cinética inicial é de: " + df.format(cineticaInicial) + " J");

            // Cálculo da energia cinética final
            cineticaFinal = 0.5 * (massaPrimeiro + massaSegundo) * Math.pow(velocidadeFinal, 2);
            JOptionPane.showMessageDialog(null, "A energia cinética final é de: " + df.format(cineticaFinal) + " J");

            // Cálculo da energia cinética liberada
            cineticaLiberada = cineticaInicial - cineticaFinal;
            JOptionPane.showMessageDialog(null,
                    "A energia cinética liberada é de: " + df.format(cineticaLiberada) + " J");

            // Entrada da deformação com validação

            while (true) {
                try {
                    deformacao = Double.parseDouble(JOptionPane.showInputDialog(
                            "Insira a distância da deformação dos corpos durante a colisão (em metros, entre 0.5 e 1.0): "));
                    if (deformacao >= 0.5 && deformacao <= 1.0) {
                        break; // Sai do loop se o valor for válido
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Valor inválido! A deformação deve estar entre 0.5 e 1.0 metros.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, insira um número válido.");
                }
            }

            // Cálculo da aceleração média
            aceleracaoMediaMs = cineticaLiberada / ((massaPrimeiro + massaSegundo) * deformacao);
            aceleracaoMediaKm = aceleracaoMediaMs * 3600 / 1000;
            JOptionPane.showMessageDialog(null,
                    "A aceleração média (km/h) durante o impacto foi de: " + df.format(aceleracaoMediaKm));

            // Cálculo da força G
            forcaG = aceleracaoMediaMs / 9.81;
            JOptionPane.showMessageDialog(null, "A força G alcançada foi de: " + df.format(forcaG));

            // Mensagem final consolidada
            JOptionPane.showMessageDialog(null,
                    "Resumo dos resultados:\n" +
                            "Velocidade final após a colisão: " + df.format(velocidadeFinal) + " m/s\n" +
                            "Energia cinética inicial: " + df.format(cineticaInicial) + " J\n" +
                            "Energia cinética final: " + df.format(cineticaFinal) + " J\n" +
                            "Energia cinética liberada: " + df.format(cineticaLiberada) + " J\n" +
                            "Aceleração média: " + df.format(aceleracaoMediaKm) + " km/h\n" +
                            "Força G: " + df.format(forcaG));

            if (forcaG < 1) {
                JOptionPane.showMessageDialog(null, "Possivelmente a pessoa sobreviveu, porém pode ter se machucado.");
            } else if (forcaG > 1 && forcaG < 3) {
                JOptionPane.showMessageDialog(null, "Pode ter sobrevivido, porém grandes danos.");
            } else if (forcaG > 3 && forcaG < 5) {
                JOptionPane.showMessageDialog(null,
                        "A pessoa provavelmente não sobreviveu, com sorte pode sobreviver.");
            } else if (forcaG > 5 && forcaG < 7) {
                JOptionPane.showMessageDialog(null,
                        "A pessoa provavelmente não sobreviveu, com sorte da para enterra-la .");
            } else if (forcaG > 7 && forcaG < 10) {
                JOptionPane.showMessageDialog(null, "Tenha certeza que morreu, se der para cremar é lucro.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "A pessoa foi completamente evaporado e obliterado da terra, aniquilado completamente, se o carro estiver minimamente reconhecivel você estará muitooo no lucro. ");
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja recaucular o valor?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                break; // Sai do Loop e encerra o código
            }

        }
    }
}
