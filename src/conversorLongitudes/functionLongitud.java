package conversorLongitudes;

import javax.swing.JOptionPane;

public class functionLongitud {

	ConvertirLongitudes longitud = new ConvertirLongitudes();

	public void ConvertirLongitud(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Longitud",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Metros a Pies", "Metros a Pulgadas" ,"Metros a Millas" , "Pies a Metros" ,
						"Pulgadas a Metros", "Millas a Metros"},
				"Seleccion")).toString();
		switch (opcion) {
		case "Metros a Pies":
			longitud.metrosApies(Minput);
			break;
		case "Metros a Pulgadas":
			longitud.metrosApulgadas(Minput);
			break;
		case "Metros a Millas":
			longitud.metrosAmillas(Minput);
			break;
		case "Pies a Metros":
			longitud.piesAMetros(Minput);
			break;
		case "Pulgadas a Metros":
			longitud.pulgadasAMetros(Minput);
			break;
			
		case "Millas a Metros":
			longitud.millasAMetros(Minput);
			break;
		}
	}

}
