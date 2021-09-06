package interfacesConGeometria;
/*
 * Se lanza cuando un círculo recibe un radio negativo o Cero,
 * lo que imposibilita crear la figura
 */

@SuppressWarnings("serial")
public class InvalidRadioException extends RuntimeException {

	public InvalidRadioException(String string) {
		super(string);
	}
}
