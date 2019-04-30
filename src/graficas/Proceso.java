package graficas;

public class Proceso {
	
	private int identificador;
	private long start;
	private long despertar;
	private long entradaSC;
	private long salidaSC;
	private long stop;
	
	public long getTespera() {
		return despertar - start;
	}

	public long getTsincro() {
		return (entradaSC - despertar) + (stop - salidaSC);
	}

	public long getTejecucion() {
		return salidaSC - entradaSC;
	}

	public long getTtotal() {
		return stop - start;
	}
	
	/**
	 * @param identificador
	 * @param start
	 * @param despertar
	 * @param entradaSC
	 * @param salidaSC
	 * @param stop
	 */
	public Proceso(int identificador, long start, long despertar, long entradaSC, long salidaSC, long stop) {
		this.identificador = identificador;
		this.start = start;
		this.despertar = despertar;
		this.entradaSC = entradaSC;
		this.salidaSC = salidaSC;
		this.stop = stop;
	}
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the start
	 */
	public long getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(long start) {
		this.start = start;
	}
	/**
	 * @return the despertar
	 */
	public long getDespertar() {
		return despertar;
	}
	/**
	 * @param despertar the despertar to set
	 */
	public void setDespertar(long despertar) {
		this.despertar = despertar;
	}
	/**
	 * @return the entradaSC
	 */
	public long getEntradaSC() {
		return entradaSC;
	}
	/**
	 * @param entradaSC the entradaSC to set
	 */
	public void setEntradaSC(long entradaSC) {
		this.entradaSC = entradaSC;
	}
	/**
	 * @return the salidaSC
	 */
	public long getSalidaSC() {
		return salidaSC;
	}
	/**
	 * @param salidaSC the salidaSC to set
	 */
	public void setSalidaSC(long salidaSC) {
		this.salidaSC = salidaSC;
	}
	/**
	 * @return the stop
	 */
	public long getStop() {
		return stop;
	}
	/**
	 * @param stop the stop to set
	 */
	public void setStop(long stop) {
		this.stop = stop;
	}
}
