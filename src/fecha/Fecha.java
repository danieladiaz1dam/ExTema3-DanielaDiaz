package fecha;

/**
 * Clase Fecha.
 * 
 * Realiza varias operaciones con fechas
 * 
 * @author DanielaDiaz
 * @version 1.0.0
 */
public class Fecha {
<<<<<<< HEAD
	public static final int DIEZ = 10;
	private int dia; //d�a
	private int mes; //mes
	private int anio; //a�o
=======
	/**
	 * dia
	 */
	private int d;
	/**
	 * Mes
	 */
	private int m;
	/**
	 * Año
	 */
	private int a;
>>>>>>> Javadoc

	/**
	 * Constructor vacío
	 */
	public Fecha() {

	}

	/**
	 * Constructor
	 * 
	 * @param dia  Dia de una fecha
	 * @param mes  Mes de una fecha
	 * @param anio Año de una fecha
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	/**
	 * Comprueba la fecha es correcta
	 * 
	 * @return true si la fecha es correcta, false en caso contrario
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;
		
		anioCorrecto = anio > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		boolean diaMayor1 = dia >= 1;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && dia <= 29;
			} else {
				diaCorrecto = diaMayor1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && dia <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

<<<<<<< HEAD
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
=======
	/**
	 * Solo lo usa fechaCorrecta, por eso es privado
	 * 
	 * @return true si el año es bisiesto, false en caso contrario
	 */
>>>>>>> Javadoc
	private boolean esBisiesto() {
		boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
		return esBisiesto;
	}

<<<<<<< HEAD
	// M�todo diaSiguiente
	public void nextDay() {
		dia++;
=======
	/**
	 * Suma un dia a la fecha
	 */
	public void diaSiguiente() {
		d++;
>>>>>>> Javadoc
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				anio++;
			}
		}
	}

<<<<<<< HEAD
	// M�todo toString
=======
	/**
	 * Devuelve un String con la fecha (dd-mm-aaaa)
	 * @return String
	 */
>>>>>>> Javadoc
	public String toString() {
		String result = "";
		
		if (dia < DIEZ && mes < DIEZ) {
			result = "0" + dia + "-0" + mes + "-" + anio;
		} else if (dia < DIEZ && mes >= DIEZ) {
			result = "0" + dia + "-" + mes + "-" + anio;
		} else if (dia >= DIEZ && mes < DIEZ) {
			result = dia + "-0" + mes + "-" + anio;
		} else {
			result =  dia + "-" + mes + "-" + anio;
		}
		
		return result;
	}

}
