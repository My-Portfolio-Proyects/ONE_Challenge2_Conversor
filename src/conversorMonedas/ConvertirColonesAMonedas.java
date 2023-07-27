package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirColonesAMonedas {
	
	private static final double Dolar = 538;
	private static final double Euro = 598.33;
	private static final double LibraExt = 698.29;
	private static final double Yen = 3.84;
	private static final double Won = 0.42;
	
	public void ColonesDolar(double valor) {
		double resultadoDolar = valor /Dolar;
		resultadoDolar = (double) Math.round(resultadoDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + resultadoDolar + " Dolares");
	}
	
	public void ColonesEuro(double valor) {
		double resultadoEuro = valor /Euro;
		resultadoEuro = (double) Math.round(resultadoEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + resultadoEuro + " Euros");
	}
	
	public void ColonesLibrasExt(double valor) {
		double resultadoLibrasExt = valor /LibraExt;
		resultadoLibrasExt = (double) Math.round(resultadoLibrasExt * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + resultadoLibrasExt + " Libras Exterlinas");
	}
	
	public void ColonesYenJap(double valor) {
		double resultadoYen = valor / Yen;
		resultadoYen = (double) Math.round(resultadoYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + resultadoYen + " Yenes");
	}
	
	public void ColonesWonSur(double valor) {
		double resultadoWonSur = valor / Won;
		resultadoWonSur = (double) Math.round(resultadoWonSur * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + resultadoWonSur + " Wones");
	}
}
