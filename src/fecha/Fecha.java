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
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	/**
	 * Comprueba la fecha es correcta
	 * 
	 * @return true si la fecha es correcta, false en caso contrario
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Solo lo usa fechaCorrecta, por eso es privado
	 * 
	 * @return true si el año es bisiesto, false en caso contrario
	 */
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	/**
	 * Suma un dia a la fecha
	 */
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	/**
	 * Devuelve un String con la fecha (dd-mm-aaaa)
	 * @return String
	 */
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
