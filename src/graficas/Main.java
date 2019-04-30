package graficas;

import java.io.IOException;
import java.util.HashMap;

import org.jfree.ui.RefineryUtilities;

public class Main {
	
	/*
	 * Tutil = Tejecucion/Ttotal; Tsincro = (entradasc - start) + (stop - salidaSC); Tejecucion =  salidaSC - entradaSC; Ttotal= stop - start
	 */
//	 public static final String GRAFICA = "Putil"; 
	 public static final String GRAFICA = "Tsincro"; 
//	 public static final String GRAFICA = "Tejecucion"; 
//	 public static final String GRAFICA = "Ttotal";
	 
	 //Si nuevo está a true se carga la tabla anterior
	 public static final boolean NUEVO = false;
//	 public static final boolean NUEVO = true;
	 
	 
	 
	public static void main(String[] args) throws IOException {

		HashMap<Integer, Long> valores = new HashMap<Integer, Long>();
		HashMap<Integer, Proceso> procesos = Parser.parse("logs/log1.txt");
		long vmedio = 0;
		for ( Integer key : procesos.keySet() ) {
			switch (GRAFICA) {
			case "Putil":
				vmedio += procesos.get(key).getPutil();
				break;
			case "Tsincro":
				vmedio += procesos.get(key).getTsincro();
				break;
			case "Tejecucion":
				vmedio += procesos.get(key).getTejecucion();
				break;
			case "Ttotal":
				vmedio += procesos.get(key).getTtotal();
				break;

			default:
				break;
			}
		}

		valores.put(1, vmedio/procesos.keySet().size());
		
		procesos = Parser.parse("logs/log2.txt");
		vmedio = 0;
		for ( Integer key : procesos.keySet() ) {
			switch (GRAFICA) {
			case "Putil":
				vmedio += procesos.get(key).getPutil();
				break;
			case "Tsincro":
				vmedio += procesos.get(key).getTsincro();
				break;
			case "Tejecucion":
				vmedio += procesos.get(key).getTejecucion();
				break;
			case "Ttotal":
				vmedio += procesos.get(key).getTtotal();
				break;

			default:
				break;
			}
		}

		valores.put(2, vmedio/procesos.keySet().size());
		
		procesos = Parser.parse("logs/log3.txt");
		vmedio = 0;
		for ( Integer key : procesos.keySet() ) {
			switch (GRAFICA) {
			case "Putil":
				vmedio += procesos.get(key).getPutil();
				break;
			case "Tsincro":
				vmedio += procesos.get(key).getTsincro();
				break;
			case "Tejecucion":
				vmedio += procesos.get(key).getTejecucion();
				break;
			case "Ttotal":
				vmedio += procesos.get(key).getTtotal();
				break;

			default:
				break;
			}
		}

		valores.put(3, vmedio/procesos.keySet().size());
		

		procesos = Parser.parse("logs/log4.txt");
		vmedio = 0;
		for ( Integer key : procesos.keySet() ) {
			switch (GRAFICA) {
			case "Putil":
				vmedio += procesos.get(key).getPutil();
				break;
			case "Tsincro":
				vmedio += procesos.get(key).getTsincro();
				break;
			case "Tejecucion":
				vmedio += procesos.get(key).getTejecucion();
				break;
			case "Ttotal":
				vmedio += procesos.get(key).getTtotal();
				break;

			default:
				break;
			}
		}

		valores.put(4, vmedio/procesos.keySet().size());
		

		procesos = Parser.parse("logs/log5.txt");
		vmedio = 0;
		for ( Integer key : procesos.keySet() ) {
			switch (GRAFICA) {
			case "Putil":
				vmedio += procesos.get(key).getPutil();
				break;
			case "Tsincro":
				vmedio += procesos.get(key).getTsincro();
				break;
			case "Tejecucion":
				vmedio += procesos.get(key).getTejecucion();
				break;
			case "Ttotal":
				vmedio += procesos.get(key).getTtotal();
				break;

			default:
				break;
			}
		}

		valores.put(5, vmedio/procesos.keySet().size());
		
		LineChart_AWT chart = new LineChart_AWT("Grafica de Procesos", "Procesos de pago", valores, NUEVO);

		chart.pack();
		RefineryUtilities.centerFrameOnScreen(chart);
		chart.setVisible(true);
	}
}
