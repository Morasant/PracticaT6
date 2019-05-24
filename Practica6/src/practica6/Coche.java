package practica6;

	/**
	 * Clase Coche
	 * Contiene información de cada coche (matrícula, combustible, modelo y fabricante)
	 * Además contiene los métodos AtributosCoche, ConsumoCocheA, ConsumoCocheB y ConsumoCocheC
	 * @author Jesús Mora Santos
	 * @version 2.0
	 */
public class Coche {
	
	private static final String TEXT = "es un ";
	
	private String resultado;
	
	/**
	 * Matrícula del coche
	 */
	String matricula;
	/**
	 * Combustible que usa el coche 
	*/
	String combustible;
	/** 
	 * Modelo del coche 
	*/
	String modelo;
	/**
	 * Fabricante del coche
	 */
	String fabricante;

	/**
	 * Constructor por defecto
	 */
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con 4 parámetros
	 * @param m //matricula del coche
	 * @param c //combustible que usa el coche
	 * @param mo //modelo del coche
	 * @param f //fabricante del coche
	 */
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	/**
	 * Método AtributosCoche
	 * Describe los atributos de los coches dependiendo del tipo de combustible que utilizan
	 * @return <ul>
	 * 			  <li>"Gasolina": "El coche con matricula " + matricula + " " + ConsumoCocheA</li>
	 * 			  <li>"Diesel": "El coche con matricula " + matricula + " " + ConsumoCocheB</li>
	 * 			  <li>"Híbrido": "El coche con matricula " + matricula + " " + ConsumoCocheC</li>
	 * 			  <li> Por defecto: "El coche con matricula " + matricula + " " + "no dispone de información"</li> 
	 * 		   </ul>
	 */
	public String AtributosCoche() {

		String texto = "El coche con matricula ";
		switch (combustible) {
		case "Gasolina": 
			resultado = texto + matricula + " " + ConsumoCocheA("Corsa", "Opel");
			break;
		case "Diesel":
			resultado = texto + matricula + " " + ConsumoCocheB("Ibiza", "Seat");
			break;
		case "Híbrido":
			resultado = texto + matricula + " " + ConsumoCocheC("Getz", "Hyundai");
			break;
		default:
			resultado = texto + matricula + " " + "no dispone de información";
			break;
		}
		return resultado;
	}
	/**
	 * Método ConsumoCocheA
	 * Define lo que gasta un coche en función de su fabricante y modelo
	 * @param modelo modelo del coche
	 * @param fabricante fabricante del coche
	 * @return <p>"es un " + fabricante + modelo + " y gasta 1,337 euros por litro"</p>
	 */
	public String ConsumoCocheA(String modelo, String fabricante) {
		
		resultado = TEXT + fabricante + modelo + " y gasta 1,337 euros por litro";
		
		return resultado;	
	}
	/**
	 * Método ConsumoCocheB
	 * Define lo que gasta un coche en función de su fabricante y modelo
	 * @param modelo modelo del coche
	 * @param fabricante fabricante del coche
	 * @return <p>"es un " + fabricante + modelo + " y gasta 1,052 euros por litro"</p>
	 */
	public String ConsumoCocheB(String modelo, String fabricante) {

		resultado = TEXT + fabricante + modelo + " y gasta 1,052 euros por litro";
		
		return resultado; 
	}
	/**
	 * Método ConsumoCocheA
	 * Define lo que gasta un coche en función de su fabricante y modelo
	 * @param modelo modelo del coche
	 * @param fabricante fabricante del coche
	 * @return <p>"es un " + fabricante + modelo + " y no necesita combustible"</p>
	 */
	public String ConsumoCocheC(String modelo, String fabricante) {

		resultado = TEXT + fabricante + modelo + " y no necesita combustible";
		
		return resultado;
	}
	
}
