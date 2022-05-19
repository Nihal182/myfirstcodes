import javax.swing.*;
class Programa02

{

  public static void main (String entrada[])

  {

          //declaração de variáveis

          int n1, n2, div;
          double pot;
		  String msg = " ";

          // entrada de dados
		  n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		  n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		  
          // processamento
		  div = (int)n1 / (int)n2;
		  pot = Math.pow(n1, n2);

          // saída de resultados
		 
		  msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " é = " +  div + "\n";

          msg = msg + "potência de " + n1 + " por " + n2 + " = " + pot + "\n";

        JOptionPane.showMessageDialog(null, msg);

         
          System.exit(0);

          
  }

}