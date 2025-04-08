import java.util.Scanner; // Importar scanner
import javax.swing.JOptionPane;


public class ImpostoRenda {
    public static void main (String[] args) {
    // Ler entrada do usuário
        Scanner sc = new Scanner(System.in);
   


    // Variáveis


    float rendaBruta;
    double imposto;
   
   
    // Executando o Código

        while (true) {
            
        

    rendaBruta = Integer.parseInt(JOptionPane.showInputDialog("Insira a renda bruta: "));


    if (rendaBruta <= 2500 ) {
        JOptionPane.showMessageDialog(null, "Isento de Imposto.");
        imposto = 0;

    } else if (rendaBruta <= 5000 ) {
        JOptionPane.showMessageDialog(null, "10% de Imposto.");
        imposto = rendaBruta * 0.10;

    }   else if (rendaBruta <= 10000 ) {
        JOptionPane.showMessageDialog(null, "20% de Imposto.");
        imposto = rendaBruta * 0.20;

    }   else {
        JOptionPane.showMessageDialog(null, "27,5% de Imposto.");
        imposto = rendaBruta * 0.275;

    }
    JOptionPane.showMessageDialog(null, "Imposto: " + imposto);


    JOptionPane.showMessageDialog(null, "Salário Liquido: " + (rendaBruta - imposto));


    int resposta = JOptionPane.showConfirmDialog(null, "Deseja imprimir outra imposto?","Continuar", JOptionPane.YES_NO_OPTION);
    if (resposta == JOptionPane.NO_OPTION){
        break; // Sai do Loop e encerra o código
    }

    // Fechar o scanner
    sc.close();

}

        


}  
}

