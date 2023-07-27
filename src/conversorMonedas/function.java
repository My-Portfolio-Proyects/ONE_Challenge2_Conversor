package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirColonesAMonedas monedas = new ConvertirColonesAMonedas();
	ConvertirMonedasAColones colones = new ConvertirMonedasAColones();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Colones a Dolar", "De Colones a Euro", "De Colones a Libras","De Colones a Yen","De Colones a Won Coreano","De Dolar a Colones", "De Euro a Colones", "De Libras a Colones","De Yen a Colones","De Won Coreano a Colones"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Colones a Dolar":
        	monedas.ColonesDolar(Minput);
        	break;
        case "De Colones a Euro":
        	monedas.ColonesEuro(Minput);
        	break;
        case "De Colones a Libras":
        	monedas.ColonesLibrasExt(Minput);
        	break;
        case "De Colones a Yen":
        	monedas.ColonesYenJap(Minput);
        	break;
        case "De Colones a Won Coreano":
        	monedas.ColonesWonSur(Minput);
        	break;    	    	                          
        case "De Dolar a Colones":
        	colones.DolarColones(Minput);
        	break;
        case "De Euro a Colones":
        	colones.EuroColones(Minput);
        	break;
        case "De Libras a Colones":
        	colones.LibrasExtColones(Minput);
        	break;
        case "De Yen a Colones":
        	colones.YenJapColones(Minput);
        	break;
        case "De Won Coreano a Colones":
        	colones.WonSurColones(Minput);
            break;
        }      
    }
        
}
