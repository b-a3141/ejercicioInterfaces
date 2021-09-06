package interfacesConGeometria;

public class Cuadrado extends Figura {

	private double lado;
	public Cuadrado(Punto inferiorIzquierdo, Double lado) throws InvalidCuadradoException{
		super(inferiorIzquierdo);
		this.setLado(lado);
		
	}

	private void setLado(Double lado)  {
		if (lado <= 0) 
			throw new InvalidCuadradoException("Lado negativo o Cero");
			this.lado = lado;
		
	}

	@Override
	public Double getArea() {
		return Math.pow(lado, 2);
	}

}
