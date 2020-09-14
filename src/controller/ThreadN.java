package controller;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Random;

public class ThreadN extends Thread {
	private JTextField tf;
	private JButton btJogar;
	private static int i;
	private static String resultados[];
	ThreadN(JTextField tf, JButton btJogar){
		this.tf = tf;
		this.btJogar = btJogar;
		i = 0; //contador de threads que terminaram seu trabalho
		resultados = new String[3];
	}
	
	private void rollDice(){
		Random random = new Random();
		btJogar.setVisible(false);
		int qtd = 0; // número de vezes que a roleta girará.
		int n = 0; //número sorteado
			qtd = random.nextInt(149)+1;
			for (int i=0;i<qtd;i++){
				n = random.nextInt(6)+1;
				tf.setText(Integer.toString(n));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
			resultados[i] = tf.getText();
			i++;
			if (i == 3){
				btJogar.setVisible(true);
				btJogar.setVisible(true);
				if (resultados[0] == resultados[1] && resultados[1] == resultados[2]){
					JOptionPane.showMessageDialog(null, "PARABÉNS, VOCE GANHOU");
				}else{
					JOptionPane.showMessageDialog(null, "VOCE PERDEU :(((");
				}
			}
	}
	public void run() {
		rollDice();
	}
	
}
