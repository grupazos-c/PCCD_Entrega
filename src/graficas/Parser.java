package graficas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Parser {
	public static HashMap<Integer, Proceso> parse(String file) throws IOException {


		HashMap<Integer, Proceso> procesos = new HashMap<Integer, Proceso>();
		ArrayList<Entrada> entradas = new ArrayList<>();
		
		File fichero = new File(file);

		BufferedReader br = new BufferedReader(new FileReader(fichero));

		while (true) {
			String linea = "";
			try {
				linea = br.readLine();
				linea.equals("hola");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				break;
			}
				String[] valores = linea.split(":");
				long tiempo = Long.parseLong(valores[0]);
				int id_proceso = Integer.parseInt(valores[1]);
				String funcion = valores[2];
				
				entradas.add(new Entrada(tiempo, funcion, id_proceso));
		}
		
		for (Entrada entrada : entradas) {
			if (!procesos.containsKey(entrada.getProceso())) {
				procesos.put(entrada.getProceso(), new Proceso(entrada.getProceso(), 0, 0, 0, 0, 0));
			} 
			Proceso temporal = procesos.get(entrada.getProceso());
			switch (entrada.getFuncion()) {
			case "start":
				temporal.setStart(entrada.getTiempo());
				break;
			case "despertar":
				temporal.setDespertar(entrada.getTiempo());
				break;
			case "entradaSC":
				temporal.setEntradaSC(entrada.getTiempo());
				break;
			case "salidaSC":
				temporal.setSalidaSC(entrada.getTiempo());
				break;
			case "stop":
				temporal.setStop(entrada.getTiempo());
				break;

			default:
				break;
			}
		}
		
		br.close();
		return procesos;
	}

}
