package graficas;

public class Entrada {
	private long tiempo;
	private String funcion;
	/**
	 * @param tiempo
	 * @param funcion
	 * @param proceso
	 */
	public Entrada(long tiempo, String funcion, int proceso) {
		this.tiempo = tiempo;
		this.funcion = funcion;
		this.proceso = proceso;
	}
	private int proceso;
	/**
	 * @return the tiempo
	 */
	public long getTiempo() {
		return tiempo;
	}
	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	/**
	 * @return the funcion
	 */
	public String getFuncion() {
		return funcion;
	}
	/**
	 * @param funcion the funcion to set
	 */
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	/**
	 * @return the proceso
	 */
	public int getProceso() {
		return proceso;
	}
	/**
	 * @param proceso the proceso to set
	 */
	public void setProceso(int proceso) {
		this.proceso = proceso;
	}
	 	
}
