package interfacesConGeometria;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(Punto centro, double radio) throws InvalidRadioException{
		super(centro);
		setRadio(radio);
	}

	private void setRadio(double radio) {
		if (radio <= 0) 
			throw new InvalidRadioException("radio negativo o Cero");
			this.radio = radio;
				
	}

	@Override
	public Double getArea() {
		return Math.PI * Math.pow(this.radio,2);
	}

	
	

}
