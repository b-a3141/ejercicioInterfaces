package interfacesConGeometria;

public abstract class Figura implements Desplazable, Comparable<Figura>{
	
	private Punto punto;
	
	public Figura(Punto centro) {
		this.punto = centro;
	}
	
	public abstract Double getArea();
	
	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.punto.desplazar(deltaX, deltaY);
	}

	public int compareTo(Figura otraFigura) {
		return this.getArea().compareTo(otraFigura.getArea());
	}
}
