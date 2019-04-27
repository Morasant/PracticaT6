package practica6;

	/**
	 * Clase Moto
	 * Contiene información de cada moto (matrícula, cilindrada)
	 * Además contiene los getter y setters correspondientes
	 * @author Jesús Mora Santos
	 * @version 2.0
	 */
public class Moto {
	/**
	 * matrícula de la moto
	 */
	String matricula;
	/**
	 * cilindrada de la moto
	 */
	int cilindrada;

	/**
	 * Constructor por defecto
	 */
	public Moto() {
		matricula = "";
		cilindrada = 0;
	}

	/**
	 * Constructor con 2 parámetros
	 * @param m //matrícula de la moto
	 * @param c //cilindrada de la moto
	 */
	public Moto(String m, int c) {
		matricula = m;
		cilindrada = c;
	}

	/**
	 * @return matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @return cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * @param m //Cambia matricula
	 */
	public void setMatricula(String m) {
		matricula = m;
	}

	/**
	 * @param c //Cambia cilindrada
	 */
	public void setCilindrada(int c) {
		cilindrada = c;
	}
}
