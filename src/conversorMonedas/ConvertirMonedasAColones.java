package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAColones {
	
	private static final double Dolar = 538;
	private static final double Euro = 598.33;
	private static final double LibraExt = 698.29;
	private static final double Yen = 3.84;
	private static final double Won = 0.42;


	public void DolarColones(double valor) {
		double resultadoDcolon = valor * Dolar;
		resultadoDcolon = (double) Math.round(resultadoDcolon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultadoDcolon + " Colones CR");
	}
	
	public void EuroColones(double valor) {
		double resultadoEcolon = valor * Euro;
		resultadoEcolon = (double) Math.round(resultadoEcolon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultadoEcolon + " Colones CR");
	}
	
	public void LibrasExtColones(double valor) {
		double resultadoLcolon = valor * LibraExt;
		resultadoLcolon = (double) Math.round(resultadoLcolon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultadoLcolon + " Colones CR");
	}
	
	public void YenJapColones(double valor) {
		double resultadoYcolon = valor * Yen;
		resultadoYcolon = (double) Math.round(resultadoYcolon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultadoYcolon + " Colones CR");
	}
	
	public void WonSurColones(double valor) {
		double resultadoWcolon = valor * Won;
		resultadoWcolon = (double) Math.round(resultadoWcolon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultadoWcolon + " Colones CR");
	}
	
}
