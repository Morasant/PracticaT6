package practica6;

public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String AtributosCoche() {
		String resultado = "";
		String texto = "El coche con matricula ";
		switch (combustible) {
		case "Gasolina": 
			resultado += texto + matricula + " ";
			resultado += ConsumoCocheA(modelo, fabricante);
			break;
		case "Diesel":
			resultado += texto + matricula + " ";
			resultado += ConsumoCocheB(modelo, fabricante);
			break;
		case "Híbrido":
			resultado += texto + matricula + " ";
			resultado += ConsumoCocheC(modelo, fabricante);
			break;
		default:
			resultado += texto + matricula + " ";
			resultado += "no dispone de información";
			break;
		}
		return resultado;
	}
}
