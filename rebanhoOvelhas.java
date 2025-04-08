import java.util.Scanner; // Importar scanner
import javax.swing.JOptionPane; // Importe de "Janelinha"


public class rebanhoOvelhas {
    public static void main (String[] args) {
    // Ler entrada do usuário
        Scanner scanner = new Scanner(System.in);
   


    // Variáveis


    int branca, marrom, negra, outraCor;
    int valorBrancas, valorMarrons, valorNegras, valorOutra;
    
   
   
   
    // Executando o Código

    while (true) 
    {
        branca = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas brancas: "));
        marrom = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas marrons: "));
        negra = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas negras: "));
        outraCor = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia de ovelhas outras cores: "));

        // Calculos de valores de ovelhas
        valorBrancas = branca * 250 ;
        valorMarrons = marrom * 200 ;
        valorNegras = negra * 300 ;
        valorOutra = outraCor * 180 ;

        // Valor de cada Ovelhas e Quantia
        JOptionPane.showMessageDialog(null, "Usada para produção de lã (Brancas) Quantia: " + branca + ("\n Valor em dinheiro: R$" + valorBrancas) ) ;
        JOptionPane.showMessageDialog(null, "Para estudo genético (Negras) Quantia: " + negra + ("\n Valor em dinheiro: R$" + valorNegras));
        JOptionPane.showMessageDialog(null, "Para venda (Marrons) Quantia: " + marrom + ("\n Valor em dinheiro: R$" + valorMarrons));
        JOptionPane.showMessageDialog(null, "Para avaliação (Outras cores) Quantia: " + outraCor + ("\n Valor em dinheiro: R$" + valorOutra));

        // Total de ovelhas
        JOptionPane.showMessageDialog(null, "A quantia total das ovelhas é de: " + (branca + marrom + negra + outraCor));

        // Valor de todas as Ovelhas
        JOptionPane.showMessageDialog(null, "O valor total em dinheiro das ovelhas é de: R$" + (valorBrancas + valorMarrons + valorNegras + valorOutra));

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer a recontagem?","Continuar", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.NO_OPTION){
            break; // Sai do Loop e encerra o código
        }
    }

    // Fechar o scanner
    scanner.close();



}  
}
