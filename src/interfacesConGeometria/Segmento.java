package interfacesConGeometria;

public class Segmento implements Comparable<Segmento>, Desplazable, EsParalelo{

	private Punto puntoA;
	private Punto puntoB;
	
	public Segmento(Punto puntoA, Punto puntoB ) throws InvalidSegmentoException {
		this.setSegmento(puntoA, puntoB) ;
		
	}

	
	private void setSegmento(Punto origen, Punto extremo) {
		
		if(origen.compareTo(extremo) == 0)
		throw new InvalidSegmentoException("No puede construirse con puntos iguales");
		this.puntoA = origen;
		this.puntoB = extremo;
		
	}


	public Double getLargo() {
		return puntoA.distanciaCon(puntoB);
	}
	
	@Override
	public boolean esParaleloAx() {
		return (this.puntoA.getY() == this.puntoB.getY());
	}

	@Override
	public boolean esParaleloAy() {
		return (this.puntoA.getX() == this.puntoB.getX());
	}

	
	@Override
	public boolean esParaleloAotro(EsParalelo otro) {
		if(otro instanceof Segmento) {
			Segmento s = (Segmento) otro;
			double a = this.puntoA.getX() - this.puntoB.getX();
			double b = this.puntoA.getY() - this.puntoB.getY();
			double c = s.puntoA .getX() - s.puntoB.getX();
			double d = s.puntoA .getY() - s.puntoB.getY();
			return a/b == c/d;
 		}
		return false;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.puntoA.desplazar(deltaX, deltaY);
		this.puntoB.desplazar(deltaX, deltaY);
		
	}

	@Override
	public int compareTo(Segmento o) {
		return this.getLargo().compareTo(o.getLargo());
	}
	
	
}
