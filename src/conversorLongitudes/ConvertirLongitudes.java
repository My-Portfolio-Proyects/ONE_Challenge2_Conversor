package conversorLongitudes;

import javax.swing.JOptionPane;

public class ConvertirLongitudes {
	private static final double PIES_A_METROS = 0.3048;
    private static final double PULGADAS_A_METROS = 0.0254;
    private static final double MILLAS_A_METROS = 1609.34;
    
    public void metrosApies(double metros) {
    	double pies = metros / PIES_A_METROS;
    	pies = (double) Math.round(pies * 100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de " + metros + " es: " + pies + " pies");
    }

    public void metrosApulgadas(double metros) {
    	double pulgadas = metros / PULGADAS_A_METROS;
    	pulgadas = (double) Math.round(pulgadas * 100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de " + metros + " es: " + pulgadas + " pulgadas");
    }
    
    public void metrosAmillas(double metros) {
    	double millas = metros / MILLAS_A_METROS;
    	millas = (double) Math.round(millas * 100d)/100;
		JOptionPane.showMessageDialog(null, "El resultado de " + metros + " es: " + millas + " millas");
    } 
    
    public void piesAMetros(double pies) {
        double metros = pies * PIES_A_METROS;
        metros = (double) Math.round(metros * 100d) / 100;
        JOptionPane.showMessageDialog(null, "El resultado de " + pies + " pies es: " + metros + " metros");
    }

    public void pulgadasAMetros(double pulgadas) {
        double metros = pulgadas * PULGADAS_A_METROS;
        metros = (double) Math.round(metros * 100d) / 100;
        JOptionPane.showMessageDialog(null, "El resultado de " + pulgadas + " pulgadas es: " + metros + " metros");
    }

    public void millasAMetros(double millas) {
        double metros = millas * MILLAS_A_METROS;
        metros = (double) Math.round(metros * 100d) / 100;
        JOptionPane.showMessageDialog(null, "El resultado de " + millas + " millas es: " + metros + " metros");
    }
        
}
